/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_libreria;

/**
 *
 * @author invitado
 */
public class Libros extends Publicaciones{
    private String autor;
    
    //regla: siempre se llama al constructor de la superclase
     public Libros() {
        super();
        this.autor = "-";
     }

    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
   
    public void OrdenarCopias(int cant){
        //Las copias se deben agregar a las variables
        //copias de la clase pblicaciones
        int existencias = getCopias();
        setCopias(existencias + cant);
    }
    
    
    @Override
    public void ImprimirDatos(){
       super.ImprimirDatos();
        System.out.println("Autor: " + autor);
    }
}
