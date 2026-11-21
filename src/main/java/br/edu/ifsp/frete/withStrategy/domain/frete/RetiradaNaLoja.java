package br.edu.ifsp.frete.withStrategy.domain.frete;

import java.math.BigDecimal;

public class RetiradaNaLoja implements FreteStrategy {

    @Override
    public BigDecimal calcular(BigDecimal pesoKg) {
        return BigDecimal.ZERO;
    }
}
