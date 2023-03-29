
package Productos;

import superClases.Ropa;

/**
 *
 * @author Usuario
 */
public final class Jeans extends Ropa{
    private String estilo;
    private String material;

    public Jeans() {
    }
    

    public Jeans(String estilo, String material) {
        this.estilo = estilo;
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double precioVenta(int cant) {
        if(cant <10)
            return precio * cant;
        else
            return (precio * 0.8) * cant;
    }
    
    
}
