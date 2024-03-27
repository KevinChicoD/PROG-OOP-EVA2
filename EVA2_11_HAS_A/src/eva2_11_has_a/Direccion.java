
package eva2_11_has_a;

public class Direccion {
    private String calle;
    private String colonia;
    private int CP;
    private String numero;
    private String Ciudad;
    private String Estado;

    public Direccion() {
        this.calle = "";
        this.colonia = "";
        this.CP = 0;
        this.numero = "";
        this.Ciudad = "";
        this.Estado = "";
    }

    public Direccion(String calle, String colonia, int CP, String numero, String Ciudad, String Estado) {
        this.calle = calle;
        this.colonia = colonia;
        this.CP = CP;
        this.numero = numero;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    @Override
    public String toString(){
        String cade = "Calle: " + calle + " Colonia: " + colonia + " CP: " + CP + " Numero: " + numero + " Ciudad: " + Ciudad + " Estado: " + Estado;
        return cade;
    }
    
    
    
}
