package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 일반적인 maven-archtype-webapp 형식의 프로젝트 구조에서 실행하면 가능한 코드
 * 래거시를 다루어야 할 경우를 생각해서 한번 쯤 실습해볼법한 소스
 */
public class StudyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("do get servlet");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
