/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-20 11:04:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.User;
import member.model.service.MemberService;
import member.model.vo.User;
import hospital.model.vo.Hospital;

public final class searchId2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1595158624000L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1595220082000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.service.MemberService");
    _jspx_imports_classes.add("member.model.vo.User");
    _jspx_imports_classes.add("hospital.model.vo.Hospital");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	User userLoggedIn = (User)session.getAttribute("userLoggedIn");
	Cookie[] cookies2 = request.getCookies();
	boolean saveUserIdChecked = false;
	String saveUserIdValue = "";
	if(cookies2 != null) {
		for(Cookie c : cookies2) {
			String k = c.getName();
			String v = c.getValue();

			if("saveUserId".equals(k)) {
				saveUserIdChecked = true;
				saveUserIdValue = v;
			}
		}
	}
	
	
	
	Hospital hospLoggedIn = (Hospital)session.getAttribute("hospLoggedIn");
	//쿠키관련
	Cookie[] cookies = request.getCookies();
	boolean saveHospIdChecked = false;
	String saveHospIdValue = "";
	if(cookies != null) {
		for(Cookie c : cookies) {
			String k = c.getName();
			String v = c.getValue();

			if("saveHospId".equals(k)) {
				saveHospIdChecked = true;
				saveHospIdValue = v;
			}
		}
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>See Doctor</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/header.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/footer.css\" />\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top-bar\">\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath() );
      out.write("\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <ul>\r\n");
      out.write("                ");
if(hospLoggedIn == null && userLoggedIn == null) { 
      out.write("\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("\">\r\n");
      out.write("                        <li style=\"color:white\">홈</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/login\">\r\n");
      out.write("                        <li>로그인</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/register\">\r\n");
      out.write("                        <li>회원가입</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                ");
 } else if(hospLoggedIn != null) { 
      out.write("\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/hospital?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\"><span class=\"login1\"><strong>");
      out.print( hospLoggedIn.getHospName() );
      out.write("</strong></span></a>\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/logout\">\r\n");
      out.write("                \t\t<li>로그아웃</li>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/edit-info?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\">\r\n");
      out.write("                        <li>병원정보수정</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/doctorList?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\">\r\n");
      out.write("                        <li>의사보기</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- 2/15 -->\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/booking/bookingHopitalList?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\"> <!-- ts -->\r\n");
      out.write("                        <li>예약내역(병원)</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                 ");
}else if(userLoggedIn!=null&&userLoggedIn.getUserRole().equals(MemberService.MEMBER_ROLE_ADMIN)){ 
      out.write("   \r\n");
      out.write("                    <span class=\"login1\"><strong>");
      out.print( userLoggedIn.getUserName());
      out.write("</strong></span>\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/logout\">\r\n");
      out.write("                \t\t<li>로그아웃</li>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\">\r\n");
      out.write("                        <li>회원조회</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/hospList\">\r\n");
      out.write("                        <li>병원조회</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                \t<span class=\"login1\"><strong>");
      out.print( userLoggedIn.getUserName());
      out.write("</strong></span>\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/logout\">\r\n");
      out.write("                \t\t<li>로그아웃</li>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/edit-info?userId=");
      out.print( userLoggedIn.getUserId());
      out.write("\">\r\n");
      out.write("                        <li>회원정보수정</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- 2/15 -->\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/booking/bookinglist?userId=");
      out.print( userLoggedIn.getUserId() );
      out.write("\"> <!-- ts -->\r\n");
      out.write("                        <li>예약내역</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"sub-bar\"></div>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/search2.css\">\r\n");

  request.setCharacterEncoding("utf-8");
  User user = (User)request.getAttribute("user");

      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" Contenet=\"text/html; charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<section>\r\n");
      out.write("        <article>\r\n");
      out.write("\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t<h1><div id=\"userName\">[");
      out.print(user.getUserName() );
      out.write("] 님의 아이디</div></h1>\r\n");
      out.write("\t\t<h1><div id=\"userId\">[");
      out.print(user.getUserId() );
      out.write("] 입니다</div></h1>\r\n");
      out.write("\t\t<button id=\"button\" class=\"btn\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/login'\">로그인 하러가기</button>\t\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("</article>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/docs/policy\">이용약관</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/docs/privacy\">개인정보처리방침</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/docs/biz\">사업자정보확인</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/bbc/cs\">고객센터</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p>\r\n");
      out.write("            상호 : (주)씨닥 | 대표 : 씨닥 | 개인정보관리책임자 : KH | 전화 : 2588-2588 | 이메일 : khm0627@naver.com\r\n");
      out.write("            <Br />주소 : 서울특별시 강남구 역삼동 | 사업자등록번호 : 110-426-375674 | 통신판매 : 제 2020-서울강남-0922호 | 호스팅제공자 : (주)씨닥\r\n");
      out.write("            <br><br>\r\n");
      out.write("            Copyrighter ⓒ 2020 SeeDoc KH-m\r\n");
      out.write("        </p>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
