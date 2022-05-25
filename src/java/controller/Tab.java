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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Milk;
import model.MilkType;

/**
 *
 * @author Legion
 */
public class Tab extends HttpServlet {

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
            out.println("<title>Servlet Tab</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Tab at " + request.getContextPath() + "</h1>");
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
            HttpSession session=request.getSession();
//Tab
        String id=request.getParameter("id");
        int tabId;
        if(id==null){
            tabId=1;
        }else{
            tabId=Integer.parseInt(id);
        }
//        System.out.println(tabId);
        //tab
        MilkList data = new MilkList();
        List<Milk> list1 = data.getListByID(tabId);
        int page, numberPerPage = 8;
        int size = list1.size();
        int number=(size%8==0?(size/8) :((size/8)+1));
        String xpage = request.getParameter("page");
        if (xpage == null) {
            page = 1;
        } else {
            page = Integer.parseInt(xpage);
        }
        int start, end;
        start = (page - 1) * numberPerPage;
        end = Math.min(page * numberPerPage, size);
        List<Milk> list = data.getListByPage(list1, start, end);
        session.setAttribute("data", list);
        session.setAttribute("page", page);
        session.setAttribute("num", number);
        session.setAttribute("idtab", tabId);
        //MILKTYPE
        MilkTypeDAO md=new MilkTypeDAO();
        List<MilkType> lt=md.getAll();
        request.setAttribute("listType", lt);
        
        //trang chu
//        List<Milk> trangchu=data.getAll();
        
        request.getRequestDispatcher("listTab.jsp").forward(request, response);
        
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
        processRequest(request, response);
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
