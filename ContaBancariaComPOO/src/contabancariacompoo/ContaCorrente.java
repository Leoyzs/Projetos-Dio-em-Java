/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numeroConta, Cliente cliente) {
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
