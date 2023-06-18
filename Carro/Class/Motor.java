/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;


public class Motor {
  private int numCilindro;
  private int potencia;  
  
   public Motor() {
        this.numCilindro = 0;
        this.potencia = 0;
    }
   
   public Motor(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }
   
    public int getNumCilindro() {
        return numCilindro;
    }

    
    public void setNumCilindro(int numCilindro) {
        this.numCilindro = numCilindro;
    }

   
    public int getPotencia() {
        return potencia;
    }

    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
     public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de cilindros: ");
        this.numCilindro = scanner.nextInt();
        System.out.print("Potencia: ");
        this.potencia = scanner.nextInt();
    }
     
     public void print() {
        System.out.println("Motor:");
        System.out.println("Numero de cilindros: " + this.numCilindro);
        System.out.println("Potencia: " + this.potencia);
    }
     
}
