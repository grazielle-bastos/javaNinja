package Desafios.Desafio5;

import Desafios.Desafio5.Enum.TipoConta;

public class ContaPoupanca extends ContaBancaria {

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        saldo += valor * 0.99;
    }

    @Override
    public TipoConta getTipoConta() {
        return TipoConta.POUPANCA;
    }
}
