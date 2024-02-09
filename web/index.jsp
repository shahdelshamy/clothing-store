<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Clothing store</title>
        <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
    </head>

    <body>

        <%
            if (request.getSession().getAttribute("done") != null && request.getSession().getAttribute("done").equals("done")) {
        %>
        <jsp:include page="header/header2.html" />
        <% } else { %>
        <jsp:include page="header/header.html" />
        <% }%>



        <!-- About -->
        <table width="100%" id="about">
            <tr>
                <td align="center">
                    <h3><mark>About</mark></h3>
                </td>
            </tr>

            <tr align="center">
                <td><img src="images/storeImage.png" alt="" width="50%"></td>
            </tr>

            <tr>
                <td> Lorem ipsum dolor sit, amet consectetur adipisicing elit. Optio exercitationem quisquam sequi vero
                    repellendus. Sunt deserunt quas, assumenda tenetur beatae repudiandae. Suscipit sequi commodi ex nihil
                    amet nostrum accusamus voluptas! Lorem ipsum dolor sit, amet consectetur adipisicing elit. Optio
                    exercitationem quisquam sequi vero </td>
            </tr>

            <tr>
                <td align="center"> <a href="aboutStore.html">To Know More About Us</a></td>
            </tr>
        </table>

        <!-- Sections -->
        <table width="100%" id="sections">
            <tr>
                <td colspan="3" align="center">
                    <h3><mark>Sections</mark></h3>
                </td>
            </tr>

            <tr>
                <td width="33.33%">
                    <div>
                        <a href="coats.html"><img src="images/coats2.jpg" alt="" width="100%"></a>
                        <p><b>man Coats</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt ut
                            atque dolore</p>
                    </div>
                </td>
                <td width="33.33%">
                    <div>
                        <a href="wCoats.html"><img src="images/coats.jpeg" alt="" width="100%"></a>
                        <p><b>Woman Coats</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt
                            ut atque dolore</p>
                    </div>
                </td>
                <td width="33.33%">
                    <div>
                        <a href="wPantalons.html"><img src="images/clothes4.jpg" alt="" width="100%"></a>
                        <p><b>Woman Pantalons</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis
                            sunt ut atque dolore</p>
                    </div>
                </td>
            </tr>

            <tr>
                <td width="33.33%">
                    <div>
                        <a href="pantalons.html"><img src="images/pantalons.jpeg" alt="" width="100%"></a>
                        <p><b>Pantalons Gense</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis
                            sunt ut atque dolore</p>
                    </div>
                </td>
                <td width="33.33%">
                    <div>
                        <a href="TShirts.html"><img src="images/t-shirts.jpeg" alt="" width="100%"></a>
                        <p><b>T-shirts</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt ut
                            atque dolore</p>
                    </div>
                </td>
                <td width="33.33%">
                    <div>
                        <a href="suits.html"><img src="images/suits.jpeg" alt="" width="100%"></a>
                        <p><b>Suits</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt ut
                            atque dolore</p>
                    </div>
                </td>


            </tr>
        </table>
        <!-- Contact -->
        <table class="conatct" width="100%" id="contact">
            <tr>
                <td align="center">
                    <h3> <mark>Contact</mark> </h2>
                </td>
            </tr>


            <tr>
                <td>
                    <table width="100%" align="center">
                        <form action="" method="post">
                            <tr>
                                <td align="right"> <input type="text" placeholder="Your Name*" name="name"></td>
                                <td> <input type="number" placeholder="Your Phone*" name="phone"></td>
                            </tr>

                            <tr>
                                <td align="center" colspan="2">
                                    <textarea name="message" id="" cols="30" rows="10" placeholder="Your Message:*"
                                              name="Message"></textarea>
                                </td>
                            </tr>

                            <tr>
                                <td colspan="2" align="center">
                                    <input type="submit" value="submit">
                                </td>
                            </tr>
                        </form>
                    </table>

                    <!-- Footer -->

                    <table width="100%">
                        <tr>
                            <td align="right" colspan="3">
                                <h3> <mark>Social apps</mark> </h2>
                            </td>
                        </tr>

                        <tr>
                            <td width="70%"></td>
                            <td align="right"><a href="">Facebook</a></td>
                            <td align="center"><a href="">Whatsapp</a></td>
                            <td align="left"><a href="">Inatagram</a></td>
                        </tr>
                    </table>

                    <hr>
                    <p align="center">&copy;SHAHD&#128522;ELSHAMY</p>

                    </body>

                    </html>