/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_vehiculos;

/**
 *
 * @author ihdzg
 */
public class Motocicleta extends Vehiculo{
    private int capacidad;

    public Motocicleta() {
    }

    public Motocicleta(int capacidad, int velocidad) {
        super(velocidad);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
