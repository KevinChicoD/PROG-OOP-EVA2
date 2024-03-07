/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_vehiculo;

/**
 *
 * @author invitado
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int año;
    private String color;
    
    public Vehiculo(){
        Marca = "Sin marca";
        Modelo = "Sin modelo";
        año = 0;
        color = "Sin color";
    }

    public Vehiculo(String Marca, String Modelo, int año, String color) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.año = año;
        this.color = color;
    }
    
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void imprimirdatos(){
        System.out.println("Modelo: " + Modelo);
        System.out.println("Maeca: " + Marca);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
    }
}
