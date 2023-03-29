package eva2_18_uso_interfaces;

/**
 *
 * @author laura
 */
public class Circulo implements Figuras, MostrarDatos {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /*
    La interfaz es como un contrato, te obliga a seguir cierto
    comportamiento.
    */
    @Override
    public double calcularArea() {
        return Math.round(Math.PI * (radio * radio));
    }

    @Override
    public double calcularPeri() {
        return Math.round(Math.PI * 2 * radio);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPeri());
    }
    
}
