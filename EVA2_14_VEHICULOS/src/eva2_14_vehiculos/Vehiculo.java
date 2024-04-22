/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_vehiculos;

/**
 *
 * @author ihdzg
 */
public abstract class Vehiculo {
    private int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public Vehiculo() {
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void acelerar (int ajuste) {
        velocidad += ajuste;
    }
    
}
