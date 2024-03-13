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
public class Triangulo extends Figura {
   private double base;
   private double altura;
   
     public Triangulo() {
        base = 0;
        altura = 0;
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
    public double CalArea() {
        return (base * altura) / 2;
    }
    
    private double calcularhipo(){
        return Math.sqrt(Math.pow(base, 2 + Math.pow(altura, 2)));
    }

    @Override
    public double CalPeri() {
        return base + altura + calcularhipo();
    }

}
