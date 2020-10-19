package strategy.exercicioinvestimento;

import strategy.exercicioinvestimento.dominios.Conta;
import strategy.exercicioinvestimento.interfaces.Investimento;
import strategy.exercicioinvestimento.investimentos.Arrojado;
import strategy.exercicioinvestimento.investimentos.Conservador;
import strategy.exercicioinvestimento.investimentos.Moderado;
import strategy.exercicioinvestimento.servicos.RealizadorDeInvestimentos;

public class Teste {

    public static void main(String[] args) {
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
        Conta conta = new Conta();
        conta.setValor(500.0);

        Investimento arrojado = new Arrojado();
        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();

        realizadorDeInvestimentos.calcula(conta, arrojado);
        realizadorDeInvestimentos.calcula(conta, conservador);
        realizadorDeInvestimentos.calcula(conta, moderado);


    }
}
