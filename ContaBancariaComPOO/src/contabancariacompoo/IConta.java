/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;
public interface IConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(Conta destino, double valor);
}


