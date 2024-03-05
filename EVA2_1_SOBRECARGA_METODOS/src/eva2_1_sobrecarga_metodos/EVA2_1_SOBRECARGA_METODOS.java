package eva2_1_sobrecarga_metodos;

public class EVA2_1_SOBRECARGA_METODOS {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La suma de 54 + 47 = " + sumar(54,47));
        System.out.println("La suma de 54.2 + 78.3 = " + sumar(54.2,78.3));
        System.out.println("La suma de 'Hola' + '   Mundo' = " + sumar("Hola", " Mundo"));
        sumar();
    }
    
    public static int sumar (int num1, int num2){
        return num1 + num2;
    }
    
    public static double sumar (double num1, double num2){
        return num1 + num2;
    }
    
    public static String sumar (String num1, String num2){
        return num1 + num2;
    }
    
    public static void sumar (){
        System.out.println("Metodo que no hace nada!!!!!!!!!!");
    }
}
