package Productos;

import SuperClases.Ropa;

/**
 *
 * @author laura
 */
public class Jeans extends Ropa {
    private String material;
    private String corte;

    public Jeans() {
        this.material = "";
        this.corte = "";
    }
    public Jeans(String material, String corte, String talla, String marca, String color, double precio, String descripcion, String unidadVenta) {
        super(talla, marca, color, precio, descripcion, unidadVenta);
        this.material = material;
        this.corte = corte;
    }
    public String getMaterial() {return material;}
    
    public void setMaterial(String material) {this.material = material;}
    
    public String getCorte() {return corte;}
    
    public void setCorte(String corte) {this.corte = corte;}

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double precioVenta(int cant) {
        /*antes de cierta cantidad manejamos precio normal,
        despues de cierta cantidad hay descuento */
        
        if(cant < 10)
            return precio * cant;
        else
            return(precio * 0.8) * cant;
    }
    
}
