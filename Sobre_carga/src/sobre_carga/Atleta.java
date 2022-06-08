/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobre_carga;

/**
 *
 * @author dayni
 */
public class Atleta implements Triatlon {
double tSalida;
    double tLlegada;

    public Atleta(double tSalida, double tLlegada) {
        this.tSalida = tSalida;
        this.tLlegada = tLlegada;
    }

    public Atleta(double tSalida) {
        this.tSalida = tSalida;
    }

    
    public void tiempoSalida(){
        double r;
        r=50/tSalida;
        System.out.println("La rapidez del atleta es: "+r);
        
    }
        
    public void tiempoSalida(double d){
        double r;
        r=d/tSalida;
        System.out.println("La rapidez del atleta con la distancia: "+d + " es" +r);
    }  
   
     public void tiempoSalida(double d, String nAtlet){
        double r;
        r=d/tSalida;
        System.out.println("La rapidez de: "+nAtlet+ " con la distancia de" +d + " es" +r);
    }  
   
    

    @Override
    public double suT() {
     System.out.println("Su tiempo en atletismo es: " + (tLlegada - tSalida));
        return (tLlegada - tSalida);
    }

    @Override
    public void competidor() {
     }
    
}
