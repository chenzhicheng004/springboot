package com.czc.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shiqian on 2018-04-27
 */
@WebFilter(filterName = "testFilter", urlPatterns = "/*")
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        if (request instanceof HttpServletRequest) {
            System.out.println(((HttpServletRequest) request).getRequestURI());
        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
