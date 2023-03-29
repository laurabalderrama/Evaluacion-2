package SuperClases;

/**
 * @author laura
 */
public abstract class Productos {
    protected double precio;
    private String descripcion;
    private String unidadVenta;

    public Productos() {
        precio = 0;
        descripcion = "";
        unidadVenta = "";
    }

    public Productos(double precio, String descripcion, String unidadVenta) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.unidadVenta = unidadVenta;
    }
    
    public abstract double precioVenta(int cant);

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }
    
    
}
