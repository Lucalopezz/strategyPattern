package br.edu.ifsp.frete.strategy;

import java.math.BigDecimal;

public interface FreteStrategy {
    BigDecimal calcular(BigDecimal pesoKg);
}
