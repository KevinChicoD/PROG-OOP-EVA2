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
public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo car = new Vehiculo();
        car.imprimirdatos();
        
        System.out.println("");
        
        Vehiculo car2 = new Vehiculo("Ford", "Raptor", 2024, "negro");
        car2.imprimirdatos();
    }
    
}
