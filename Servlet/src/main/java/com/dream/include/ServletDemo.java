package com.dream.include;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //测试范围属性
        req.setAttribute("success","成功");
        //之前请求头
        System.out.println("之前请求头"+req.getCharacterEncoding());
        //请求头设置
        req.setCharacterEncoding("ISO-8859-1");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("include之前\n");
        req.getRequestDispatcher("/otherServlet").include(req,resp);
        System.out.println("之后的字符集"+req.getCharacterEncoding());
        writer.write("include之后");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
