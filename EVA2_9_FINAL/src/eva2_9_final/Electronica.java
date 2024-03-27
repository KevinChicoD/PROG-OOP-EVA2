package eva2_9_final;

public  abstract class Electronica extends Productos{
   
   private String marca;
   private boolean garantia;
   
   public Electronica() {
        this.marca = "-";
        this.garantia = false;
    }

    public Electronica(String marca, boolean garantia, String nombre, double precio) {
        super(nombre, precio);
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
    
    @Override
      public String toString(){
        String cade = super.toString() + "\n";
        cade += "Marca: " + marca + "\n" +
                "Grantia: " + garantia;
        return cade; 
    }
}
