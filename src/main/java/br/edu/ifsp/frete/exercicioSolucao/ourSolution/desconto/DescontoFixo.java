package br.edu.ifsp.frete.exercicioSolucao.ourSolution.desconto;

import br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido.PedidoContext;

import java.math.BigDecimal;

public class DescontoFixo implements DescontoStrategy {
    @Override
    public BigDecimal calcular(PedidoContext context) {
        if (context.valorItens().compareTo(BigDecimal.valueOf(20.0)) < 0)
            return context.valorItens();
        return BigDecimal.valueOf(20);
    }
}
