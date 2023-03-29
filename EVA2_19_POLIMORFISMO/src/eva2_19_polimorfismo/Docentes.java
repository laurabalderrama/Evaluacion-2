package eva2_19_polimorfismo;

//Docentes is a Persona
public class Docentes extends Persona {

    private String plaza;
    
    public Docentes(){
        super();
        this.plaza = "______";
    }

    public Docentes(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
 public void imprimirDatos(){
     super.imprimirDatos();
        System.out.println("Plaza: " + plaza);
 }
}
