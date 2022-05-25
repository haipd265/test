/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.MilkList;
import dal.MilkTypeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Milk;
import model.MilkType;

/**
 *
 * @author Legion
 */
public class InsertMilk extends HttpServlet {

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
            out.println("<title>Servlet InsertMilk</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertMilk at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Account ac = (Account) session.getAttribute("nick");
        if (ac != null && ac.getRole() == 0) {
            response.sendRedirect("home");
        } else {
            MilkTypeDAO mtype = new MilkTypeDAO();
            List<MilkType> list = mtype.getAll();
            request.setAttribute("list", list);
            request.getRequestDispatcher("insertMilk.jsp").forward(request, response);
        }

    }

    boolean checkDate(String x) {
        try {
            Date now = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date cp = df.parse(x);
            if (now.compareTo(cp) > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("idProduct");
        String name = request.getParameter("nameProduct");
        String published = request.getParameter("published");
        String desc = request.getParameter("describe");
        int typeID = Integer.parseInt(request.getParameter("type"));
        String img = request.getParameter("img");
        //getmilk
        MilkList controll = new MilkList();
        Milk check = controll.getProductByID(id);
        if (check != null) {
            request.setAttribute("err", "ID Product have exist!");
            request.getRequestDispatcher("insertMilk.jsp").forward(request, response);
        } else if (checkDate(published) == false) {        //kiem tra ngay co hon hien tai
            request.setAttribute("err", "Input Date in the pass!!");
            request.getRequestDispatcher("insertMilk.jsp").forward(request, response);
        } else {
            try {
                int quantity = Integer.parseInt(request.getParameter("quantity"));
                double price = Double.parseDouble(request.getParameter("price"));
                Milk real = new Milk(id, name, quantity, price, desc, published, typeID, img);
                controll.insert(real);
                request.setAttribute("err", "Successfull!!");
                MilkTypeDAO mtype = new MilkTypeDAO();
                List<MilkType> list = mtype.getAll();
                request.setAttribute("list", list);
                request.getRequestDispatcher("insertMilk.jsp").forward(request, response);
            } catch (Exception e) {
                out.print(e);
            }
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
