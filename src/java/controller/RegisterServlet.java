/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author Legion
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
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
        response.sendRedirect("register.jsp");
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        DAO d = new DAO();
        String tk = request.getParameter("user");
        String mk = request.getParameter("password");
        String add = request.getParameter("address");
        String email = request.getParameter("email");
        String sdt = request.getParameter("phone");
        String logo = request.getParameter("logo");
        boolean test = d.checkUser(tk);
        String repass = request.getParameter("re-password");
        if (mk.equals(repass)) {
            if (test == false) {
                Account a = new Account();
                a.setUsername(tk);
                a.setPass(mk);
                a.setAddress(add);
                a.setEmail(email);
                a.setPhone(sdt);
                a.setLogo(logo);
                d.register(a);
                request.setAttribute("er", "SuccessFull");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            } else {
                request.setAttribute("er", "Username has exist....try with another username!!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }

        } else {
            request.setAttribute("er", "Password wrong");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }

        //dung
//        if (test == false) {
//            Account a = new Account();
//            a.setUsername(tk);
//            a.setPass(mk);
//            a.setAddress(add);
//            a.setEmail(email);
//            a.setPhone(sdt);
//            a.setLogo(logo);
////            d.register(a);
//            request.setAttribute("er", "SuccessFull");
//            request.getRequestDispatcher("register.jsp").forward(request, response);
//        } else {
//            request.setAttribute("er", "Username has exist....try with another username!!");
//            request.getRequestDispatcher("register.jsp").forward(request, response);
//        }
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
