package br.edu.ifsp.frete.strategy;

import java.math.BigDecimal;

public class FreteNormal implements FreteStrategy {

    @Override
    public BigDecimal calcular(BigDecimal pesoKg) {
        BigDecimal taxa = new BigDecimal("10.00");
        BigDecimal porKg = new BigDecimal("2.00");
        return taxa.add(porKg.multiply(pesoKg));
    }
}
