
package eva2_11_has_a;


public class Persona {
    private String Nombre;
    private String Ap;
    private int Edad;
    private Direccion direccion;

    public Persona() {
        this.Nombre = "";
        this.Ap = "";
        this.Edad = 0;
        this.direccion = new Direccion();
    }

    public Persona(String Nombre, String Ap, int Edad, Direccion direccion) {
        this.Nombre = Nombre;
        this.Ap = Ap;
        this.Edad = Edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAp() {
        return Ap;
    }

    public void setAp(String Ap) {
        this.Ap = Ap;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString(){
        String cade = "Nombre: " + Nombre + "\n" + 
                      "Apellido: "+ Ap +"\n" +
                      "Edad: "+ Edad +"\n" +
                      "Direccion: "+ direccion ;
        return cade;
    }
  
}
