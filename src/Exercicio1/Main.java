package Exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.printf("O nome do usuário é %s %s %n", nome, sobrenome);

        System.out.printf("O nome %s tem %d caracteres.%n", nome, nome.length());

    }
}
