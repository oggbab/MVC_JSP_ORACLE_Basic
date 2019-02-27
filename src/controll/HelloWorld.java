package controll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;
import model.MemberDAO;

//web.xml 에 지정한 어노테이션
@WebServlet("/Mproc2")
public class HelloWorld extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //호출만 한다
		reqPro(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    reqPro(request,response);
	}

	//get과  post 모두 호환하는 메소드
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//모델로 걸러서 넘기기
		MemberBean bean = new MemberBean();
		bean.setId(request.getParameter("id"));
		bean.setPwd(request.getParameter("pwd"));
		bean.setEmail(request.getParameter("email"));
		bean.setPhone(request.getParameter("address"));
		bean.setAddress(request.getParameter("phone"));
		request.setAttribute("bean", bean);
		
		//dao로 db 저장
		MemberDAO dao = new MemberDAO();
		dao.insertMember(bean);

/*		//넘겨줄 jsp명 기입 View를 호출하는 것 즉 페이지 이동
		RequestDispatcher dis = request.getRequestDispatcher("memberList.jsp");
		dis.forward(request, response);*/
		
		//request 바로 넘기기
/*		String id = request.getParameter("id");
		request.setAttribute("pwd", pwd);
		*/

	}
}
