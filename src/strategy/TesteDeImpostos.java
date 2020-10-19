package strategy;

import strategy.dominios.Orcamento;
import strategy.impostos.ICCC;
import strategy.impostos.ICMS;
import strategy.impostos.ISS;
import strategy.interfaces.Imposto;
import strategy.servicos.CalculadorDeImpostos;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        // Calculando o ISS
        calculador.realizaCalculo(orcamento, iss);

        // Calculando o ICMS
        calculador.realizaCalculo(orcamento, icms);

        // Calculando o ICCC
        calculador.realizaCalculo(orcamento, iccc);
    }
}
