package com.dream.include;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/otherServlet")
public class ServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getAttribute("success").toString());
        //请求头测试
        System.out.println(req.getCharacterEncoding());
        req.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("使用Include方法\n");
    }
}
