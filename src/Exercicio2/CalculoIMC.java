package Exercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {

    public static void main (String[] args) {

        //variaveis
        double peso, altura, imc;

        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        //entrada
        System.out.println("Cálculo do IMC");

        System.out.print("Digite seu peso:");
        peso = teclado.nextDouble();

        System.out.print("Digite sua altura:");
        altura = teclado.nextDouble();

        //processamento

        imc = peso / (altura * altura);

        //saida
        System.out.println("IMC: " + formatador.format(imc));
    }
}
