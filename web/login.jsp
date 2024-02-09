<%-- 
    Document   : login
    Created on : Feb 6, 2024, 11:19:20 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>

        <h2 align="center"> <mark>User Login</mark></h2>

        <form action="registrationURL" method="post">
            <table align="center" width="50%">
                <th align="right">Email Address*</th>
                <td><td><input type="email" required="" name="email" placeholder="Enter Your Email" /></td></td>
                </tr>
                <tr>
                    <td colspan="3"><br></td>
                </tr>
                <tr>
                    <th align="right">Password*</th>
                    <td><td><input type="password" required="" name="password" placeholder="*******" /></td></td>
                </tr>
                <tr>
                    <td colspan="3"><br></td>
                </tr>
                <tr>                  
                    <td colspan="3" align="center">
                        <input type="submit" value="Login"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="3"><br></td>
                </tr>
                 <tr>                  
                    <td colspan="3" align="center">
                        <a href="newAccount.html">Create New Account</a>
                    </td>
                </tr>
                

            </table>


        </form>



    </body>
</html>
