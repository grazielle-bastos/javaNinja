package Desafios.Desafio5;

import Desafios.Desafio5.Enum.TipoConta;

public class BancoKonoha {

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem == null || destino == null) {
            throw new IllegalArgumentException("Conta de origem/destino não pode ser nula");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }

        origem.sacar(valor);
        destino.depositar(valor);
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor, TipoConta tipoDestinoEsperado) {
        if (destino == null) {
            throw new IllegalArgumentException("Conta de destino não pode ser nula");
        }
        if (destino.getTipoConta() != tipoDestinoEsperado) {
            throw new IllegalArgumentException("Tipo de conta destino inválido");
        }

        transferir(origem, destino, valor);
    }

}
