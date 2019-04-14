package servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import service.HelloService;

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

    /**
     * 다음과 같이 컨텍스틀 꺼내올 수 있고, 그 안에 등록된 빈을 활용 할 수 있게된다.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        HelloService helloService = context.getBean(HelloService.class);
        resp.getWriter().write("do get servlet");
        resp.getWriter().write(helloService.getName());
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
