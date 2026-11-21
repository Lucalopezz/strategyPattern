package br.edu.ifsp.frete.exercicioSolucao.ourSolution.desconto;

import br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido.PedidoContext;

import java.math.BigDecimal;

public interface DescontoStrategy {
    public BigDecimal calcular(PedidoContext context);
}
