package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!-- Basic -->\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <title>Freshshop - Ecommerce Bootstrap 4 HTML Template</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Site Icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- Site CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Start Main Top -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"main-top\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"login-box\">\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Main Top -->\n");
      out.write("\n");
      out.write("<!-- Start Main Top -->\n");
      out.write("<header class=\"main-header\">\n");
      out.write("    <!-- Start Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Start Header Navigation -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"login.html\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Header Navigation -->\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"ShopController\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">SHOP</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("            <!-- Start Atribute Navigation -->\n");
      out.write("            <div class=\"attr-nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"search\"><a href=\"#\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                    <li class=\"side-menu\">\n");
      out.write("                        <a href=\"CartController\">\n");
      out.write("                            <i class=\"fa fa-shopping-bag\"></i>\n");
      out.write("                            <span class=\"badge\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            <p>My Cart</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Atribute Navigation -->\n");
      out.write("        </div>\n");
      out.write("        <!-- Start Side Menu -->\n");
      out.write("        <!-- End Side Menu -->\n");
      out.write("    </nav>\n");
      out.write("    <!-- End Navigation -->\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("        <!-- End Main Top -->\n");
      out.write("\n");
      out.write("        <!-- Start Top Search -->\n");
      out.write("        <div class=\"top-search\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-search\"></i></span>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                    <span class=\"input-group-addon close-search\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Top Search -->\n");
      out.write("\n");
      out.write("        <!-- Start All Title Box -->\n");
      out.write("        <div class=\"all-title-box\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h2>Shop</h2>\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Shop</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("        <!-- Start Shop Page  -->\n");
      out.write("        <div class=\"shop-box-inner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-9 col-lg-9 col-sm-12 col-xs-12 shop-content-right\">\n");
      out.write("                        <div class=\"right-product-box\">\n");
      out.write("                            <div class=\"product-item-filter row\">\n");
      out.write("                                <div class=\"col-12 col-sm-8 text-center text-sm-left\">\n");
      out.write("                                    <div class=\"toolbar-sorter-right\">\n");
      out.write("                                        <span>Sort by </span>\n");
      out.write("                                        <select id=\"basic\" class=\"selectpicker show-tick form-control\" data-placeholder=\"$ USD\">\n");
      out.write("                                            <option data-display=\"Select\">Nothing</option>\n");
      out.write("                                            <option value=\"1\">Popularity</option>\n");
      out.write("                                            <option value=\"2\">High Price → High Price</option>\n");
      out.write("                                            <option value=\"3\">Low Price → High Price</option>\n");
      out.write("                                            <option value=\"4\">Best Selling</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p>Showing all 4 results</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 col-sm-4 text-center text-sm-right\">\n");
      out.write("                                    <ul class=\"nav nav-tabs ml-auto\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"nav-link active\" href=\"#grid-view\" data-toggle=\"tab\"> <i class=\"fa fa-th\"></i> </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"nav-link\" href=\"#list-view\" data-toggle=\"tab\"> <i class=\"fa fa-list-ul\"></i> </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-categorie-box\">\n");
      out.write("                                <div class=\"tab-content\">\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane fade show active\" id=\"grid-view\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"list-view\">\n");
      out.write("                                        <div class=\"list-view-box\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6 col-md-6 col-lg-4 col-xl-4\">\n");
      out.write("                                                    <div class=\"products-single fix\">\n");
      out.write("                                                        <div class=\"box-img-hover\">\n");
      out.write("                                                            <div class=\"type-lb\">\n");
      out.write("                                                                <p class=\"new\">New</p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <img src=\"images/img-pro-01.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                                            <div class=\"mask-icon\">\n");
      out.write("                                                                <ul>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                                                </ul>\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6 col-md-6 col-lg-8 col-xl-8\">\n");
      out.write("                                                    <div class=\"why-text full-width\">\n");
      out.write("                                                        <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                                        <h5> <del>$ 60.00</del> $40.79</h5>\n");
      out.write("                                                        <p>Integer tincidunt aliquet nibh vitae dictum. In turpis sapien, imperdiet quis magna nec, iaculis ultrices ante. Integer vitae suscipit nisi. Morbi dignissim risus sit amet orci porta, eget aliquam purus\n");
      out.write("                                                            sollicitudin. Cras eu metus felis. Sed arcu arcu, sagittis in blandit eu, imperdiet sit amet eros. Donec accumsan nisi purus, quis euismod ex volutpat in. Vestibulum eleifend eros ac lobortis aliquet.\n");
      out.write("                                                            Suspendisse at ipsum vel lacus vehicula blandit et sollicitudin quam. Praesent vulputate semper libero pulvinar consequat. Etiam ut placerat lectus.</p>\n");
      out.write("                                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"list-view-box\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6 col-md-6 col-lg-4 col-xl-4\">\n");
      out.write("                                                    <div class=\"products-single fix\">\n");
      out.write("                                                        <div class=\"box-img-hover\">\n");
      out.write("                                                            <div class=\"type-lb\">\n");
      out.write("                                                                <p class=\"sale\">Sale</p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <img src=\"images/img-pro-02.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                                            <div class=\"mask-icon\">\n");
      out.write("                                                                <ul>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                                                </ul>\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6 col-md-6 col-lg-8 col-xl-8\">\n");
      out.write("                                                    <div class=\"why-text full-width\">\n");
      out.write("                                                        <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                                        <h5> <del>$ 60.00</del> $40.79</h5>\n");
      out.write("                                                        <p>Integer tincidunt aliquet nibh vitae dictum. In turpis sapien, imperdiet quis magna nec, iaculis ultrices ante. Integer vitae suscipit nisi. Morbi dignissim risus sit amet orci porta, eget aliquam purus\n");
      out.write("                                                            sollicitudin. Cras eu metus felis. Sed arcu arcu, sagittis in blandit eu, imperdiet sit amet eros. Donec accumsan nisi purus, quis euismod ex volutpat in. Vestibulum eleifend eros ac lobortis aliquet.\n");
      out.write("                                                            Suspendisse at ipsum vel lacus vehicula blandit et sollicitudin quam. Praesent vulputate semper libero pulvinar consequat. Etiam ut placerat lectus.</p>\n");
      out.write("                                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"list-view-box\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6 col-md-6 col-lg-4 col-xl-4\">\n");
      out.write("                                                    <div class=\"products-single fix\">\n");
      out.write("                                                        <div class=\"box-img-hover\">\n");
      out.write("                                                            <div class=\"type-lb\">\n");
      out.write("                                                                <p class=\"sale\">Sale</p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <img src=\"images/img-pro-03.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                                            <div class=\"mask-icon\">\n");
      out.write("                                                                <ul>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                                                </ul>\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6 col-md-6 col-lg-8 col-xl-8\">\n");
      out.write("                                                    <div class=\"why-text full-width\">\n");
      out.write("                                                        <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                                        <h5> <del>$ 60.00</del> $40.79</h5>\n");
      out.write("                                                        <p>Integer tincidunt aliquet nibh vitae dictum. In turpis sapien, imperdiet quis magna nec, iaculis ultrices ante. Integer vitae suscipit nisi. Morbi dignissim risus sit amet orci porta, eget aliquam purus\n");
      out.write("                                                            sollicitudin. Cras eu metus felis. Sed arcu arcu, sagittis in blandit eu, imperdiet sit amet eros. Donec accumsan nisi purus, quis euismod ex volutpat in. Vestibulum eleifend eros ac lobortis aliquet.\n");
      out.write("                                                            Suspendisse at ipsum vel lacus vehicula blandit et sollicitudin quam. Praesent vulputate semper libero pulvinar consequat. Etiam ut placerat lectus.</p>\n");
      out.write("                                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 col-lg-3 col-sm-12 col-xs-12 sidebar-shop-left\">\n");
      out.write("                        <div class=\"product-categori\">\n");
      out.write("                            <div class=\"search-product\">\n");
      out.write("                                <form action=\"SearchController\">\n");
      out.write("                                    <input name=\"search\" class=\"form-control\" placeholder=\"Search here...\" type=\"text\">\n");
      out.write("                                    <button type=\"submit\"> <i class=\"fa fa-search\"></i> </button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"filter-sidebar-left\">\n");
      out.write("                                <div class=\"title-left\">\n");
      out.write("                                    <h3>Categories</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"list-group list-group-collapse list-group-sm list-group-tree\" id=\"list-group-men\" data-children=\".sub-men\">\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_1.setVar("c");
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                        <a href=\"category?categoryID=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write(' ');
 request.getParameter("item_id");
            out.write(" class=\"list-group-item list-group-item-action\"> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a>\n");
            out.write("                                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"filter-price-left\">\n");
      out.write("                                <div class=\"title-left\">\n");
      out.write("                                    <h3>Price</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"price-box-slider\">\n");
      out.write("                                    <div id=\"slider-range\"></div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <input type=\"text\" id=\"amount\" readonly style=\"border:0; color:#fbb714; font-weight:bold;\">\n");
      out.write("                                        <button class=\"btn hvr-hover\" type=\"submit\">Filter</button>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Shop Page -->\n");
      out.write("\n");
      out.write("        <!-- Start Instagram Feed  -->\n");
      out.write("        <div class=\"instagram-box\">\n");
      out.write("            <div class=\"main-instagram owl-carousel owl-theme\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-01.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-02.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-03.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-04.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-06.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-07.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-08.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-09.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Instagram Feed  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Start Footer  -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-main\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-top-box\">\n");
      out.write("                                <h3>Business Time</h3>\n");
      out.write("                                <ul class=\"list-time\">\n");
      out.write("                                    <li>Monday - Friday: 08.00am to 05.00pm</li> <li>Saturday: 10.00am to 08.00pm</li> <li>Sunday: <span>Closed</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-top-box\">\n");
      out.write("                                <h3>Newsletter</h3>\n");
      out.write("                                <form class=\"newsletter-box\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input class=\"\" type=\"email\" name=\"Email\" placeholder=\"Email Address*\" />\n");
      out.write("                                        <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button class=\"btn hvr-hover\" type=\"submit\">Submit</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-top-box\">\n");
      out.write("                                <h3>Social Media</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-pinterest-p\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-whatsapp\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-widget\">\n");
      out.write("                                <h4>About Freshshop</h4>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p> \n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p> \t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-link\">\n");
      out.write("                                <h4>Information</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Customer Service</a></li>\n");
      out.write("                                    <li><a href=\"#\">Our Sitemap</a></li>\n");
      out.write("                                    <li><a href=\"#\">Terms &amp; Conditions</a></li>\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                    <li><a href=\"#\">Delivery Information</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-link-contact\">\n");
      out.write("                                <h4>Contact Us</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <p><i class=\"fas fa-map-marker-alt\"></i>Address: Michael I. Days 3756 <br>Preston Street Wichita,<br> KS 67213 </p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <p><i class=\"fas fa-phone-square\"></i>Phone: <a href=\"tel:+1-888705770\">+1-888 705 770</a></p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <p><i class=\"fas fa-envelope\"></i>Email: <a href=\"mailto:contactinfo@gmail.com\">contactinfo@gmail.com</a></p>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- End Footer  -->\n");
      out.write("\n");
      out.write("        <!-- Start copyright  -->\n");
      out.write("        <div class=\"footer-copyright\">\n");
      out.write("            <p class=\"footer-company\">All Rights Reserved. &copy; 2018 <a href=\"#\">ThewayShop</a> Design By :\n");
      out.write("                <a href=\"https://html.design/\">html design</a></p>\n");
      out.write("        </div>\n");
      out.write("        <!-- End copyright  -->\n");
      out.write("\n");
      out.write("        <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\n");
      out.write("\n");
      out.write("        <!-- ALL JS FILES -->\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- ALL PLUGINS -->\n");
      out.write("        <script src=\"js/jquery.superslides.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("        <script src=\"js/inewsticker.js\"></script>\n");
      out.write("        <script src=\"js/bootsnav.js.\"></script>\n");
      out.write("        <script src=\"js/images-loded.min.js\"></script>\n");
      out.write("        <script src=\"js/isotope.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/baguetteBox.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script src=\"js/form-validator.min.js\"></script>\n");
      out.write("        <script src=\"js/contact-form-script.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.log != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <p style=\"color: white\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${User.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.log != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <form action=\"MainController\" method=\"POST\">\n");
        out.write("                            <input class=\"fa fa-user s_color\" type=\"submit\" name=\"action\" value=\"Logout\" />\n");
        out.write("                        </form>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.log == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <form action=\"MainController\" method=\"POST\">\n");
        out.write("                            <input class=\"fa fa-user s_color\" type=\"submit\" name=\"action\" value=\"Login\"/>\n");
        out.write("                        </form>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-sm-6 col-md-6 col-lg-4 col-xl-4\">\n");
          out.write("                                                <div class=\"products-single fix\">\n");
          out.write("                                                    <div class=\"box-img-hover\">\n");
          out.write("                                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid\" alt=\"Image\">\n");
          out.write("                                                        <div class=\"mask-icon\">\n");
          out.write("                                                            <a class=\"cart\" href=\"AddToCartController?pID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Add to Cart</a>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"why-text\">\n");
          out.write("                                                        <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                        <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
