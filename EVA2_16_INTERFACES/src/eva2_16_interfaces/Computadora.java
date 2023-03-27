package eva2_16_interfaces;

/**
 *
 * @author Diego
 */
public class Computadora extends Producto 
        implements MostrarDatos { //Implementamos interfaces
    private String marca;
    private String procesador;

    public Computadora() {
        marca = "";
        procesador = "";
    }

    public Computadora(String marca, String procesador) {
        this.marca = marca;
        this.procesador = procesador;
    }

    public Computadora(String marca, String procesador, double precio, String nombre) {
        super(precio, nombre);
        this.marca = marca;
        this.procesador = procesador;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("Precio: " + precio);
    }
    
    
}
