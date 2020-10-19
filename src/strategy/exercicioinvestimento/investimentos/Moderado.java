package strategy.exercicioinvestimento.investimentos;

import strategy.exercicioinvestimento.dominios.Conta;
import strategy.exercicioinvestimento.interfaces.Investimento;

public class Moderado implements Investimento {

    @Override
    public double calcula(Conta conta) {
        boolean escolhido = new java.util.Random().nextDouble() > 0.50;

        if(escolhido) {
            return conta.getValor() * 2.5;
        }

        return conta.getValor() * 0.7;
    }
}
