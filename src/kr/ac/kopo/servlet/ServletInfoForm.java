package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletInfoForm extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Request : 웹페이지에서 값 읽어오기
        req.setCharacterEncoding("utf-8");

        String[] mailList = {"공지 메일", "광고 메일", "배송 확인 메일"};

        String name = req.getParameter("name");
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String[] mailSubs = req.getParameterValues("mailSubs");
        String job = req.getParameter("job");


        // Response : 읽어온 값 뿌려주기
        resp.setContentType("text/html; charset=utf-8");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Information Submit by hyewon</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>개인 정보 출력</h1>");
        out.println("<br><br>");
        out.println("이름 : " + name + "<br>");
        out.println("아이디 : " + id + "<br>");
        out.println("암호 : " + password + "<br>");
        out.println("성별 : " + gender + "<br>");

        out.println("공지 메일 : " + (req.getParameterValues("mailSubs")[0].equals("NoticeMail") ? "받음" : "받지않음") + "<br>");
        out.println("공지 메일 : " + (req.getParameterValues("mailSubs")[1].equals("AdMail") ? "받음" : "받지않음") + "<br>");
        out.println("공지 메일 : " + (req.getParameterValues("mailSubs")[2].equals("DelivCheckMail") ? "받음" : "받지않음") + "<br>");

        out.println("<br>");
        out.println("직업 : " + job);
        out.println("</body>");
        out.println("</html>");

        out.flush();

    }
}
