package br.edu.ifsp.frete.withStrategy.domain.frete;

import java.math.BigDecimal;

public interface FreteStrategy {
    BigDecimal calcular(BigDecimal pesoKg);
}
