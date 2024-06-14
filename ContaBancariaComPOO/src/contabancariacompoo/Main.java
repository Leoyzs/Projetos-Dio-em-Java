/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("123456");
        ContaPoupanca cp = new ContaPoupanca("789012");

        cc.depositar(1000);
        cp.depositar(500);

        cc.transferir(cp, 300);

        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupança: " + cp.getSaldo());
    }
}
