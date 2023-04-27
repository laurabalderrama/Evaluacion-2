package eva2_22_has_a_direccion;

/**
 *
 * @author Usuario
 */
public class EVA2_22_HAS_A_DIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Kenia");
        perso.setApellidos("Os");
        perso.setEdad(21);
        /*Direccion direccion = new Direccion(); 
        direccion.setCalle("Av. industrias");
        direccion.setNumero(11101);
        direccion.setColonia("Complejo Industrial Chihuahua");
        direccion.setCp("31305");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        
        perso.setDireccion(direccion);*/
        perso.imprimirDatos();
    }
    
}
class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "__";
        this.numero = 0;
        this.colonia = "__";
        this.cp = "___";
        this.ciudad = "__";
        this.estado = "___";
    }

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     public void imprimirDatos(){
         System.out.println("Direccion: ");
          System.out.println(calle + " #" + numero + ", " +
                        colonia + ", C.P.:"  + cp + ", " + ciudad 
                                + ", " + estado);
         
     }
}
class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direccion; //persona has-a (tirnr una) direccion

    public Persona() {
        this.nombre = "___";
        this.apellidos = "___";
        this.edad = 0;
        this.direccion = null;//la dirección no existe
    }

    public Persona(String nombre, String apellidos, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public void imprimirDatos(){
        System.out.println("Persona: ");
        System.out.println(nombre + " " + apellidos +
                        ", "+ edad + " años");
        if(direccion == null)
            System.out.println("Sin dirección");
        else
        direccion.imprimirDatos();
    }
}