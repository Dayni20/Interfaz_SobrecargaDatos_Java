/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobre_carga;

/**
 *
 * @author dayni
 */
public class Ciclista implements Triatlon {

    double tSalida;
    double tLlegada;

    public Ciclista(double tSalida, double tLlegada) {
        this.tSalida = tSalida;
        this.tLlegada = tLlegada;

    }
    

    @Override
    public double suT() {
        System.out.println("Su tiempo en ciclismo es: " + (tLlegada - tSalida));
        return (tLlegada - tSalida);
    }

    @Override
    public void competidor() {
       }

}
