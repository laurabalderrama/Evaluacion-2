
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author Usuario
 */
public class AUTOMOVIL extends VEHICULO implements ControlarDatos{
    private String modelo;
    private int año;

    public AUTOMOVIL() {
    }

    public AUTOMOVIL(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
    }

    public AUTOMOVIL(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
}
