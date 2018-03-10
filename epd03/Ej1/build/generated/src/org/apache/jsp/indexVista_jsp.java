package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import aparcamiento.cocheModelo;
import aparcamiento.parkingControlador;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public final class indexVista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 List<cocheModelo> cochesAparcados = parkingControlador.cochesZonaAzul();
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Epd3_Ej1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registro de Zona Azul</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Veh&iacute;culo</th>\n");
      out.write("                <th>Modelo</th>\n");
      out.write("                <th>Hora de entrada</th>\n");
      out.write("                <th>Hora de salida</th>\n");
      out.write("                <th>Tiempo permitido</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (cocheModelo cm : cochesAparcados) {
                    //Matricula
                    String vehiculo = cm.getMatricula();
                    //Modelo
                    String modelo = cm.getModelo();
                    //Hora entrada y salida
                    Calendar horaEntrada = cm.getHoraEntrada();
                    Calendar horaSalida = cm.getHoraSalida();
                    //Formato fecha
                    SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
                    String cadenaFechaEntrada = formato.format(horaEntrada.getTime());
                    String cadenaFechaSalida = horaSalida == null ? "--" : formato.format(horaSalida.getTime());
                    //Tiempo permitido
                    int tiempoPermitido = cm.getTiempoPermitido();
                    String cadTiempoPermitido = String.valueOf(tiempoPermitido);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(vehiculo);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(modelo);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(cadenaFechaEntrada);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(cadenaFechaSalida);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(cadTiempoPermitido);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}