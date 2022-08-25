package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Login 05</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Login/css/style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"ftco-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-md-6 text-center mb-5\">\n");
      out.write("                        <h2 class=\"heading-section\">Login</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-md-7 col-lg-5\">\n");
      out.write("                        <div class=\"wrap\">\n");
      out.write("                            <div class=\"img\" style=\"background-image: url(images/bg-1.jpg);\"></div>\n");
      out.write("                            <div class=\"login-wrap p-4 p-md-5\">\n");
      out.write("                                <div class=\"d-flex\">\n");
      out.write("                                    <div class=\"w-100\">\n");
      out.write("                                        <h3 class=\"mb-4\">Sign In</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"w-100\">\n");
      out.write("                                        <p class=\"social-media d-flex justify-content-end\">\n");
      out.write("                                            <a href=\"#\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                                            <a href=\"#\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <form action=\"MainController\" method =\"POST\">\n");
      out.write("                                    <div class=\"form-group mt-3\">\n");
      out.write("                                        <input class=\"form-control\" type =\"text\" name=\"userID\" required=\"\"/>\n");
      out.write("                                        <label class=\"form-control-placeholder\" for=\"userID\">UserID</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input id=\"password-field\" type=\"password\" class=\"form-control\"  name=\"password\" required=\"\"/>\n");
      out.write("                                        <label class=\"form-control-placeholder\" for=\"password\">Password</label>\n");
      out.write("                                        <span toggle=\"#password-field\" class=\"fa fa-fw fa-eye field-icon toggle-password\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <button name=\"action\" value=\"Login\" type=\"submit\" class=\"form-control btn btn-primary rounded submit px-3\">Sign In</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <script src=\"Login/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Login/js/popper.js\"></script>\n");
      out.write("        <script src=\"Login/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"Login/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
