package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Clothing store</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            if (request.getSession().getAttribute("done") != null && request.getSession().getAttribute("done").equals("done")) {
        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header2.html", out, false);
      out.write("\r\n");
      out.write("        ");
 } else { 
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.html", out, false);
      out.write("\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- About -->\r\n");
      out.write("        <table width=\"100%\" id=\"about\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\">\r\n");
      out.write("                    <h3><mark>About</mark></h3>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr align=\"center\">\r\n");
      out.write("                <td><img src=\"images/storeImage.png\" alt=\"\" width=\"50%\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td> Lorem ipsum dolor sit, amet consectetur adipisicing elit. Optio exercitationem quisquam sequi vero\r\n");
      out.write("                    repellendus. Sunt deserunt quas, assumenda tenetur beatae repudiandae. Suscipit sequi commodi ex nihil\r\n");
      out.write("                    amet nostrum accusamus voluptas! Lorem ipsum dolor sit, amet consectetur adipisicing elit. Optio\r\n");
      out.write("                    exercitationem quisquam sequi vero </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\"> <a href=\"aboutStore.html\">To Know More About Us</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <!-- Sections -->\r\n");
      out.write("        <table width=\"100%\" id=\"sections\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"3\" align=\"center\">\r\n");
      out.write("                    <h3><mark>Sections</mark></h3>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"33.33%\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"coats.html\"><img src=\"images/coats2.jpg\" alt=\"\" width=\"100%\"></a>\r\n");
      out.write("                        <p><b>man Coats</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt ut\r\n");
      out.write("                            atque dolore</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"33.33%\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"wCoats.html\"><img src=\"images/coats.jpeg\" alt=\"\" width=\"100%\"></a>\r\n");
      out.write("                        <p><b>Woman Coats</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt\r\n");
      out.write("                            ut atque dolore</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"33.33%\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"wPantalons.html\"><img src=\"images/clothes4.jpg\" alt=\"\" width=\"100%\"></a>\r\n");
      out.write("                        <p><b>Woman Pantalons</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis\r\n");
      out.write("                            sunt ut atque dolore</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"33.33%\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"pantalons.html\"><img src=\"images/pantalons.jpeg\" alt=\"\" width=\"100%\"></a>\r\n");
      out.write("                        <p><b>Pantalons Gense</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis\r\n");
      out.write("                            sunt ut atque dolore</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"33.33%\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"TShirts.html\"><img src=\"images/t-shirts.jpeg\" alt=\"\" width=\"100%\"></a>\r\n");
      out.write("                        <p><b>T-shirts</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt ut\r\n");
      out.write("                            atque dolore</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"33.33%\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"suits.html\"><img src=\"images/suits.jpeg\" alt=\"\" width=\"100%\"></a>\r\n");
      out.write("                        <p><b>Suits</b> Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit omnis sunt ut\r\n");
      out.write("                            atque dolore</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <!-- Contact -->\r\n");
      out.write("        <table class=\"conatct\" width=\"100%\" id=\"contact\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\">\r\n");
      out.write("                    <h3> <mark>Contact</mark> </h2>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <table width=\"100%\" align=\"center\">\r\n");
      out.write("                        <form action=\"\" method=\"post\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td align=\"right\"> <input type=\"text\" placeholder=\"Your Name*\" name=\"name\"></td>\r\n");
      out.write("                                <td> <input type=\"number\" placeholder=\"Your Phone*\" name=\"phone\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td align=\"center\" colspan=\"2\">\r\n");
      out.write("                                    <textarea name=\"message\" id=\"\" cols=\"30\" rows=\"10\" placeholder=\"Your Message:*\"\r\n");
      out.write("                                              name=\"Message\"></textarea>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"submit\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Footer -->\r\n");
      out.write("\r\n");
      out.write("                    <table width=\"100%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td align=\"right\" colspan=\"3\">\r\n");
      out.write("                                <h3> <mark>Social apps</mark> </h2>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"70%\"></td>\r\n");
      out.write("                            <td align=\"right\"><a href=\"\">Facebook</a></td>\r\n");
      out.write("                            <td align=\"center\"><a href=\"\">Whatsapp</a></td>\r\n");
      out.write("                            <td align=\"left\"><a href=\"\">Inatagram</a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <p align=\"center\">&copy;SHAHD&#128522;ELSHAMY</p>\r\n");
      out.write("\r\n");
      out.write("                    </body>\r\n");
      out.write("\r\n");
      out.write("                    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
