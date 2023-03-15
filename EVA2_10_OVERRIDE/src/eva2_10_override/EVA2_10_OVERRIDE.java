/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_override;

/**
 *
 * @author invitado
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        Persona perso2 = new Persona("Laura",18);
        System.out.println(perso);
        System.out.println(perso2);
    }
    
}
class Persona{
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "___";
        this.edad = -1;
    }

   
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        String Cade = "Datos: \n" +
                       "Nombre: " + nombre + "\n" +
                       "Edad: " + edad;
                
       return Cade;
    }
}
