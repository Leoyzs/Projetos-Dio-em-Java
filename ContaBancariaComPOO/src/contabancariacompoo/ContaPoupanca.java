/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            this.depositar(-valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}