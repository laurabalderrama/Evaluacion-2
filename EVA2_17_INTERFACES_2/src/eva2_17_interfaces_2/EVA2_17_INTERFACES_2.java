package eva2_17_interfaces_2;

/**
 *
 * @author laura
 */
public class EVA2_17_INTERFACES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface IntA{
    void A(); //Equivale a public abstract void A();
}
interface IntB{
    public abstract void B(); //Equivale a void B();
}

interface IntC extends IntA, IntB{
    void C();
}

class Prueba implements IntC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }
    
}
