package Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double numero1 = sc.nextDouble();

        System.out.println("Informe o segundo número:");
        double numero2 = sc.nextDouble();

        System.out.println("Qual a opção desejada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int op = sc.nextInt();

        Operacao operacao = null;
        switch (op) {
            case 1 -> operacao = new Adicao();
            case 2 -> operacao = new Subtracao();
            case 3 -> operacao = new Multiplicacao();
            case 4 -> operacao = new Divisao();
        }

        System.out.printf("A operação escolhida foi: %s. O resultado é %.2f.",
                operacao.getDescricao(),
                operacao.calcular(numero1, numero2));
    }
}
