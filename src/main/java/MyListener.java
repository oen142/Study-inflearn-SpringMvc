import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("contextInitialized");
        sce.getServletContext().setAttribute("name" , "keesun");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("Context Destroyed");
    }
}
