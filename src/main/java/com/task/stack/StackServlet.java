
package com.task.stack;

import com.google.gson.Gson;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "StackServlet",
        urlPatterns = {"/stack"}
)
public class StackServlet extends HttpServlet {

    Gson gson = new Gson();
    ArrayListStack stack = new ArrayListStack();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action != null) {
            resp.setContentType("application/json;charset=UTF-8");
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write(gson.toJson(stack));
        } else {
            String nextJSP = "/jsp/stack.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String action = req.getParameter("action");

        switch (action) {
            case "view":
                viewStackAction(req, resp);
                break;
            case "push":
                pushStackAction(req, resp);
                break;
            case "pop":
                popStackAction(req, resp);
                break;
            case "reset":
                resetStackAction(req, resp);
                break;
        }
    }

    private void pushStackAction(HttpServletRequest req, HttpServletResponse resp) {
        int number = Integer.parseInt(req.getParameter("input"));
        stack.push(number);
    }

    private void popStackAction(HttpServletRequest req, HttpServletResponse resp) {
        if (!stack.isEmpty()){
            stack.pop();
        }
    }

    private void resetStackAction(HttpServletRequest req, HttpServletResponse resp) {
        stack.reset();
    }

    private void viewStackAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String stackJson = gson.toJson(stack);

        resp.setContentType("application/json;charset=UTF-8");
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write(stackJson);
    }
}
