
package Class;

import java.util.Scanner;



public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

     public CarroPasseio() {
        super();
        this.cor = "";
        this.modelo = "";
    }

    public CarroPasseio(int numCilindro, int potencia, int peso, int velocMax, float preco, String cor, String modelo) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }
    
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
     public void insertData() {
        super.insertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cor: ");
        this.cor = scanner.nextLine();
        System.out.print("Modelo: ");
        this.modelo = scanner.nextLine();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Carro de Passeio:");
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
    }
}
