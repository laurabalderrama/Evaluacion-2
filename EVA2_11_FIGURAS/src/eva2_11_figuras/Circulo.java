package eva2_11_figuras;

/**
 * @author Diego
 */
public class Circulo extends Figuras {
    private double radio;
    
    public Circulo(){
        radio = -1;
    }
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea(){
        double area = Math.PI*(radio*radio);
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double peri = Math.PI*2*radio;
        return peri;
    }
}
