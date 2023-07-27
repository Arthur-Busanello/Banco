package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int option;
        boolean exit = false;


        do {
            System.out.println("1-saldo atual");
            System.out.println("2-Depositar");
            System.out.println("3-Resgate");
            System.out.println("4-Sair");

            option = myInput.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Case 1");
                    consultarSaldo();
                    break;
                case 2:
                    System.out.printf("Case 2");
                    depositar();
                    break;
                case 3:
                    System.out.printf("Case 3");
                    sacar();
                    break;
                case 4:
                    System.out.printf("Encerrando atividades...");
                    exit = true;
                    break;
                default:
                    System.out.printf("Error");
                    break;
            }
        } while (exit != true);
    }

    static void depositar() {
        System.out.println("Deposito");
    }

    static void sacar() {
        System.out.println("sacar");
    }

    static void consultarSaldo() {
        System.out.println("consultarSaldo)");
    }


}