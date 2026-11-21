package br.edu.ifsp.frete.exercicioSolucao.ourSolution.desconto;

import br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido.PedidoContext;

import java.math.BigDecimal;

public class DescontoFreteGratis implements DescontoStrategy{
    @Override
    public BigDecimal calcular(PedidoContext context) {
        return context.valorFrete();
    }
}
