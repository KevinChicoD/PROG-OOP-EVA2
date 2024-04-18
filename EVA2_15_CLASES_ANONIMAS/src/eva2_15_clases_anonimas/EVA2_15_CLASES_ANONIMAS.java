/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_clases_anonimas;

/**
 *
 * @author KEVIN
 */
public class EVA2_15_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prueba prueba = new Prueba();
        //Los metodos de la interfaz
        //RELACION POR HERENCIA
        Prueba prueba = new Prueba() {
            @Override
            public void MostrarMensaje() {
                System.out.println("Hola mundo");
            }
    };
    prueba.MostrarMensaje();
    
    ClaseAbstracta prueba2 = new ClaseAbstracta() {
            @Override
            public void otroMensaje() {
                System.out.println("Clase abstracta");
            }
    };
    prueba2.otroMensaje();
    prueba2.mensaje();
}
}


interface Prueba{
    public void MostrarMensaje();
}

abstract class ClaseAbstracta{
    public abstract void otroMensaje();
    
    public void mensaje(){
        System.out.println("Hola mundo");      
    }
}

