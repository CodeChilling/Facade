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
public class Info extends HttpServlet {

    private static String city;
    

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
            out.println("<meta charset=\"utf-8\">\n" +
                    "    <title>Adrianca</title>\n" +
                    "<link rel=\"icon\" type=\"image/png\" href=\"https://image.flaticon.com/icons/svg/2979/2979504.svg\" />"+
                    "    <link rel=\"stylesheet\" href=\"css/style_form.css\">");
            out.println("</head>");
            out.println("<body>");
           out.println("<form action=\"CheckInfo\" method=\"GET\">\n" +
                        "    <div class=\"login-box\">\n" +
                        "    <h1>"+request.getContextPath()+"</h1>\n" +
                        "    <div class=\"textbox\">\n" +
                        "        <i class=\"far fa-calendar-check\"></i>\n" +
                                "<label for=\"date_select\"><strong>Fecha de Salida</strong></label>"+
                        "        <select name=\"date_select\" id=\"date_select\" class=\"select-type\">\n");
            for (int i = 0; i < CitySelect.getTool().getRandomDate().size(); i++) {
                out.println(" "
                        + "                            <option class=\"value-type\" value=\"" + CitySelect.getTool().getRandomDate().get(i) + "\">" + CitySelect.getTool().getRandomDate().get(i) + "</option>\n"
                        + " ");
            }
            
            out.println("</select>\n" +
                        "    </div>\n" +
                        "\n" +
                        "        <div class=\"textbox\">\n" +
                        "            <i class=\"far fa-calendar-alt\"></i>\n" +
                     "<label for=\"date_select\"><strong>Hora de Salida</strong></label>"+
                        "        <select name=\"time_select\" id=\"time_select\" class=\"select-type\">\n");
            for (int i = 0; i < CitySelect.getTool().getRandomTime().size(); i++) {
                out.println(" "
                        + "                            <option class=\"value-type\" value=\"" + CitySelect.getTool().getRandomTime().get(i) + "\">" + CitySelect.getTool().getRandomTime().get(i) + "</option>\n"
                        + " ");
            }
            out.println("</select>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <div class=\"textbox\">\n" +
                        "        <i class=\"fas fa-chair\"></i>\n" +
                     "<label for=\"date_select\"><strong>Tipo de Asiento</strong></label>"+
                        "        <select name=\"city_select\" id=\"city_select\" class=\"select-type\">\n");
            for (int i = 0; i < CitySelect.getTool().getRandomSeat().size(); i++) {
                out.println(" "
                        + "                            <option class=\"value-type\" value=\"" + CitySelect.getTool().getRandomSeat().get(i) + "\">" + CitySelect.getTool().getRandomSeat().get(i) + "</option>\n"
                        + " ");
            }
            out.println( "        </select>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <input type=\"submit\" class=\"btn\" value=\"Continuar\">\n" +
                        "    </div>\n" +
                        "</form>");
                        
            
            /*out.println("<h1>Servlet Welcome at " + request.getContextPath() + "</h1>" + "\n"
                    + "<form action=\"CheckInfo\" method=\"GET\" class=\"form\">\n"
                    + "\n"
                    + "          \n"
                    + "\n"
                    + "                        <select class=\"form-control list\" id=\"date_select\" name=\"date_select\">\n");
            for (int i = 0; i < CitySelect.getTool().getRandomDate().size(); i++) {
                out.println(" "
                        + "                            <option value=\"" + CitySelect.getTool().getRandomDate().get(i) + "\">" + CitySelect.getTool().getRandomDate().get(i) + "</option>\n"
                        + " ");
            }

            out.println("                        </select>\n"
                    + "                        <select class=\"form-control list\" id=\"time_select\" name=\"time_select\">\n");
            for (int i = 0; i < CitySelect.getTool().getRandomDate().size(); i++) {
                out.println(" "
                        + "                            <option value=\"" + CitySelect.getTool().getRandomDate().get(i) + "\">" + CitySelect.getTool().getRandomDate().get(i) + "</option>\n"
                        + " ");
            }

            out.println("                        </select>\n"
                           + "                        <select class=\"form-control list\" id=\"seat_select\" name=\"seat_select\">\n");
            for (int i = 0; i < CitySelect.getTool().getRandomSeat().size(); i++) {
                out.println(" "
                        + "                            <option value=\"" + CitySelect.getTool().getRandomSeat().get(i) + "\">" + CitySelect.getTool().getRandomSeat().get(i) + "</option>\n"
                        + " ");
            }

            out.println("                        </select>\n"
                    + "<input type=\"submit\" value=\"Continuar\" class=\"button-submit\">"
                    + "            </form>"
                    + "\n");*/

            out.println("</body>");
            out.println("</html>");
        }
        Info.setCity(request.getParameter("city_select"));

    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Info.city = city;
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
