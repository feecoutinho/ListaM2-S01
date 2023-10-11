package Exercicio4;

import java.util.Scanner;

public class AdivinhaNum {
    public static void main(String[] args){
        int aleatorio = (int) Math.round(Math.random() * (5 - 1) + 1);
        // System.out.println(aleatorio);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
        int palpite = Integer.parseInt(entrada.nextLine());

        while (palpite != aleatorio) {
            System.out.println("Você errou! Tente novamente:");
            palpite = Integer.parseInt(entrada.nextLine());
        }

        System.out.println("Parabéns, você acertou!");
    }
}
