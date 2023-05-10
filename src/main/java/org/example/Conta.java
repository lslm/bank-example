package org.example;

public abstract class Conta {
    private String numero;
    private String agencia;
    private double saldo;

    public Conta(String numero, String agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
