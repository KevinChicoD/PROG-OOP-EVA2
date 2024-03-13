/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_clases_abstractas;

/**
 *
 * @author invitado
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(){
        radio = 0;
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
   
    
    @Override
    public double CalArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double CalPeri() {
        return Math.PI * (radio * 2);
    }

}
