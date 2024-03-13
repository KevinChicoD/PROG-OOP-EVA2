package eva2_5_super;

public class Estudiante extends Persona{
    private String nocontrol;
    private String carrera;
    
    public Estudiante(){
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE
        nocontrol = "Sin numero de control";
        carrera = "Sin carrera asignada";
}
    //REGLA DE HERENCIA: SIEMPRE HAY QUE LLAMAR AL CONSTRUCTOR DE LA SUPERCLASE
    //TIENE QUE SER LA PRIMERA INSTRUCCION DEL CONSTRUCTOR
    public Estudiante(String nom, String apater, String amater, int edad, char genero, String nocontrol,String carrera){
        super(nom, apater, amater, edad, genero);
        this.nocontrol = nocontrol;
        this.carrera = carrera;
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void imprimirdatos(){
       super.imprimirdatos();
        System.out.println("Numero de control: " + nocontrol);
        System.out.println("Carrera: " + carrera);
}
  
}
