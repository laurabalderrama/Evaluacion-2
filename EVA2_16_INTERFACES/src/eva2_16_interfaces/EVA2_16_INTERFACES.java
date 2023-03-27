package eva2_16_interfaces;

/**
 *
 * @author Diego
 */
public class EVA2_16_INTERFACES {

    
    
    public static void main(String[] args) {
        Persona perso = new Persona("laura Balderrama", 18);
        perso.imprimirDatos();
        Computadora compu = new Computadora(
                "Hp", "i7", 17000, "Laptop");
        compu.imprimirDatos();
    }
}
