package eva2_9_final;

public  class Computo extends Electronica{
    private int ram;
    private String hd;
    private String procesador;
    
     public Computo() {
        super();
        this.ram = 0;
        this.hd = "-";
        this.procesador = "-";
    }

    public Computo(int ram, String hd, String procesador) {
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public Computo(int ram, String hd, String procesador, String marca, boolean garantia, String nombre, double precio) {
        super(marca, garantia, nombre, precio);
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }
   
    
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    @Override
      public String toString(){
        String cade = super.toString() + "\n";
        cade += "Ram: " + ram + "\n" +
                "Disco duro: " + hd + "\n" +
                "Procesador: " + procesador;
        return cade; 
    }
 
}
