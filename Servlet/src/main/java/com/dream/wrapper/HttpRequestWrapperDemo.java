package com.dream.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class HttpRequestWrapperDemo extends HttpServletRequestWrapper {
    public HttpRequestWrapperDemo(HttpServletRequest request) {
        super(request);
    }

    @Override
    public void setAttribute(String name, Object o) {
        if (o instanceof String){
            super.setAttribute(name, o.toString()+"测试一下就好了");
        }else {
            super.setAttribute(name, o);
        }
    }
}
