package DescobrindoIdade;

import java.util.Scanner;

public class DescobrindoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1 ;

        do {
            System.out.println("\nEscolha uma das seguintes opçoes: ");
            System.out.println("(1) Descobrir a idade de alguém: ");
            System.out.println("(0) Não/Sair: ");
            System.out.print("Opçao: ");
            opcao = sc.nextInt();

            if (opcao == 0) break;

            if (opcao == 1) {
                System.out.print("\nDigite o ano atual: ");
                int anoAtual = sc.nextInt();
                System.out.print("Difite o ano de seu nascimento: ");
                int anoNascimento = sc.nextInt();

                int idade = anoAtual - anoNascimento;

                System.out.println("\nQuem nasceu em "+anoNascimento+" em "+anoAtual+" terá "+idade+" anos!");

            }
            else {
                System.out.println("\nOpção invalida!");
            }

        }
        while (opcao != 0 );

        System.out.println("\nFim!!");
        sc.close();
    }
}
