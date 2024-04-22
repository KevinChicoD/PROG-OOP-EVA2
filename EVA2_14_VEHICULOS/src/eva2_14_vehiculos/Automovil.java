/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_vehiculos;

/**
 *
 * @author ihdzg
 */
public class Automovil extends Vehiculo{
    private int noPuertas;

    public Automovil() {
    }

    public Automovil(int noPuertas, int velocidad) {
        super(velocidad);
        this.noPuertas = noPuertas;
    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }
}
