package SuperClases;

/**
 * @author Diego
 */
public abstract class Ropa extends Productos{
    private String talla;
    private String marca;
    private String color;

    public Ropa() {
        talla = "";
        marca= "";
        color = "";
    }

    public Ropa(
            String talla, String marca, String color, double precio, String descripcion, String unidadVenta) {
        super(precio, descripcion, unidadVenta);
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
