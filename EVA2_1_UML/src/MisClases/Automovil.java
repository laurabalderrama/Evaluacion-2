/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MisClases;

/**
 *
 * @author invitado
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    
    public void setMarca(String valor){
        marca = valor;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public void setAño(int valor){
        año = valor;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
    public void ImprimirDatos(){
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("AÑO: " + año);
}
}