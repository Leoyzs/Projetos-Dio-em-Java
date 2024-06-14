/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;

public abstract class Conta {
    private String numeroConta;
    private double saldo;

    // Construtor
    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Métodos getters e setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depósito
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Método para saque
    public abstract void sacar(double valor);

    // Método para transferência
    public void transferir(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}