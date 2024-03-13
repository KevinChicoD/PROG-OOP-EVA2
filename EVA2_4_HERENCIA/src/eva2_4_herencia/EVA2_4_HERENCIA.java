/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_herencia;

/**
 *
 * @author invitado
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso= new Persona();
        perso.getNombre();
        
        Estudiante estu = new Estudiante();
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellidos: " + estu.getApellidos());
        System.out.println("Edad: " + estu.getEdad());
    }
    
}

class Persona{
    private String nombre;
    private int edad;
    private String apellidos;
    
      public Persona() {
        nombre = "Sin nombre";
        apellidos = "Sin apellidos";
        edad = 0;
      }
        

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
}

class Estudiante extends Persona{
    private String nocontrol;
    
     public Estudiante() {
        nocontrol = "Sin numero de control";

     }
     
    public Estudiante(String nocontrol, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.nocontrol = nocontrol;
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }
    
}