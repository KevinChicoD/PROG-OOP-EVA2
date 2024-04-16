/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        estudiante estu = new estudiante("21231321", "Kevin", "Chico");
        System.out.println(estu);
        
        persona perso = estu;
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellidos: " + perso.getApellido());
        
        persona perso1 = new persona("Kevler", "Xiaomi");
        System.out.println(perso1);
        
        //estudiante estu1 = perso; //NOSE PUEDEEE
    }
    
}
   class persona{
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
    }
        class estudiante extends persona{
        private String nocontrol;
        
         public estudiante() {
            super();
            nocontrol = "";
        }

        public estudiante(String nocontrol, String nombre, String apellido) {
            super(nombre, apellido);
            this.nocontrol = nocontrol;
        }

        public String getNocontrol() {
            return nocontrol;
        }

        public void setNocontrol(String nocontrol) {
            this.nocontrol = nocontrol;
        }
                    
    }