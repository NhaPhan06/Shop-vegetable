/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.DB.DAO;
import sample.DB.User;

/**
 *
 * @author PhongNha
 */
@WebServlet(name = "AddUserController", urlPatterns = {"/AddUserController"})
public class AddUserController extends HttpServlet {

    private static final String ERROR = "addUser.jsp";
    private static final String SUCCESS = "UserManagementController";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String userID = request.getParameter("pID");
        String userName = request.getParameter("pN");
        String pass = request.getParameter("pP1");
        String confirm = request.getParameter("pP2");
        String roleID = request.getParameter("pR");
        String address = request.getParameter("pA");
        String phone = request.getParameter("pPH");
        String birthday = request.getParameter("pB");
        DAO dao = new DAO();
        String url = SUCCESS;
        List<User> listU = dao.getListUser();
        for (User user : listU) {
            if(userID.equalsIgnoreCase(user.getUserID())){
                url = ERROR;
                break;
            }    
        }
        if(!pass.equals(confirm)){
            url = ERROR;
        }
        if(url == SUCCESS){
            boolean add = dao.createUser(userID, userName, pass, roleID, address, phone, birthday);
            if(add == false){
                url = ERROR;
            }
        }
        request.getRequestDispatcher(url).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddUserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddUserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
