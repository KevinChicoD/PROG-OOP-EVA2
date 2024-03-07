package eva2_2_sobrecargar_constructores;
public class EVA2_2_SOBRECARGAR_CONSTRUCTORES {
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.Imprimirdatos();
        
        Persona perso2 = new Persona("Kevin", "Chico", 18);
        perso2.Imprimirdatos();
        perso2.setNombre("Luis");
        perso2.setApellidos("Quiñones");
        perso2.setEdad(65);
        perso2.Imprimirdatos();
        
    }
    
}
