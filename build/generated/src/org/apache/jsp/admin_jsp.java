package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import model.Milk;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"teststyle.css\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/profile.css\">\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("        <title>VIVU Milk</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"head\">\n");
      out.write("                <div class=\"content-head\">\n");
      out.write("                    <div style=\"display: flex\">\n");
      out.write("                    <img style=\"height: 48px;width: 48px;border-radius: 50%;background-color: white\" src=\"img/logo/Logo.png\">\n");
      out.write("                    <p style=\"margin:auto 0\">VIVU Milk hân hạnh phục vụ quý khách</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"giuacontent\"><a style=\"font-family: cursive;color: rgb(0, 134, 179);\"class=\"icont\" href=\"home\"><ion-icon name=\"home\"></ion-icon>VIVU MILK</a></div>\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--        <div class=\"backShop\">\n");
      out.write("                    <img src=\"background/backgr.png\" alt=\"\">\n");
      out.write("                </div>-->\n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-ride=\"carousel\" style=\"margin-top:49px\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img style=\"height: 300px\" src=\"http://seller.awesomedairy.com/wp-content/uploads/2021/06/pngtree-taobao-pure-milk-promotion-carnival-poster-banner-background-image_153800.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5 style=\"color: black;font-weight: 700;font-size: 25px;font-family: cursive\">Chính hãng 100%</h5>\n");
      out.write("                        <p style=\"color:black;background-color: rgba(255, 255, 255, 0.65);\">\"VIVU MILK là nhà cung cấp nổi tiếng và uy tín trên toàn thế giới.<br>\n");
      out.write("                            Được mọi người yêu thích và tin dùng\"</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img style=\"height: 300px;opacity: 0.8\" src=\"https://png.pngtree.com/thumb_back/fw800/back_our/20190622/ourmid/pngtree-blue-minimalist-milk-breakfast-banner-background-image_220965.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5 style=\"color: black;font-weight: 700;font-size: 25px;font-family: cursive\">Thơm Ngon</h5>\n");
      out.write("                        <p style=\"color:black;background-color: rgba(255, 255, 255, 0.8);\">\"Những sản phẩm của VIVU Milk luôn được chọn lọc dựa trên nhu cầu của khách hàng <br>nhằm cung cấp cho khách hàng những sản phẩm NGON-BỔ-RẺ nhất\"</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img style=\"height: 300px\"  src=\"https://www.wallpaperuse.com/wallp/70-706830_m.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5 style=\"color: black;font-weight: 700;font-size: 25px;font-family: cursive\">Phục vụ đẳng cấp 5 sao</h5>\n");
      out.write("                        <p style=\"color:black;background-color: rgba(255, 255, 255, 0.65);\">Hơn 93.33% đánh giá 5 sao đến từ khách hàng.<br>Chúng tôi sẽ luôn luôn cố gắng để hoàn thiện để có thể phục vụ và làm hài lòng mọi khách hàng yêu quý.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"prev\" style=\"height: 10px;margin:auto 0;\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"next\" style=\"height: 10px;margin:auto 0;\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"search\">\n");
      out.write("            <form action=\"search\">\n");
      out.write("                    <div class=\"fix\">\n");
      out.write("                <input type=\"text\" placeholder=\"Tìm kiếm sản phẩm......\" name=\"key\">\n");
      out.write("                <!--<button onclick=\"this.form.submit()\">Find</button>-->\n");
      out.write("                <button onclick=\"this.form.submit()\"><ion-icon name=\"search-circle-outline\"></ion-icon></button>\n");
      out.write("                    </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <h3 class=\"title\" style=\"text-align: center;font-weight: 700\">Thông tin tài khoản</h3>\n");
      out.write("\n");
      out.write("        <div class=\"foradmin\">\n");
      out.write("            <div><a href=\"topproduct\">Top 5 sản phẩm bán chạy nhất trong tháng</a></div>\n");
      out.write("            <div><a href=\"listorder\">Danh sách order khách hàng</a></div>\n");
      out.write("            <div><a></a></div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("       ");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("<div class=\"footer\" style=\"width: 100%\">\n");
      out.write("    <div class=\"left\" style=\"padding-left: 5%;text-align: left;width: 45%\">\n");
      out.write("        VIVU Milk - vivumilk.com<br>\n");
      out.write("        TRANG TMĐT CHUYÊN SỮA HÀNG ĐẦU THẾ GIỚI<br>\n");
      out.write("        Trụ sở: 318 Đường Bưởi, Q.Ba Đình, TP.Hà Nội<br>\n");
      out.write("        Chi nhánh: 130 Phố Chùa Quỳnh, Hai Bà Trưng, TP.Hà Nội<br>\n");
      out.write("        Website: www.vivumilk.com<br>\n");
      out.write("        ĐT: (024) 3232 1527 - E: cskh@vivumilk.com<br>\n");
      out.write("        GPDKKD: 01A8031009, UBND Quận Ba Đình, TP.Hà Nội<br>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"right\" style=\"padding-right: 5%;width: 25%;overflow: hidden\">\n");
      out.write("        <div><u style=\"font-size:24px;\">Contact Us</u></div>\n");
      out.write("        <div style=\"display: flex\">\n");
      out.write("            <ion-icon style=\"font-size: 36px;color: blue\" name=\"logo-facebook\"></ion-icon>\n");
      out.write("            <div style=\"margin:auto 0;padding-left: 5px\"><a style=\"color:black;text-decoration: none\" href=\"https://www.facebook.com/VIVUMILK\">https://www.facebook.com/VIVUMILK</a></div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"display: flex\">\n");
      out.write("            <ion-icon style=\"font-size: 36px;color:blue\" name=\"logo-twitter\"></ion-icon>\n");
      out.write("            <div style=\"margin:auto 0;padding-left: 5px\"><a style=\"color:black;text-decoration: none\" href=\"https://www.facebook.com/VIVUMILK\">https://www.twitter.com/VIVUMILK</a></div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"display: flex\">\n");
      out.write("            <ion-icon style=\"font-size:36px; color:red\" name=\"mail-outline\"></ion-icon>\n");
      out.write("            <div style=\"margin:auto 0;padding-left: 5px\">cskh@vivumilk.com</a></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function buy(id) {\n");
      out.write("            document.f.action = \"buy?idProduct=\" + id;\n");
      out.write("            document.f.submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\"\n");
      out.write("        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\"\n");
      out.write("        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("size");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"logina\" style=\"display: flex;\">    \n");
        out.write("\n");
        out.write("                    <div style=\"display: flex;margin:0 auto\">\n");
        out.write("                        ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        \n");
        out.write("                        ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </div>          \n");
        out.write("\n");
        out.write("                </div>\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"dropdown\">\n");
        out.write("                                <div class=\"dropbtn\"><a href=\"profile?user=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.logo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></div>\n");
        out.write("                                <div class=\"dropdown-content\">\n");
        out.write("                                    <div class=\"ab\" style=\"text-align: center\">\n");
        out.write("                                        <a href=\"profile?user=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Profile</a>\n");
        out.write("                                        <a href=\"changepass\">Change password</a>\n");
        out.write("                                        <a href=\"topproduct\">Management</a>\n");
        out.write("                                        <a href=\"login\">Logout</a>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div> \n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.role==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"dropdown\">\n");
        out.write("                            <div class=\"dropbtn\"><a href=\"profile?user=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.logo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></div>\n");
        out.write("                            <div class=\"dropdown-content\">\n");
        out.write("                                <div class=\"ab\" style=\"text-align: center\">\n");
        out.write("                                    <a href=\"profile?user=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Profile</a>\n");
        out.write("                                    <a href=\"changepass\">Change password</a>\n");
        out.write("                                    <a href=\"login\">Logout</a>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div> \n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"cart\" style=\"position: relative;\">                   \n");
        out.write("                                <div ><a href=\"MyCart.jsp\"><img src=\"img/cart/shopping.jpg\" style=\"width: 20px;height: 20px;border-radius:5px\"></a></div>\n");
        out.write("                                <div  style=\"background-color: red;color:white;position: relative;bottom: 10px;left: 17px;width: 20px;border-radius: 50%;text-align: center\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                            </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"cart\" style=\"position: relative;\">                   \n");
        out.write("                                <div style=\"position: absolute\"><a class=\"anhshop\" href=\"MyCart.jsp\"><img src=\"img/cart/shopping.jpg\" style=\"width: 20px;height: 20px;border-radius:5px\"></a></div>\n");
        out.write("                                <div  style=\"background-color: red;color:white;position: relative;bottom: 10px;left: 17px;width: 20px;border-radius: 50%;text-align: center\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                            </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nick==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"login\" style=\"width: 12%;margin-left: 4%;margin-right: 4%;text-align: center\"><a href=\"login.jsp\">Login</a></div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
