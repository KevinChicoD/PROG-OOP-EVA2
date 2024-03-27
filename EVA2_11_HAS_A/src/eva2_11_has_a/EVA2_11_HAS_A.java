
package eva2_11_has_a;


public class EVA2_11_HAS_A {

   
    public static void main(String[] args) {
        Direccion direc = new Direccion ("CAMPO DEL VINEDO", "CAMPO BELLO", 33124, "9527", "CHIHUAHUA ", "CHIHUAHUA");
        Persona perso = new Persona("Kevin", "Chico", 18, direc);
        System.out.println(perso);
    }
    
}
