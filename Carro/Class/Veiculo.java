
package Class;

import java.util.Scanner;

public class Veiculo extends Motor {
    private int peso;
    private int velocMax;
    private float preco;
    
    public Veiculo() {
        super();
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0.0f;
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }
    
    public int getPeso() {
        return peso;
    }

    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    public int getVelocMax() {
        return velocMax;
    }

    
    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    
    public float getPreco() {
        return preco;
    }

    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public void insertData() {
        super.insertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Peso: ");
        this.peso = scanner.nextInt();
        System.out.print("Velocidade Maxima: ");
        this.velocMax = scanner.nextInt();
        System.out.print("Preco: ");
        this.preco = scanner.nextFloat();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Veiculo:");
        System.out.println("Peso: " + this.peso);
        System.out.println("Velocidade Maxima: " + this.velocMax);
        System.out.println("Preco: " + this.preco);
    }
}
