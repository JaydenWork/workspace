package ch8;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppServletContextListener
 *
 */
@WebListener
public class AppServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public AppServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	 System.out.println("application 이 종료 되었습니다....................");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
        System.out.println("application 이 실행 되었습니다....................");
    }
	
}
