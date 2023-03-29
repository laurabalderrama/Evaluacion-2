/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superClases;

/**
 *
 * @author Usuario
 */
public final class Computadora extends Electronica {
    private int memoria;
    private double tamaPantalla;
    private double discoDuro;
    private String procesador;

    public Computadora() {
    }

    public Computadora(int memoria, double tamaPantalla, double discoDuro, String procesador, String fabricante, String modelo, int garantia, double precio, String nombre, String unidadVenta) {
        super(fabricante, modelo, garantia, precio, nombre, unidadVenta);
        this.memoria = memoria;
        this.tamaPantalla = tamaPantalla;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamaPantalla() {
        return tamaPantalla;
    }

    public void setTamaPantalla(double tamaPantalla) {
        this.tamaPantalla = tamaPantalla;
    }

    public double getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(double discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    public double precioVenta(int cant) {
        if(cant <10)
            return getPrecio() * cant;
        else
            return (getPrecio() * 0.8) * cant;
    }
    
    
}
