
import Class.Caminhao;
import Class.CarroPasseio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroPasseio carro = new CarroPasseio();
        System.out.println("Insira os dados do carro de passeio:");
        carro.insertData();
        System.out.println("\nDados do carro de passeio:");
        carro.print();

        System.out.println();

        Caminhao caminhao = new Caminhao();
        System.out.println("Insira os dados do caminhao:");
        caminhao.insertData();
        System.out.println("\nDados do caminhão:");
        caminhao.print();
    }
    
}
