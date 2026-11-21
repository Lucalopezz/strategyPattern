package br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido;

import br.edu.ifsp.frete.exercicioSolucao.ourSolution.desconto.DescontoStrategy;
import br.edu.ifsp.frete.withStrategy.domain.frete.FreteStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PedidoCorrigido {
    private final BigDecimal valorItens;
    private final BigDecimal pesoKg;
    private FreteStrategy freteStrategy;
    private DescontoStrategy descontoStrategy;

    public PedidoCorrigido(BigDecimal valorItens, BigDecimal pesoKg, FreteStrategy frete, DescontoStrategy descontoStrategy) {
        this.valorItens = valorItens;
        this.pesoKg = pesoKg;
        this.freteStrategy = frete;
        this.descontoStrategy = descontoStrategy;
    }

    public BigDecimal calcularFrete() {
        if (freteStrategy == null)
            throw new IllegalStateException("a estrategia do calculo de frete não pode ser nula");
        return freteStrategy.calcular(pesoKg);
    }

    public BigDecimal calcularDesconto() {
        if (descontoStrategy == null)
            throw new IllegalStateException("a estrategia do calculo do desconto não pode ser nula");
        return descontoStrategy.calcular(getPedidoContext());
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = valorItens.add(calcularFrete()).subtract(calcularDesconto());
        return total.setScale(2, RoundingMode.HALF_UP);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        if (descontoStrategy == null)
            throw new IllegalStateException("a estrategia do calculo do desconto não pode ser nula");
        this.descontoStrategy = descontoStrategy;
    }

    public PedidoContext getPedidoContext() {
        return new PedidoContext(valorItens, calcularFrete());
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        if (freteStrategy == null)
            throw new IllegalStateException("a estrategia do calculo de frete não pode ser nula");
        this.freteStrategy = freteStrategy;
    }
}
