package org.example.Entity;

public class Metodos {
    private String nomeCompleto;
    private double saldo;

    public Metodos(String nomeCompleto, double saldoInicial) {
        this.nomeCompleto = nomeCompleto;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
