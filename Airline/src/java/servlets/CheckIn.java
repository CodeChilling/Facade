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
    private static String city;
     private static String hola;

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
        
        if(data.get(0).toString()==""){
            city = data.get(1);
        }
        else{
            city = data.get(0);
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Aprendiendo</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"css/style-ticket.css\">\n" +
                    "<link rel=\"icon\" type=\"image/png\" href=\"https://image.flaticon.com/icons/svg/2979/2979504.svg\" />"+
                    "    <link href=\"https://fonts.googleapis.com/css2?family=Arimo&display=swap\" rel=\"stylesheet\">\n" +
                    "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<section class=\"container\">\n" +
                    "         <div class=\"columna font border\">\n" +
                    "            <h2>Plan "+request.getContextPath()+"</h2>\n" +
                    "            <p><strong>Ciudad: </strong>"+city+"</p>\n" +
                    "            <p><strong>Hotel: </strong>"+data.get(2)+"</p>\n" +
                    "            <p><strong>Dias: </strong>"+data.get(3)+"</p>\n" +
                    "            <hr>\n" +
                    "            <p><strong>Identidad: </strong>"+data.get(4)+"</p>\n" +
                    "            <p><strong>Nombre: </strong>"+data.get(5)+"</p>\n" +
                    "            <p><strong>Telefono: </strong>"+data.get(6)+"</p>\n" +
                    "            <p><strong>Partida: </strong>"+data.get(7)+"</p>\n" +
                    "            <hr>\n" +
                    "            <p><strong>Fecha: </strong>"+data.get(8)+"</p>\n" +
                    "            <p><strong>Hora: </strong>"+data.get(9)+"</p>\n" +
                    "            <hr>\n" +
                    "            <button type=\"button\" class=\"btn-ticket\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n" +
                    "                Reservar Ya\n" +
                    "              </button>\n" +
                    "            <!--<a href=\"\" class=\"btn-ticket\">Reservar Ya</a>-->\n" +
                    "         </div>\n" +
                    "         \n" +
                    "     </section>  \n" +
                    "     <!-- Modal -->\n" +
                    "     <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n" +
                    "        <div class=\"modal-dialog\">\n" +
                    "          <div class=\"modal-content\">\n" +
                    "            <div class=\"modal-header\">\n" +
                    "              <h5 class=\"modal-title\" id=\"exampleModalLabel\">¡Se ha Reservado Con Exito!</h5>\n" +
                    "            </div>\n" +
                    "            <div class=\"modal-footer\">\n" +
                    "                <a href=\"index.jsp\" class=\"btn btn-primary\">Continuar</a>\n" +
                    "            </div>\n" +
                    "          </div>\n" +
                    "        </div>\n" +
                    "      </div> \n" +
                    "\n" +
                    "      <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
                    "      <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
                    "      <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>");
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
