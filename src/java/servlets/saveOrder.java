/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import JDBC.connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class saveOrder extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String name=request.getParameter("name");
        String phone=request.getParameter("phone");     
        String cloth=request.getParameter("cloth");
        String color=request.getParameter("color");
        String catigory=request.getParameter("catigory");
        
        
        connection conn=new connection();
        Statement st=conn.con();
        String sql="insert into orders values('"+email+"','"+password+"','"+name+"','"+phone+"','"+cloth+"','"+color+"','"+catigory+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(saveOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Saving Order</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3 align=center>The Operation is done</h3>");
            out.println("<h3 align=center><a href=index.jsp>For Return To Home Page </a></h3>");           
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
