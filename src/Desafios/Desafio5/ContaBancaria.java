package Desafios.Desafio5;

import Desafios.Desafio5.Enum.TipoConta;

public abstract class ContaBancaria implements Conta {

    protected double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);

    public abstract TipoConta getTipoConta();

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
