/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_8_clases_abstracta;

/**
 *
 * @author KEVIN
 */
public class Estudiante extends Persona {
    private String noControl;

    public Estudiante(String noControl) {
        super();
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //Al ser protected, podemos ver los atributos 
    //de persona por estar vinculados por herencia 
    //tambien 
    
public void impirmirDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("No. Control: " + noControl);
}    
}
