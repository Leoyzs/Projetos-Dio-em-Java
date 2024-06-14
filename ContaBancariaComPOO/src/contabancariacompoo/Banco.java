/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancariacompoo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    // Construtor
    public Banco() {
        this.contas = new ArrayList<>();
    }

    // Método para adicionar conta
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Outros métodos do banco...
}