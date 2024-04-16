/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_polimorfismo_2;

/**
 *
 * @author invitado
 */
public class persona implements MostrarDatos{
       String nombre;
        String apellido;
        
    public persona() {
        nombre = "";
        apellido = "";
    }
        
    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
        @Override
        public String toString(){
            return nombre + " " + apellido;
        }
        
       @Override
        public void imprimirdatos(){
            System.out.println("Nombre: " + nombre + "\n" +
                    "Apellidos: " + apellido);
        } 
}


