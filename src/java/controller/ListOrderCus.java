/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.MilkList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.orders;

/**
 *
 * @author Legion
 */
public class ListOrderCus extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListOrderCus</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListOrderCus at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MilkList d = new MilkList();
        HttpSession session = request.getSession();
        Account ac = (Account) session.getAttribute("nick");
        if (ac != null) {
            List<orders> list = d.getOrderofCus(ac.getUsername());
            request.setAttribute("list", list);
            int page, numberPerPage = 10;
            int size = list.size();
            int number = (size % 10 == 0 ? (size / 10) : ((size / 10) + 1));
            String xpage = request.getParameter("page");
            if (xpage == null) {
                page = 1;
            } else {
                page = Integer.parseInt(xpage);
            }
            int start, end;
            start = (page - 1) * numberPerPage;
            end = Math.min(page * numberPerPage, size);
            List<orders> listreal = d.getOrderByPage(list, start, end);
            session.setAttribute("data", listreal);
            session.setAttribute("page", page);
            session.setAttribute("num", number);
            request.getRequestDispatcher("listordercus.jsp").forward(request, response);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        MilkList d = new MilkList();
        if (start != null && end != null) {
            List<orders> list = d.getCusOrder(start, end);
            request.setAttribute("list", list);
            request.getRequestDispatcher("listordercus.jsp").forward(request, response);
        } else {
            response.sendRedirect("listordercus");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
