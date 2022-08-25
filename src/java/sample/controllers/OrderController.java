/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.DB.Cart;
import sample.DB.DAO;
import sample.DB.Iterm;
import sample.DB.Order;
import sample.DB.OrderDetail;
import sample.DB.Product;
import sample.DB.User;

/**
 *
 * @author PhongNha
 */
@WebServlet(name = "OrderController", urlPatterns = {"/OrderController"})
public class OrderController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Random rand = new Random();
        
        Cart cart = (Cart) session.getAttribute("cart");
        List<Iterm> list = cart.getIterms();
        User user = (User) session.getAttribute("log");

        DAO dao = new DAO();
        List<Order> listO = dao.getListOrder();
        List<OrderDetail> listOD = dao.getListOrderDetail();

        //order
        String userID = user.getUserID();
        float total = cart.getSumPrice();
        String Total = String.valueOf(total);
        LocalDate localDate = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String orderDate = localDate.format(formatter);
        int orderID = 0, Oder;
        for (Order order : listO) {
            orderID = rand.nextInt(100) + 10;
            Oder = Integer.parseInt(order.getOrderID());
            if (orderID != Oder) {
                break;
            }
        }
        String OrderID = String.valueOf(orderID);
        boolean addO = dao.createOrder(OrderID, orderDate, Total, userID);

        //oderdetail
        for (Iterm iterm : list) {
            //----------
            int randomID = rand.nextInt(100) + 10;
            String detailID = "od" + randomID;
            //----------
            float price = iterm.getProduct().getPrice();
            String Price = String.valueOf(price);
            int quantity = iterm.getQuantity();
            String Quantity = String.valueOf(quantity);
            String product = iterm.getProduct().getProductID();
            String ID = product;
            boolean addOD = dao.createOrderDetail(detailID, Price, Quantity, OrderID, product);
            
            //----------------------------
            Product getProduct = dao.getProductByID(ID);
            int newQuantity = getProduct.getQuantity() - quantity;
            String NewQuantity = String.valueOf(newQuantity);
            String PriceP = String.valueOf(getProduct.getPrice());
            boolean newProduct = dao.updateProduct(ID, getProduct.getProductName(), getProduct.getImage(), PriceP , NewQuantity, getProduct.getCategoryID(), getProduct.getImportDate(), getProduct.getUsingDate());
        }
        
        list.removeAll(list);
        cart.setIterms(list);
        request.getRequestDispatcher("ShopController").forward(request, response);
        
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
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
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
