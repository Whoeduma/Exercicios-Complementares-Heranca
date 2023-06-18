
package Class;

import java.util.Scanner;


public class Empresa {
     private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;

    public Empresa() {
        // Construtor sem argumentos
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da empresa: ");
        nome = scanner.nextLine();
        System.out.print("Digite o endereco: ");
        endereco = scanner.nextLine();
        System.out.print("Digite a cidade: ");
        cidade = scanner.nextLine();
        System.out.print("Digite o estado: ");
        estado = scanner.nextLine();
        System.out.print("Digite o CEP: ");
        cep = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        telefone = scanner.nextLine();
    }

    public void print() {
        System.out.println("Nome da empresa: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
    }
}
