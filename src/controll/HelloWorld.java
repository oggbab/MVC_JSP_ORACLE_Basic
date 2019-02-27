package controll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;
import model.MemberDAO;

//web.xml �� ������ ������̼�
@WebServlet("/Mproc2")
public class HelloWorld extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //ȣ�⸸ �Ѵ�
		reqPro(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    reqPro(request,response);
	}

	//get��  post ��� ȣȯ�ϴ� �޼ҵ�
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//�𵨷� �ɷ��� �ѱ��
		MemberBean bean = new MemberBean();
		bean.setId(request.getParameter("id"));
		bean.setPwd(request.getParameter("pwd"));
		bean.setEmail(request.getParameter("email"));
		bean.setPhone(request.getParameter("address"));
		bean.setAddress(request.getParameter("phone"));
		request.setAttribute("bean", bean);
		
		//dao�� db ����
		MemberDAO dao = new MemberDAO();
		dao.insertMember(bean);

/*		//�Ѱ��� jsp�� ���� View�� ȣ���ϴ� �� �� ������ �̵�
		RequestDispatcher dis = request.getRequestDispatcher("memberList.jsp");
		dis.forward(request, response);*/
		
		//request �ٷ� �ѱ��
/*		String id = request.getParameter("id");
		request.setAttribute("pwd", pwd);
		*/

	}
}
