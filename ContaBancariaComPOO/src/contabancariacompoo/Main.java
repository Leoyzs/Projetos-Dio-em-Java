/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente1 = new Cliente("João", "123.456.789-00");

        // Criando contas
        ContaCorrente cc = new ContaCorrente("123456", cliente1);
        ContaPoupanca cp = new ContaPoupanca("789012", cliente1);

        // Adicionando contas ao banco
        Banco banco = new Banco();
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        // Realizando operações
        cc.depositar(1000);
        cp.depositar(500);

        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupança: " + cp.getSaldo());

        cc.sacar(200);
        cp.sacar(100);

        System.out.println("Saldo conta corrente após saque: " + cc.getSaldo());
        System.out.println("Saldo conta poupança após saque: " + cp.getSaldo());

        cc.transferir(cp, 300);

        System.out.println("Saldo conta corrente após transferência: " + cc.getSaldo());
        System.out.println("Saldo conta poupança após transferência: " + cp.getSaldo());
    }
}
