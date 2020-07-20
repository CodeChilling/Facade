/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import facade.Facade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jackl
 */
public class CitySelect extends HttpServlet {

    

    private static Facade tool = new Facade(Redirect.getType());

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*
     InternationalTicket.cities.put("Manchester", "https://dondehospedarse.com/img/donde-alojarse-manchester.jpg");
     InternationalTicket.cities.put("Londres", null);
     InternationalTicket.cities.put("Estambul", null);
     InternationalTicket.cities.put("Tokyo", null);
     InternationalTicket.cities.put("Okinawa", null);
     InternationalTicket.cities.put("Bangkok", null);
     InternationalTicket.cities.put("Rio de Janeiro", null);
     InternationalTicket.cities.put("Roma", null);
     InternationalTicket.cities.put("Paris", null);
     InternationalTicket.cities.put("Praga", null);
     InternationalTicket.cities.put("Budapest", null);
     InternationalTicket.cities.put("Berlin", null);
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Welcome</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Welcome at " + request.getContextPath()
                        + "<form action=\"Info\" method=\"GET\" class=\"form\">\n"
                        + "\n"
                        + "          \n"
                        + "\n"
                        + "                        <select class=\"form-control list\" id=\"city_select\" name=\"city_select\">\n");
                        for(String item: Facade.getAllCities()){
                            if(!item.equals(Redirect.getProcedence())){
                                 out.println("<option value=\""+item+"\">"+item+"</option>\n");
                            }
           
                        }
                        out.println( "                        </select>\n"
                        + "<input type=\"submit\" value=\"Continuar\" class=\"button-submit\">"
                        + "            </form>");
                System.out.println("Hey");
                
            System.out.println(Redirect.getType());
            System.out.println(Redirect.getProcedence());
            out.println("</body>");
            out.println("</html>");
        }
        
    }



    public static Facade getTool() {
        return tool;
    }

    public static void setTool(Facade tool) {
        CitySelect.tool = tool;
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