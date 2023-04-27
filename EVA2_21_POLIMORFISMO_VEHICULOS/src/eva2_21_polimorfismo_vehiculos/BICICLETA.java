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
public class BICICLETA extends VEHICULO implements ControlarDatos{
    private String tipo;

    public BICICLETA() {
    }

    public BICICLETA(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
