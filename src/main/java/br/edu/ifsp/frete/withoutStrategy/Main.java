package br.edu.ifsp.frete.withoutStrategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal peso = new BigDecimal("3");

        System.out.println("Normal: R$ " + new Pedido(peso, "normal").calcularFrete());
        System.out.println("Expresso: R$ " + new Pedido(peso, "expresso").calcularFrete());
        System.out.println("Retirada: R$ " + new Pedido(peso, "retirada").calcularFrete());
        System.out.println("Econômico: R$ " + new Pedido(peso, "economico").calcularFrete());
    }
}
