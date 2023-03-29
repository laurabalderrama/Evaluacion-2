package eva2_18_uso_interfaces;

/**
 *
 * @author laura
 */
public class EVA2_18_USO_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circ = new Circulo(50);
        circ.imprimirDatos();
        System.out.println();
        
        Triangulo tri = new Triangulo(20, 20);
        tri.imprimirDatos();
    }
    
}
