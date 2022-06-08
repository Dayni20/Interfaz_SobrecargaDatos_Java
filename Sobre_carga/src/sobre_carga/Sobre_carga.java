/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobre_carga;

/**
 *
 * @author dayni
 */
public class Sobre_carga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Dayana");
        // p.competidor();
        Ciclista c = new Ciclista(100, 250);
        // c.suT();

        Atleta a = new Atleta(140, 200);
        //  a.suT();

        Nadador n = new Nadador(160, 250);
        //  n.suT();

        p.ganador(c.suT(), a.suT(), n.suT());
        double tiempo = c.suT();
        p.tiempoCompetencia(c.suT(), a.suT(), n.suT());
        System.out.println(".....................");
        Atleta a1 = new Atleta(150);
        a1.tiempoSalida();
        
        a1.tiempoSalida(20);
        
        a1.tiempoSalida(20, "Erika");

    }

}
