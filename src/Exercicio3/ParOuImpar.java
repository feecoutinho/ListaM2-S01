package Exercicio3;

import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {

        //variaveis
        int num, poi;

        //entrada
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        num = entrada.nextInt();
        poi = (num%2);

        if(poi == 0) {
        System.out.println("O número "+num+" é par!");
        } else {
        System.out.println("O número "+num+" é impar!");
        }

    }
}
