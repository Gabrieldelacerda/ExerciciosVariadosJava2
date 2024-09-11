package com.example;
import java.util.ArrayList;
import java.util.Scanner;

class Estudante {
    private String nome;
    private int idade;
    private String matricula;

    public Estudante(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Matrícula: " + matricula;
    }
}

public class SistemaGerenciamentoEstudantes {
    private static ArrayList<Estudante> estudantes = new ArrayList<>();

    public static void adicionarEstudante(String nome, int idade, String matricula) {
        Estudante novoEstudante = new Estudante(nome, idade, matricula);
        estudantes.add(novoEstudante);
        System.out.println("Estudante adicionado com sucesso.");
    }

    public static void removerEstudante(String matricula) {
        Estudante estudanteParaRemover = null;
        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula().equals(matricula)) {
                estudanteParaRemover = estudante;
                break;
            }
        }

        if (estudanteParaRemover != null) {
            estudantes.remove(estudanteParaRemover);
            System.out.println("Estudante removido com sucesso.");
        } else {
            System.out.println("Estudante com a matrícula " + matricula + " não encontrado.");
        }
    }

    public static void exibirEstudantes() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
        } else {
            System.out.println("Lista de estudantes:");
            for (Estudante estudante : estudantes) {
                System.out.println(estudante);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Gerenciamento de Estudantes de gdelacerda23:");
            System.out.println("1. Adicionar estudante");
            System.out.println("2. Remover estudante");
            System.out.println("3. Exibir estudantes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do estudante: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do estudante: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer de entrada
                    System.out.print("Digite a matrícula do estudante: ");
                    String matricula = scanner.nextLine();
                    adicionarEstudante(nome, idade, matricula);
                    break;
                case 2:
                    System.out.print("Digite a matrícula do estudante a ser removido: ");
                    String matriculaParaRemover = scanner.nextLine();
                    removerEstudante(matriculaParaRemover);
                    break;
                case 3:
                    exibirEstudantes();
                    break;
                case 4:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
