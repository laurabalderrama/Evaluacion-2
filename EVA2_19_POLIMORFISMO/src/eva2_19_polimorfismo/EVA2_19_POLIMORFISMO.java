
package eva2_19_polimorfismo;

/**
 *
 * @author Usuario
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docentes docentes = new Docentes("202029","juan ","perez",50);
        //docentes.imprimirDatos();
        Estudiantes estudiantes = new Estudiantes("224232","pedro ","perez",18);
        //estudiantes.imprimirDatos();
        //esto es polimorfismo:
        //ocultamos propiedades
        Persona persona = docentes;
        persona.imprimirDatos();
        
        Persona persona2 = estudiantes;
        persona2.imprimirDatos();
        /** ahora al revés
        no se puede hacer la conversión de super clase a subclase
        en este caso, no existe la plaza
        Persona perso = new Persona ();
        Docentes doce = perso;
        * */
    }
    
}
