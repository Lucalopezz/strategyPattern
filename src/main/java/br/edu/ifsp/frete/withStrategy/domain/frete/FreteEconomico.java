package br.edu.ifsp.frete.withStrategy.domain.frete;

import java.math.BigDecimal;

public class FreteEconomico implements FreteStrategy {

    @Override
    public BigDecimal calcular(BigDecimal pesoKg) {
        BigDecimal taxa = new BigDecimal("7.00");
        BigDecimal porKg = new BigDecimal("1.50");
        return taxa.add(porKg.multiply(pesoKg));
    }
}
