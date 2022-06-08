/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sobre_carga;

/**
 *
 * @author dayni
 */
public interface Triatlon {

    String nombre = "";
    double tSalida=0;
    double tLlegada=0;
    
    public double suT();
    public void competidor();

    public default void ganador(double tAtle, double tCicl, double tNad) {
        if ((tAtle + tCicl + tNad) > 70) {
            System.out.println("Campion");
            competidor();
        } else {
            System.out.println("Perdedor");
            competidor();           
        }

    }

    public default void tiempoCompetencia(double tAtle, double tCicl, double tNad) {
            System.out.println("Su tiempo de competencia es: "+(tAtle + tCicl + tNad));
            competidor();
            

    }
}
