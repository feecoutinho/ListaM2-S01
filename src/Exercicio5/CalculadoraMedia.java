package Exercicio5;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        // variaveis
        String nome;
        double nota1, nota2, nota3, media;

        //objetos
        Scanner entrada = new Scanner(System.in);

        //entrada
        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite a nota1: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a nota2: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a nota3: ");
        nota3 = entrada.nextDouble();

        // processamento
        media = (nota1 + nota2 + nota3) / 3;
        // saida
        System.out.println("-------------------------------");
        System.out.println("Nome: " + nome);
        System.out.printf("Sua média final é %.2f", media);
    }
}
