package br.edu.ifsp.frete.strategy;

import java.math.BigDecimal;

public class FreteExpresso implements FreteStrategy {

    @Override
    public BigDecimal calcular(BigDecimal pesoKg) {
        BigDecimal taxa = new BigDecimal("25.00");
        BigDecimal porKg = new BigDecimal("5.00");
        return taxa.add(porKg.multiply(pesoKg));
    }
}
