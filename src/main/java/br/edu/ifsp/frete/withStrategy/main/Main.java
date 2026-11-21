package br.edu.ifsp.frete.withStrategy.main;

import br.edu.ifsp.frete.withStrategy.domain.frete.FreteEconomico;
import br.edu.ifsp.frete.withStrategy.domain.frete.FreteExpresso;
import br.edu.ifsp.frete.withStrategy.domain.frete.FreteNormal;
import br.edu.ifsp.frete.withStrategy.domain.frete.RetiradaNaLoja;
import br.edu.ifsp.frete.withStrategy.domain.pedido.Pedido;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new BigDecimal("3"), new FreteNormal());
        System.out.println("Normal: R$ " + pedido.calcularFrete());

        pedido.alterarFrete(new FreteExpresso());
        System.out.println("Expresso: R$ " + pedido.calcularFrete());

        pedido.alterarFrete(new RetiradaNaLoja());
        System.out.println("Retirada: R$ " + pedido.calcularFrete());

        // Nova modalidade: nenhuma linha de Pedido foi alterada
        pedido.alterarFrete(new FreteEconomico());
        System.out.println("Econômico: R$ " + pedido.calcularFrete());

        // Como FreteStrategy tem um único método, uma lambda também serve
        pedido.alterarFrete(peso -> new BigDecimal("50.00"));
        System.out.println("Promoção: R$ " + pedido.calcularFrete());
    }
}
