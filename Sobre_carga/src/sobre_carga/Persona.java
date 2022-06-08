/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobre_carga;

/**
 *
 * @author dayni
 */
public class Persona implements Triatlon{
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void competidor() {
        System.out.println(nombre);
          }

    @Override
    public double suT() {
        return 0;
    }
    
}
