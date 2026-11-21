package br.edu.ifsp.frete.exercicioSolucao.ourSolution.main;

import br.edu.ifsp.frete.exercicioSolucao.ourSolution.desconto.*;
import br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido.Pedido;
import br.edu.ifsp.frete.exercicioSolucao.ourSolution.pedido.PedidoCorrigido;
import br.edu.ifsp.frete.withStrategy.domain.frete.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        DescontoStrategy[] descontoStrategies = {
                new DescontoFreteGratis(),
                new DescontoNenhum(),
                new DescontoPercentual(),
                new DescontoPrimeiraCompra()
        };
        FreteStrategy[] freteStrategies = {
                new RetiradaNaLoja(),
                new FreteEconomico(),
                new FreteNormal()
        };
        PedidoCorrigido pedido = PedidoCorrigido.createPedido(BigDecimal.valueOf(100), BigDecimal.valueOf(9.78), new FreteExpresso(), new DescontoFixo());
        // para demonstrar a troca de estrategias
        System.out.printf("frete: %.2f \n", pedido.calcularFrete());
        System.out.printf("desconto: %.2f \n", pedido.calcularDesconto());
        System.out.printf("total: %.2f \n",pedido.calcularTotal());
        for (DescontoStrategy descontoStrategy : descontoStrategies) {
            System.out.println("---------trocando estrategia de desconto-------------");
            pedido.setDescontoStrategy(descontoStrategy);
            for (FreteStrategy freteStrategy : freteStrategies) {
                pedido.setFreteStrategy(freteStrategy);
                System.out.println("==========================================");
                System.out.printf("frete: %.2f \n", pedido.calcularFrete());
                System.out.printf("desconto: %.2f \n", pedido.calcularDesconto());
                System.out.printf("total: %.2f \n",pedido.calcularTotal());
            }
        }
    }
}
