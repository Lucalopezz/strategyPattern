package br.edu.ifsp.frete.exercicio;

import br.edu.ifsp.frete.withStrategy.domain.frete.FreteExpresso;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("150.00");
        BigDecimal peso = new BigDecimal("3");

        for (String cupom : new String[]{"nenhum", "percentual", "valorFixo", "freteGratis"}) {
            Pedido pedido = new Pedido(valor, peso, new FreteExpresso(), cupom);
            System.out.println(cupom + ": R$ " + pedido.calcularTotal());
        }
    }
}
