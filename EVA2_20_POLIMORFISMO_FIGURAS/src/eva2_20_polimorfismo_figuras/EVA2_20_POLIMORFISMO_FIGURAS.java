/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Cuántas figuras necesitas?:");
        Scanner input = new Scanner (System.in);
        int cant = input.nextInt();
        Figuras [] figuras = new Figuras [cant];
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("que tipo de figura necesitas: 1 circulo, 2 triangulo");
            int tipo = input.nextInt();
            if(tipo == 1){
                Circulo circu = new Circulo();
                System.out.println("Introduce el radio");
                circu.setRadio(input.nextDouble());//capturamos el dato del usuario
                figuras[i] = circu;
             }else{//triangulo
                Triangulo trian = new Triangulo();
                System.out.println("Introduce la base");
                trian.setBase(input.nextDouble());
                System.out.println("Introduce la altura");
                trian.setAltura(input.nextDouble());
                figuras[i] = trian;
                
            }
        }
    for (int i = 0; i < figuras.length; i++) {
        if(figuras[i] instanceof Circulo){
        System.out.println("Circulo: " + i);
        Circulo circu = (Circulo) figuras[i];
        circu.imprimirDatos();
        }else{
        System.out.println("Triangulo: " + i);
        System.out.println("Area: " + figuras[i].calcularArea());
        System.out.println("Perimetro: " + figuras[i].calcularPeri());
        Triangulo trian = (Triangulo) figuras[i];
        trian.imprimirDatos();
    }
   }     
  }
}
