package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 书
 * @date 2021/4/7 - 16:43
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取前端参数
        String method = request.getParameter("method");
        if (method.equals("add")) {
            request.getSession().setAttribute("msg", "执行了add方法");
        }
        if (method.equals("delete")) {
            request.getSession().setAttribute("msg", "执行了delete方法");
        }
        //2.调用业务层

        //3.是否转发或者重定向
        request.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
