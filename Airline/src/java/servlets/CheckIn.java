/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jackl
 */
public class CheckIn extends HttpServlet {

    private static String ID;
    private static String name;
    private static String phone;
    private static String residence;
    private static String residenceLenght;

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
        ArrayList<String> data = new ArrayList<>();
        CheckIn.setID(request.getParameter("full-id"));
        CheckIn.setName(request.getParameter("full-name"));
        CheckIn.setPhone(request.getParameter("full-phone"));
        CheckIn.setResidence(request.getParameter("full-hotel"));
        CheckIn.setResidenceLenght(request.getParameter("full-estance"));

        /*
         public ArrayList createTicket(String residence, String residenceLenght, String ID, String name, String phone, String procedence, String city, String date, String time) {
         */
        data = CitySelect.getTool().createTicket(CheckIn.getResidence(), CheckIn.getResidenceLenght(), CheckIn.getID(), CheckIn.getName(), CheckIn.getPhone(), Redirect.getProcedence(), Info.getCity(), CheckInfo.getDate(), CheckInfo.getTime(),CheckInfo.getSeat());
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckIn</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CheckIn at " + request.getContextPath() + "</h1>");
            for(int i=0; i<data.size();i++){
                out.println("<p>" + data.get(i) + "</p>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    public static void setID(String ID) {
        CheckIn.ID = ID;
    }

    public static void setName(String name) {
        CheckIn.name = name;
    }

    public static void setPhone(String phone) {
        CheckIn.phone = phone;
    }

    public static String getID() {
        return ID;
    }

    public static String getName() {
        return name;
    }

    public static String getPhone() {
        return phone;
    }

    public static String getResidence() {
        return residence;
    }

    public static void setResidence(String residence) {
        CheckIn.residence = residence;
    }

    public static String getResidenceLenght() {
        return residenceLenght;
    }

    public static void setResidenceLenght(String residenceLenght) {
        CheckIn.residenceLenght = residenceLenght;
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
        processRequest(request, response);
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
