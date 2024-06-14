/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;

public class ContaCorrente extends Conta {
    // Construtor
    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    // Implementação do método sacar
    @Override
    public void sacar(double valor) {
        // Lógica específica para saque em conta corrente
        if (getSaldo() >= valor) {
            // Pode sacar mesmo que fique negativo (sujeito a cheque especial, por exemplo)
            this.depositar(-valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}