/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_herencia;

/**
 *
 * @author invitado
 */
public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String plaza;
 
    public Docente(){
     
 }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public Docente(String nombre, String apellido, int edad, String plaza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.plaza = plaza;
    }
    
}
