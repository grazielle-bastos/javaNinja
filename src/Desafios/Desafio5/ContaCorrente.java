package Desafios.Desafio5;

import Desafios.Desafio5.Enum.TipoConta;

public class ContaCorrente extends ContaBancaria {

    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    @Override
    public TipoConta getTipoConta(){
        return TipoConta.CORRENTE;
    }
}