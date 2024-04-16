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
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*persona perso1 = new persona("Raul", "Jimenez");
        persona perso2 = new persona("Julimes", "Norbin");
        persona perso3 = new persona("Aguacate", "Zanahorio");
        
        estudiante estu1 = new estudiante("3212131", "Kevler", "Xiaomi");
        estudiante estu3 = new estudiante("1213213", "Luis", "Nose");
        estudiante estu2 = new estudiante("1321133", "Irvin", "Saul");
        
        imprimirdatos(perso1);
       
        System.out.println("");
        imprimirdatos(perso2);
        
        System.out.println("");
        imprimirdatos(perso3);
        
        System.out.println("");
        imprimirdatos(estu1);
        
        System.out.println("");
        imprimirdatos(estu2);
        
        System.out.println("");
        imprimirdatos(estu3);*/
        
        estudiante estudiantes[] = new estudiante[3000];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new estudiante("00000", "SIN DATOS", "SIN DATOS");
        }
        for (int i = 0; i < estudiantes.length; i++) {
            imprimirdatos(estudiantes[i]);
            System.out.println("");
        }
    }
    
    public static void imprimirdatos(MostrarDatos datos){
        datos.imprimirdatos();
        //CASTING
        estudiante estu;
        persona perso;
        
        if(datos instanceof estudiante){
            estu = (estudiante)datos;
        
        }else{
            perso = (persona)datos;
        }
    }
}
