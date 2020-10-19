package strategy.impostos;

import strategy.dominios.Orcamento;
import strategy.interfaces.Imposto;

public class ISS implements Imposto {

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
