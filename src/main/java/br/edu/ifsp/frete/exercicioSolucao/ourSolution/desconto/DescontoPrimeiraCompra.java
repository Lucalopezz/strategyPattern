package br.edu.ifsp.frete.exercicioSolucao.ourSolution.desconto;

import br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido.PedidoContext;

import java.math.BigDecimal;

public class DescontoPrimeiraCompra implements DescontoStrategy {
    @Override
    public BigDecimal calcular(PedidoContext context) {
        BigDecimal discount = context.valorFrete()
                .add(context.valorItens())
                .multiply(BigDecimal.valueOf(0.15));
        if (discount.compareTo(BigDecimal.valueOf(30)) > 0)
            return BigDecimal.valueOf(30);
        return discount;
    }
}
