<%-- 
    Document   : showOrders
    Created on : Feb 7, 2024, 11:32:19 PM
    Author     : user
--%>

<%@page import="java.util.List"%>
<%@page import="data.orders"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Orders Page</title>
    </head>
    <body>

        <h2 align="center"><mark>Your Orders</mark></h2>

        
        <table align="center" width="100%" border="1">
            <thead>
                <tr>
                    <th>Catigory</th>
                    <th>ProductID</th>                    
                    <th>color</th>
                   <th>Price</th>
                    <th>process</th>


                </tr>
            </thead>
            <tbody>

               
                <%
               List<orders>list=(List<orders>)request.getSession().getAttribute("ordersList");
               for(int i=0;i<list.size();i++){
               %>
                
                
                <tr>
                    <td align="center"><%= list.get(i).getCat()%> </td>
                    <td align="center"><%= list.get(i).getPro()%></td>
                    <td align="center"><%= list.get(i).getColor()%></td>
                    <td align="center"><%= list.get(i).getPrice()%></td>
                    <td align="center"><a href="cancelOrderURL?index=<%= i %>"><button name="cancel" >Cancel</button></a></td>
                </tr>
               
                <%}%>

            </tbody>


        </table>

    </body>
</html>
