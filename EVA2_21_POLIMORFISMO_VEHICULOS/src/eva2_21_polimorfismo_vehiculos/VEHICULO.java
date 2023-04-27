/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author Usuario
 */
public class VEHICULO implements ControlarDatos{
    private String marca;
    protected int velocidad;

    public VEHICULO() {
    }

    public VEHICULO(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
    }

    @Override
    public void tablero() {
    }
    
    
}
