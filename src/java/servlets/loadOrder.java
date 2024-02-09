/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import JDBC.connection;
import data.orders;
import data.person;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class loadOrder extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ResultSet rs;
        System.out.println("dddddddddddddddddd");

        connection conn = new connection(); // assuming Connection is your database connection class
        Statement st = conn.con();
        Statement st1 = conn.con();
        person p = (person) request.getSession().getAttribute("person");

        if (p != null) {
            String email = p.getEmail();
            String password = p.getPassword();
            List<orders> list = new ArrayList<>();
            System.out.println(email + password);

            String sql = "SELECT catigory, cloth, color FROM orders WHERE email='" + email + "' AND password='" + password + "'";

            try {
                rs = st.executeQuery(sql);
                System.out.println("ssssssssssssssss");
                while (rs.next()) {
                    orders o = new orders();
                    String category = rs.getString(1); // Check column name or alias
                    String cloth = rs.getString(2);
                    String color = rs.getString(3);
                    String price = null;
                    String sql1 = "SELECT price FROM price WHERE product = '" + cloth + "' AND catigory = '" + category + "'";

                    try (ResultSet rs1 = st1.executeQuery(sql1)) {
                        if (rs1.next()) {
                            price = rs1.getString("price");
                            System.out.println("ppppppppppppp");
                        } else {
                            // Handle case when no price is found
                            System.out.println("No price found for category: " + category + " and cloth: " + cloth);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(loadOrder.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    // Handle NULL values if necessary
                    if (category != null && cloth != null && color != null && price != null) {
                        o.setCat(category);
                        o.setPro(cloth);
                        o.setColor(color);
                        o.setPrice(price);
                        list.add(o);
                    } else {
                        // Log a message or handle null values as appropriate
                        System.out.println("One or more columns contain NULL values");
                    }
                }
                rs.close();

                request.getSession().setAttribute("ordersList", list);
                response.sendRedirect("showOrders.jsp");
            } catch (SQLException ex) {
                Logger.getLogger(loadOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet loadOrder</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>hello</h3>");
        out.println("</body>");
        out.println("</html>");

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
        processRequest(request, response);
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
        processRequest(request, response);
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
