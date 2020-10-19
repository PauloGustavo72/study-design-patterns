package strategy.exercicioinvestimento.investimentos;

import strategy.exercicioinvestimento.dominios.Conta;
import strategy.exercicioinvestimento.interfaces.Investimento;

public class Arrojado implements Investimento {

    @Override
    public double calcula(Conta conta) {
        int porcentagem = new java.util.Random().nextInt(100);
        double valor = conta.getValor();

        if(porcentagem < 50){ // 50% de chance
            return valor * 0.6;
        }

        if(porcentagem < 80){ // 30% de chance
            return valor * 0.3;
        }

        return valor * 0.5;
    }
}
