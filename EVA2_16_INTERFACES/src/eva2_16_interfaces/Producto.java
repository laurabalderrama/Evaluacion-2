package eva2_16_interfaces;

/**
 * @author Diego
 */
public abstract class Producto {
    protected double precio;
    protected String nombre;

    public Producto() {
        precio = 0;
        nombre = "";
    }
    
    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
