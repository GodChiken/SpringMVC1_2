package filter;

import javax.servlet.*;
import java.io.IOException;

public class StudyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("StudyFilter.init");
    }

    /**
     * line 21 와 같은 일련의 작업만 하고 소스를 작성하지 않는 경우
     * 다음 필터로 연결되지 않기 때문에 반드시 filterChain 파라미터를 통해
     * 메서드 체이닝 작업을 해준다.
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("StudyFilter.doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("StudyFilter.destroy");
    }
}
