package br.edu.ifsp.frete.withStrategy.domain.pedido;

import br.edu.ifsp.frete.withStrategy.domain.frete.FreteStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pedido {
    private final BigDecimal pesoKg;
    private FreteStrategy frete;

    public Pedido(BigDecimal pesoKg, FreteStrategy frete) {
        if (pesoKg == null || pesoKg.signum() <= 0)
            throw new IllegalArgumentException("O peso deve ser positivo.");
        this.pesoKg = pesoKg;
        this.frete = frete;
    }

    public void alterarFrete(FreteStrategy frete) {
        this.frete = frete;
    }

    public BigDecimal calcularFrete() {
        if (frete == null)
            throw new IllegalStateException("Nenhuma modalidade de frete foi definida.");
        return frete.calcular(pesoKg).setScale(2, RoundingMode.HALF_UP);
    }
}
