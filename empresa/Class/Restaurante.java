package Class;

import java.util.Scanner;


public class Restaurante extends Empresa {
     private String tipoComida;
    private double precoMedioPrato;

    public Restaurante() {
        // Construtor sem argumentos
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone,
                       String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getPrecoMedioPrato() {
        return precoMedioPrato;
    }

    public void setPrecoMedioPrato(double precoMedioPrato) {
        this.precoMedioPrato = precoMedioPrato;
    }

    public void insertData() {
        insert();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de comida: ");
        tipoComida = scanner.nextLine();
        System.out.print("Digite o preco medio de um prato: ");
        precoMedioPrato = scanner.nextDouble();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preco medio de um prato: " + precoMedioPrato);
    }
}
