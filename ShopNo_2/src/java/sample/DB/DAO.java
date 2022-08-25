/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ptm = null;
    ResultSet rs = null;

    private static final String LOGIN = "SELECT fullName, roleID, roleID, address, phone, birthday FROM tblUsers WHERE userID=? AND password=?";
    private static final String PRODUCT = " SELECT * FROM tblProduct";
    private static final String ORDER = " SELECT * FROM tblOrder";
    private static final String ORDERDETAIL = " SELECT * FROM tblOrderDetail";
    private static final String USER = " SELECT * FROM tblUsers";
    private static final String CATEGORY = " SELECT * FROM tblCategory";
    private static final String PRODUCT_CATEGORY = " SELECT * FROM tblProduct WHERE categoryID= ?";
    private static final String SEARCH = " SELECT * FROM tblProduct WHERE [productName] LIKE ?";
    private static final String DELETE = "DELETE tblUsers WHERE userID = ?";
    private static final String UPDATE_PRODUCT = "UPDATE tblProduct SET productID = ?, productName = ?, image = ?, price = ?, quantity = ?, categoryID = ?, importDate = ?, usingDate = ? WHERE productID = ?";
    private static final String UPDATE_USER = "UPDATE tblUsers SET userID = ?, fullName = ?, password = ?, roleID = ?, address = ?, phone = ?, birthday = ? WHERE userID = ?";
    private static final String CREATE_USER = "INSERT INTO tblUsers(userID,fullName,password,roleID,address,phone,birthday) VALUES (?,?,?,?,?,?,?)";
    private static final String CREATE_PRODUCT = "INSERT INTO tblProduct(productID,productName,image,price,quantity,categoryID,importDate,usingDate) VALUES (?,?,?,?,?,?,?,?)";
    private static final String CREATE_ORDER = "INSERT INTO tblOrder(orderID,orderDate,total,userID) VALUES (?,?,?,?)";
    private static final String CREATE_ORDERDETAIL = "INSERT INTO tblOrderDetail(detailID,price,quantity,orderID,productID) VALUES (?,?,?,?,?)";
    private static final String CHECK_DUPLICATE = "SELECT fullName FROM tblUsers WHERE userID=?";
    private static final String PRODUCT_BY_ID = "SELECT * FROM tblProduct WHERE productID = ?";
    private static final String USER_BY_ID = "SELECT * FROM tblUsers WHERE userID = ?";

    public List<Product> getListProduct() throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(PRODUCT);
            rs = ptm.executeQuery();
            int a;
            float b;
            while (rs.next()) {
                a = Integer.parseInt(rs.getString(5));
                b = Float.parseFloat(rs.getString(4));
                list.add(new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        b,
                        a,
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }
    
    public List<Order> getListOrder() throws SQLException {
        List<Order> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(ORDER);
            rs = ptm.executeQuery();
            float a;
            while (rs.next()) {
                a = Float.parseFloat(rs.getString(3));
                list.add(new Order(
                        rs.getString(1),
                        rs.getString(2),
                        a,
                        rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

public List<OrderDetail> getListOrderDetail() throws SQLException {
        List<OrderDetail> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(ORDER);
            rs = ptm.executeQuery();
            int a;
            float b;
            while (rs.next()) {
                a = Integer.parseInt(rs.getString(3));
                b = Float.parseFloat(rs.getString(2));
                list.add(new OrderDetail(
                        rs.getString(1),
                        b,
                        a,
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }    
    
    public Product getProductByID(String ID) throws SQLException {
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(PRODUCT_BY_ID);
            ptm.setString(1, ID);
            rs = ptm.executeQuery();
            int a;
            float b;
            while (rs.next()) {
                a = Integer.parseInt(rs.getString(5));
                b = Float.parseFloat(rs.getString(4));
                return new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        b,
                        a,
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public User getUserByID(String ID) throws SQLException {
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(USER_BY_ID);
            ptm.setString(1, ID);
            rs = ptm.executeQuery();
            while (rs.next()) {
                return new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public List<Product> serchProduct(String productName) throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(SEARCH);
            ptm.setString(1, "%" + productName + "%");
            rs = ptm.executeQuery();
            int a;
            float b;
            while (rs.next()) {
                a = Integer.parseInt(rs.getString(5));
                b = Float.parseFloat(rs.getString(4));
                list.add(new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        b,
                        a,
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<Category> getListCategory() throws SQLException {
        List<Category> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(CATEGORY);
            rs = ptm.executeQuery();
            while (rs.next()) {
                list.add(new Category(
                        rs.getString(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<Product> getListProductByCategory(String categoryID) throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(PRODUCT_CATEGORY);
            ptm.setString(1, categoryID);
            rs = ptm.executeQuery();
            int a;
            float b;
            while (rs.next()) {
                a = Integer.parseInt(rs.getString(5));
                b = Float.parseFloat(rs.getString(4));
                list.add(new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        b,
                        a,
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public User checkLogin(String userID, String password) throws SQLException {
        User user = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(LOGIN);
            ptm.setString(1, userID);
            ptm.setString(2, password);
            rs = ptm.executeQuery();
            if (rs.next()) {
                String fullName = rs.getString("fullName");
                String roleID = rs.getString("roleID");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String birthday = rs.getString("birthday");
                user = new User(userID, fullName, " ", roleID, address, phone, birthday);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }

    public List<User> getListUser() throws SQLException {
        List<User> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(USER);
            rs = ptm.executeQuery();
            while (rs.next()) {
                list.add(new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean updateUser(String userID, String fullName, String password, String roleID, String address, String phone, String birthday) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE_USER);
                ptm.setString(1, userID);
                ptm.setString(2, fullName);
                ptm.setString(3, password);
                ptm.setString(4, roleID);
                ptm.setString(5, address);
                ptm.setString(6, phone);
                ptm.setString(7, birthday);
                ptm.setString(8, userID);
                check = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean updateProduct(String productID, String productName, String image, String price, String quantity, String categoryID, String importDate, String usingDate) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE_PRODUCT);
                ptm.setString(1, productID);
                ptm.setString(2, productName);
                ptm.setString(3, image);
                ptm.setString(4, price);
                ptm.setString(5, quantity);
                ptm.setString(6, categoryID);
                ptm.setString(7, importDate);
                ptm.setString(8, usingDate);
                ptm.setString(9, productID);
                check = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean createUser(String userID, String fullName, String password, String roleID, String address, String phone, String birthday) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CREATE_USER);
                ptm.setString(1, userID);
                ptm.setString(2, fullName);
                ptm.setString(3, password);
                ptm.setString(4, roleID);
                ptm.setString(5, address);
                ptm.setString(6, phone);
                ptm.setString(7, birthday);
                check = ptm.executeUpdate() > 0 ? true : false;
            }

        } catch (Exception e) {

        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean createProduct(String productID, String productName, String image, String price, String quantity, String categoryID, String importDate, String usingDate) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CREATE_PRODUCT);
                ptm.setString(1, productID);
                ptm.setString(2, productName);
                ptm.setString(3, image);
                ptm.setString(4, price);
                ptm.setString(5, quantity);
                ptm.setString(6, categoryID);
                ptm.setString(7, importDate);
                ptm.setString(8, usingDate);
                check = ptm.executeUpdate() > 0 ? true : false;
            }

        } catch (Exception e) {

        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    public boolean createOrder(String orderID, String orderDate, String total, String userID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CREATE_ORDER);
                ptm.setString(1, orderID);
                ptm.setString(2, orderDate);
                ptm.setString(3, total);
                ptm.setString(4, userID);
                check = ptm.executeUpdate() > 0 ? true : false;
            }

        } catch (Exception e) {

        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    public boolean createOrderDetail(String detailID, String price, String quantity, String orderID, String productID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CREATE_ORDERDETAIL);
                ptm.setString(1, detailID);
                ptm.setString(2, price);
                ptm.setString(3, quantity);
                ptm.setString(4, orderID);
                ptm.setString(5, productID);
                check = ptm.executeUpdate() > 0 ? true : false;
            }

        } catch (Exception e) {

        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public static void main(String[] args) throws SQLException {
        DAO dao = new DAO();
        boolean a = dao.createOrderDetail("od88","7","7","7","carr");
        System.out.println(a);
    }

}
