package br.edu.ifsp.frete.exercicioSolucao.ourSolution.desconto;

import br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido.PedidoContext;

import java.math.BigDecimal;

public class DescontoPercentual implements DescontoStrategy{
    @Override
    public BigDecimal calcular(PedidoContext context) {
        return context.valorItens().multiply(BigDecimal.valueOf(0.1));
    }
}
