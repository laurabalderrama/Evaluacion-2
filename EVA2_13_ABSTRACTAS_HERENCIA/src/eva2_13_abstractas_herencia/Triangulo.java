package eva2_13_abstractas_herencia;

/**
 * @author laura
 */
public class Triangulo extends Figuras{
    private double base;
    private double altura;

    public Triangulo() {
        base = -1;
        altura = -1;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public double calcularArea(){
        double area = (base*altura)/2;
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double peri = base*3;
        return peri;
    }
}
