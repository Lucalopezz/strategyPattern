package br.edu.ifsp.frete.withoutStrategy;

import java.math.BigDecimal;

public class Pedido {
    private final BigDecimal pesoKg;
    private final String tipoEntrega;

    public Pedido(BigDecimal pesoKg, String tipoEntrega) {
        this.pesoKg = pesoKg;
        this.tipoEntrega = tipoEntrega;
    }

    public BigDecimal calcularFrete() {
        if (tipoEntrega.equals("normal")) {
            return new BigDecimal("10.00").add(new BigDecimal("2.00").multiply(pesoKg));
        } else if (tipoEntrega.equals("expresso")) {
            return new BigDecimal("25.00").add(new BigDecimal("5.00").multiply(pesoKg));
        } else if (tipoEntrega.equals("retirada")) {
            return BigDecimal.ZERO;
        } else {
            throw new IllegalArgumentException("Tipo de entrega não suportado: " + tipoEntrega);
        }
    }
}
