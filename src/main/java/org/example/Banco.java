package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void transferir(Conta origem, Conta destino, double valor) {
        System.out.println("Transferindo " + valor + " de conta " + origem.getNumero()
                + " para " + destino.getNumero());
        origem.sacar(valor);
        destino.depositar(valor);
    }
}
