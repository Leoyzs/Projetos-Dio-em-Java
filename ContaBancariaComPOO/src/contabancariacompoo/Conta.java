/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;
// Classe Conta.java
public abstract class Conta implements IConta {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    // Construtor
    public Conta(String numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    // Métodos getters e setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Métodos da interface
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public void transferir(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}