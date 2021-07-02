package com.dream.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.xml.crypto.dsig.spec.XPathType;
import java.io.IOException;

@WebFilter("/*")
public class FilerDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        long end = System.currentTimeMillis();
        System.out.println("请求一次所需要的时间："+(end-start));
    }
}
