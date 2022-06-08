/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobre_carga;

/**
 *
 * @author dayni
 */
public class Nadador implements Triatlon{
double tSalida;
    double tLlegada;

    public Nadador(double tSalida, double tLlegada) {
        this.tSalida = tSalida;
        this.tLlegada = tLlegada;
    }


    @Override
    public double suT() {
         System.out.println("Su tiempo en natacion es: " + (tLlegada - tSalida));
        return (tLlegada - tSalida);    }

    @Override
    public void competidor() {
      }
    
}
