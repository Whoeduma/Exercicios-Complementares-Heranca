
package Main;
import Class.Restaurante;


public class main {

    
    public static void main(String[] args) {
       Restaurante restaurante = new Restaurante();
        restaurante.insertData();
        System.out.println("\nDados do restaurante:");
        restaurante.print();
    }
    
}
