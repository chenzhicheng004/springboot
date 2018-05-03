package com.czc.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by shiqian on 2018-04-27
 */
@WebListener
public class TestListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("启动web容器..........................");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
