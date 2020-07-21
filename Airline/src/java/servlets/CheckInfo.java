/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
public class CheckInfo extends HttpServlet {

    private static String date;
    private static String time;
    private static String seat;
    /*String residence, int residenceLenght, String ID, String name, String phone*/

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
            out.println("<form action=\"CheckIn\" method=\"GET\">\n" +
                        "<div class=\"login-box\">\n" +
                        "  <h1>AirLine</h1>\n" +
                        "  <div class=\"textbox\">\n" +
                        "    <i class=\"fas fa-user-edit\"></i>\n" +
                        "    <input type=\"text\" placeholder=\"Nombre Completo\" name=\"full-name\" id=\"full-name\" required>\n" +
                        "  </div>\n" +
                        "  <div class=\"textbox\">\n" +
                        "    <i class=\"far fa-id-card\"></i>\n" +
                        "    <input type=\"number\" placeholder=\"Escriba su ID\" name=\"full-id\" id=\"full-id\" required>\n" +
                        "  </div>\n" +
                        "  <div class=\"textbox\">\n" +
                        "    <i class=\"fas fa-phone\"></i>\n" +
                        "    <input type=\"number\" placeholder=\"Numero de Contacto\" name=\"full-phone\" id=\"full-phone\" required>\n" +
                        "  </div>\n" +
                        "  <div class=\"textbox\">\n" +
                        "    <i class=\"fas fa-hotel\"></i>\n" +
                        "    <input type=\"text\" placeholder=\"Nombre de Hotel\" name=\"full-hotel\" id=\"full-hotel\" required>\n" +
                        "  </div>\n" +
                        "  <div class=\"textbox\">\n" +
                        "    <i class=\"fas fa-sun\"></i>\n" +
                        "    <input type=\"number\" placeholder=\"Dias de Estadia\" name=\"full-estance\" id=\"full-estance\" required>\n" +
                        "  </div>\n" +
                        "\n" +
                        "  <input type=\"submit\" class=\"btn\" value=\"Continuar\">\n" +
                        "</div>\n" +
                        "</form>");
            /*out.println("<h1>Servlet Welcome at " + request.getContextPath()
                    + "<form action=\"CheckIn\" method=\"GET\" class=\"form\">\n"
                    + "\n"
                    + "          \n"
                    + "\n"
                    + "                <input type=\"text\" class=\"form-control\" placeholder=\"Escriba su Nombre Completo\" name=\"full-name\" id=\"full-name\" required>"
                    + "                <input type=\"text\" class=\"form-control\" placeholder=\"Escriba su ID\" name=\"full-id\" id=\"full-id\" required>"
                    + "                <input type=\"number\" class=\"form-control\" placeholder=\"Escriba su numero de contacto\" name=\"full-phone\" id=\"full-phone\" required>"
                    + "                <input type=\"text\" class=\"form-control\" placeholder=\"Escriba el nombre del hotel donde se va a hospedar\" name=\"full-hotel\" id=\"full-hotel\" required>"
                    + "                <input type=\"number\" class=\"form-control\" placeholder=\"Escriba la duracion de su estancia\" name=\"full-estance\" id=\"full-estance\" required>"
                    + "<input type=\"submit\" value=\"Continuar\" class=\"button-submit\">"
                    + "            </form>");*/

            out.println("</body>");
            out.println("</html>");
        }
        CheckInfo.setDate(request.getParameter("date_select"));
        CheckInfo.setTime(request.getParameter("time_select"));
        CheckInfo.setSeat(request.getParameter("seat_select"));
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        CheckInfo.date = date;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        CheckInfo.time = time;
    }

    public static String getSeat() {
        return seat;
    }

    public static void setSeat(String seat) {
        CheckInfo.seat = seat;
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
