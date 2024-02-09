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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class cancelOrder extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
       person p=(person) request.getSession().getAttribute("person");
        String email=p.getEmail();
        String password=p.getPassword();
        
        connection conn=new connection();
        Statement st=conn.con();
        
        
               List<orders>list=(List<orders>)request.getSession().getAttribute("ordersList");
               
              int index=Integer.parseInt(request.getParameter("index"));
              String cloth=list.get(index).getPro();
              String catigory=list.get(index).getCat();
                   
            String sql="delete from orders where email='"+email+"' and password='"+password+"' and catigory='"+catigory+"' and cloth='"+cloth+"'";     
                          
            try {
               System.out.println(st.execute(sql));
               list.remove(index);
                response.sendRedirect("showOrders.jsp");                               
            } catch (SQLException ex) {
                Logger.getLogger(cancelOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cancelOrder</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cancelOrder at " + request.getContextPath() + "</h1>");
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
