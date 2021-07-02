package com.dream.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("success","测试ServletContext监听器");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
