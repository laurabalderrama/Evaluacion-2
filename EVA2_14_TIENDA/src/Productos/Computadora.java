package Productos;

import SuperClases.Electronica;

/**
 *
 * @author laura
 */
public final class Computadora extends Electronica{
    private int memoria;
    private double tamanoPantalla;
    private double almacenamiento;
    private String procesador;

    public Computadora() {
        this.memoria = 0;
        this.tamanoPantalla = 0;
        this.almacenamiento = 0;
        this.procesador = "";
    }

    public Computadora(int memoria, double tamanoPantalla, double almacenamiento, String procesador, String fabricante, String modelo, int garantia, double precio, String descripcion, String unidadVenta) {
        super(fabricante, modelo, garantia, precio, descripcion, unidadVenta);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
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
        /*antes de cierta cantidad manejamos precio normal,
        despues de cierta cantidad hay descuento */
        
        if(cant < 10)
            return getPrecio() * cant;
        else
            return(getPrecio() * 0.8) * cant;
    }
    
}
