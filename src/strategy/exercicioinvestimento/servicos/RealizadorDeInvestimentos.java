package strategy.exercicioinvestimento.servicos;

import strategy.exercicioinvestimento.dominios.Conta;
import strategy.exercicioinvestimento.interfaces.Investimento;

public class RealizadorDeInvestimentos {

    public void calcula(Conta conta, Investimento investimento){
        double lucroDoInvestimento = investimento.calcula(conta);

        lucroDoInvestimento = lucroDoInvestimento * 0.75;

        System.out.println("Valor do lucro = " + conta.getValor() + lucroDoInvestimento );
    }
}
