package eva2_5_super;

public class Persona {
    private String nom;
    private String apater;
    private String amater;
    private int edad;
    private char genero;
    
    public Persona(){
        nom = "Sin nombre";
        apater = "Sin apellido paterno";
        amater = "Sin apellido materno";
        edad = 0;
        genero = '-';
    }

    public Persona(String nom, String apater, String amater, int edad, char genero) {
        this.nom = nom;
        this.apater = apater;
        this.amater = amater;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApater() {
        return apater;
    }

    public void setApater(String apater) {
        this.apater = apater;
    }

    public String getAmater() {
        return amater;
    }

    public void setAmater(String amater) {
        this.amater = amater;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public void imprimirdatos(){
        System.out.println("Edad: "+ edad);
        System.out.println("Apellido paterno: "+ apater);
        System.out.println("Apellido materno: "+ amater);
        System.out.println("Genero: "+ genero);
}
    
}
