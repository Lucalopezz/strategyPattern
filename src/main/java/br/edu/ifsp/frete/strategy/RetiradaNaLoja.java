package br.edu.ifsp.frete.strategy;

import java.math.BigDecimal;

public class RetiradaNaLoja implements FreteStrategy {

    @Override
    public BigDecimal calcular(BigDecimal pesoKg) {
        return BigDecimal.ZERO;
    }
}
