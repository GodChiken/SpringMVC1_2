package servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StudyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("StudyListener.contextInitialized");
        sce.getServletContext().setAttribute("name","KBH");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("StudyListener.contextDestroyed");
    }
}
