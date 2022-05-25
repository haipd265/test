/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.Edit;
import dal.MilkList;
import dal.MilkTypeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Milk;
import model.MilkType;

/**
 *
 * @author Legion
 */
public class EditMilk extends HttpServlet {

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
            out.println("<title>Servlet EditMilk</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditMilk at " + request.getContextPath() + "</h1>");
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
        String id = request.getParameter("idProduct");
        MilkList find = new MilkList();
        Milk m = find.getProductByID(id);
        MilkTypeDAO mtype = new MilkTypeDAO();
        List<MilkType> list = mtype.getAll();
        request.setAttribute("list", list);
        request.setAttribute("milk", m);
        request.getRequestDispatcher("editProduct.jsp").forward(request, response);
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
        String idP = request.getParameter("idProduct");
        String nameP = request.getParameter("nameProduct");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        String desc = request.getParameter("describe");
        String published=request.getParameter("published");
        int typeID=Integer.parseInt(request.getParameter("typeid"));
        String img=request.getParameter("img");
        try {
            Edit edit = new Edit();
            edit.update(new Milk(idP, nameP, quantity, price, desc, published, typeID, img));
            request.setAttribute("mess", "Successfull!!");
            request.getRequestDispatcher("editProduct.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println(e);
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
