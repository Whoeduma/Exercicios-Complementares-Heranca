
package Class;

import java.util.Scanner;

public class Caminhao extends Veiculo {
    private double toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        super();
        this.toneladas = 0.0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    public Caminhao(int numCilindro, int potencia, int peso, int velocMax, float preco, double toneladas, int alturaMax, int comprimento) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }
    
    public double getToneladas() {
        return toneladas;
    }

    /**
     * @param toneladas the toneladas to set
     */
    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    /**
     * @return the alturaMax
     */
    public int getAlturaMax() {
        return alturaMax;
    }

    /**
     * @param alturaMax the alturaMax to set
     */
    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    /**
     * @return the comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
     public void insertData() {
        super.insertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toneladas: ");
        this.toneladas = scanner.nextDouble();
        System.out.print("Altura Maxima: ");
        this.alturaMax = scanner.nextInt();
        System.out.print("Comprimento: ");
        this.comprimento = scanner.nextInt();
    }

    public void print() {
        super.print();
        System.out.println("Caminhao:");
        System.out.println("Toneladas: " + this.toneladas);
        System.out.println("Altura Maxima: " + this.alturaMax);
        System.out.println("Comprimento: " + this.comprimento);
    }
    
    
}
