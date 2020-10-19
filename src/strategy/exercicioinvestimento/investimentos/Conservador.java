package strategy.exercicioinvestimento.investimentos;

import strategy.exercicioinvestimento.dominios.Conta;
import strategy.exercicioinvestimento.interfaces.Investimento;

public class Conservador implements Investimento {

    @Override
    public double calcula(Conta conta) {
        return conta.getValor() * 0.08;
    }
}
