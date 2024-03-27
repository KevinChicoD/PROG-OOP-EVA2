/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_libreria;

/**
 *
 * @author invitado
 */
public class EVA2_7_LIBRERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros libro = new Libros("Juan", "El rey de nascar", 89.65, 80);
        libro.ImprimirDatos();
        libro.VenderCopias(5);
        System.out.println("");
        libro.ImprimirDatos();
        libro.OrdenarCopias(100);
        System.out.println("");
        libro.ImprimirDatos();
        libro.VenderCopias(20);
        System.out.println("");
        libro.ImprimirDatos();
    }
    
}
