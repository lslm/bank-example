package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("1111", "01");
        cc1.depositar(100);

        ContaCorrente cc2 = new ContaCorrente("1112", "01");
        cc2.depositar(130);

        ContaPoupanca cp1 = new ContaPoupanca("11223", "01");
        cp1.depositar(200);

        Banco banco = new Banco();
        banco.addConta(cc1);
        banco.addConta(cc2);
        banco.addConta(cp1);

        banco.transferir(cc1, cc2, 30);

        System.out.println("CC1: " + cc1.getSaldo());
        System.out.println("CC2: " + cc2.getSaldo());
    }
}