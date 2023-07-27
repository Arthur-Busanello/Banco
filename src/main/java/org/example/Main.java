import java.util.Scanner;

class Banco {
    private String nomeCompleto;
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public Banco(String nomeCompleto, double saldoInicial) {
        this.nomeCompleto = nomeCompleto;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual:" + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de" + valor + " realizado. Saldo atual:" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int option;
        boolean exit = false;

        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = myInput.nextLine();

        Banco banco = new Banco(nomeCompleto, 100.0);

        do {
            System.out.println("\nBem-vindo(a), " + banco.getNomeCompleto() + "!");
            System.out.println("1 - Saldo atual");
            System.out.println("2 - Depositar");
            System.out.println("3 - Resgatar");
            System.out.println("4 - Sair");

            option = myInput.nextInt();
            switch (option) {
                case 1:
                    banco.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor : ");
                    double valorDeposito = myInput.nextDouble();
                    banco.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor : ");
                    double valorSaque = myInput.nextDouble();
                    banco.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Encerrando atividades...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (!exit);
    }
}
