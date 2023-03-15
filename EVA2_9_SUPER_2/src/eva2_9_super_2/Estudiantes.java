package eva2_9_super_2;
//Clase Derivada extens Clase Base
//Subclase extends Superclase
//Clase Padre Clase Hijo
//Estudiante is a Persona 

public class Estudiantes extends Persona {

    private String noControl;

    public Estudiantes() {
        super();//llamada al constructor de la super clase
        this.noControl = "_____";
    }

    public Estudiantes(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    } 
    @Override
     public void imprimirDatos(){
         super.imprimirDatos();
         System.out.println("No. De control: " + noControl);
     }

}
