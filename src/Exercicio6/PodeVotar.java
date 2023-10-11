package Exercicio6;

import java.util.Scanner;

public class PodeVotar {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idadeUsuario = Integer.parseInt(entrada.nextLine());

        if (idadeUsuario < 16) {
            System.out.println("Você não pode votar.");
        } else if (idadeUsuario >= 18 && idadeUsuario < 59) {
            System.out.println("Seu voto é obrigatório.");
        } else if (idadeUsuario < 18 || idadeUsuario > 59) {
            System.out.println("Seu voto é facultativo.");
        }
    }
}
