/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;
public class ContaPoupanca extends Conta {
    // Construtor
    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    // Implementação do método sacar
    @Override
    public void sacar(double valor) {
        // Lógica específica para saque em conta poupança
        if (getSaldo() >= valor) {
            // Não pode sacar se o saldo não for suficiente
            this.depositar(-valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}