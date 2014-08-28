package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.carsFinder.entity.ModelInfo;
import java.util.*;
import com.carsFinder.dao.*;

public final class indexTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

      out.write("\r\n");
      out.write("\r\n");
      com.carsFinder.model.CarsBean cb = null;
      synchronized (_jspx_page_context) {
        cb = (com.carsFinder.model.CarsBean) _jspx_page_context.getAttribute("cb", PageContext.PAGE_SCOPE);
        if (cb == null){
          cb = new com.carsFinder.model.CarsBean();
          _jspx_page_context.setAttribute("cb", cb, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/make_model_switch.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/index.css\" type=\"text/css\" />\r\n");
      out.write("            <!-- Latest compiled and minified CSS -->\r\n");
      out.write("            <!--<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">-->\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/carousel.css\">\r\n");
      out.write("                    <link rel=\"stylesheet\" href=\"css/bootswatch.less\">\r\n");
      out.write("                        <link rel=\"stylesheet\" href=\"css/variables.less\">\r\n");
      out.write("                            <title>CarsFinder</title>\r\n");
      out.write("                            </head>\r\n");
      out.write("\r\n");
      out.write("                            <body>\r\n");
      out.write("                                <div class=\"navbar-wrapper\">\r\n");
      out.write("                                    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\">\r\n");
      out.write("                                            <div class=\"container\">\r\n");
      out.write("                                                <div class=\"navbar-header\">\r\n");
      out.write("                                                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                                                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                                                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                                                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                    <a class=\"navbar-brand\" href=\"#\">Project name</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                                                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                                        <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" >Hello! Mr.Car</a></li>\r\n");
      out.write("                                                        <li class=\"dropdown\">\r\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Your Menu<b class=\"caret\"></b></a>\r\n");
      out.write("                                                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                                                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                                                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                                                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                                                <li class=\"divider\"></li>\r\n");
      out.write("                                                                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                                            </ul>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <!-- Carousel\r\n");
      out.write("                                 ================================================== -->\r\n");
      out.write("                                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                                    <div id=\"container\">\r\n");
      out.write("                                        <div id=\"search\" class=\"carousel-caption jumbotron\">\r\n");
      out.write("                                            <h2>Find Cars for Sale!</h2>\r\n");
      out.write("                                            <p>&nbsp;</p>\r\n");
      out.write("                                            <form class=\"form-inline\" action=\"CarlistServlet?method=searchCar\" method=post>\r\n");
      out.write("                                                <fieldset>\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label for=\"select\" class=\"col-lg-3 control-label\">Make:</label>\r\n");
      out.write("                                                        <div class=\"col-lg-8\">\r\n");
      out.write("                                                            ");

                                                                List<ModelInfo> list = (List<ModelInfo>)cb.getMake();
                                                                if (!list.isEmpty()) {
      out.write("\r\n");
      out.write("                                                            <select class=\"form-control\" id=\"selectMake\" name=\"make\">\r\n");
      out.write("                                                                <option>Any Make</option>\r\n");
      out.write("                                                                ");
for (int i = 0; i < list.size(); i++) {

                                                                            out.println("<option value=" + list.get(i).getMake() + ">" + list.get(i).getMake() + "</option>");
                                                                        }
                                                                    }
      out.write("\r\n");
      out.write("                                                            </select>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label for=\"select\" class=\"col-lg-3 control-label\">&nbsp;&nbsp;&nbsp;Model:</label>\r\n");
      out.write("                                                        <div class=\"col-lg-8\">\r\n");
      out.write("                                                            <select class=\"form-control\" id=\"selectModel\" name=\"model\">\r\n");
      out.write("                                                                \r\n");
      out.write("                                                                \r\n");
      out.write("                                                            </select>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <p>&nbsp;</p>\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label for=\"select\" class=\"col-lg-3 control-label\">Year:</label>\r\n");
      out.write("                                                        <div class=\"col-lg-8\">\r\n");
      out.write("                                                            <select class=\"form-control\" id=\"selectPrice\" name=\"year\">\r\n");
      out.write("                                                                 \r\n");
      out.write("                                                                ");
for(int i = 2000;i<=2014;i++){
      out.write("\r\n");
      out.write("                                                                <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\r\n");
      out.write("                                                                ");
}
      out.write("\r\n");
      out.write("                                                            </select>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label for=\"select\" class=\"col-lg-3 control-label\">Price:</label>\r\n");
      out.write("                                                        <div class=\"col-lg-8\">\r\n");
      out.write("                                                            <select class=\"form-control3\" id=\"selectPrice\" name=\"price\">\r\n");
      out.write("                                                                \r\n");
      out.write("                                                                ");
for(int i=0;i<200000;i+=5000){
      out.write("\r\n");
      out.write("                                                                <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write(" - ");
      out.print(i+5000);
      out.write("</option>\r\n");
      out.write("                                                                ");
}
      out.write("\r\n");
      out.write("                                                            </select>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    \r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <div class=\"col-lg-8\">\r\n");
      out.write("                                                            <button type=\"submit\" class=\"btn-right btn-primary btn-lg\">Search</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                </fieldset>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Indicators -->\r\n");
      out.write("                                    <ol class=\"carousel-indicators\">\r\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\r\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\r\n");
      out.write("                                    </ol>\r\n");
      out.write("                                    <div class=\"carousel-inner\">\r\n");
      out.write("                                        <div class=\"item active\">\r\n");
      out.write("                                            <img src=\"image/2014_hamann_bmw_m6_mirr6r-2560x1440.jpg\" alt=\"First slide\">         \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <img alt=\"Second slide\" src=\"image/2015_ford_mustang_2-2560x1600.jpg\">    \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <img src=\"image/2014_lexus_is_awd_by_gordon_ting-2560x1600.jpg\" alt=\"Third slide\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <img src=\"image/2013_g_power_bmw_m3_hurricane_rs-2560x1600.jpg\" alt=\"Third slide\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <img src=\"image/2014_lamborghini_veneno_roadster-2560x1600.jpg\" alt=\"Third slide\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\"><span class=\"glyphicon glyphicon-chevron-left\"></span></a>\r\n");
      out.write("                                    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\"><span class=\"glyphicon glyphicon-chevron-right\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                                    <div class=\"modal-dialog\">\r\n");
      out.write("                                        <div class=\"modal-content\">\r\n");
      out.write("                                            <div class=\"modal-header\">\r\n");
      out.write("                                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                                                <h4 class=\"modal-title\" id=\"myModalLabel\">User Login</h4>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <form class=\"form-horizontal\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"modal-body\">\r\n");
      out.write("                                                    <div class=\"form-group\">  \r\n");
      out.write("\r\n");
      out.write("                                                        <label for=\"username\" class=\"col-lg-2 control-label\">Username</label>\r\n");
      out.write("                                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"form-group\">  \r\n");
      out.write("\r\n");
      out.write("                                                        <label for=\"username\" class=\"col-lg-2 control-label\">Password</label>\r\n");
      out.write("                                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"modal-footer\">\r\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div><!-- /.modal-content -->\r\n");
      out.write("                                    </div><!-- /.modal-dialog -->\r\n");
      out.write("                                </div><!-- /.modal -->\r\n");
      out.write("                                <script src=\"js/jquery.min.js\"></script> \r\n");
      out.write("                                <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("                                <script src=\"js/modelSearch.js\"></script>\r\n");
      out.write("                            </body>\r\n");
      out.write("                            </html>\r\n");
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
