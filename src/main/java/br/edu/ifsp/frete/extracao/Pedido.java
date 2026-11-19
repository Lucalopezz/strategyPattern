package br.edu.ifsp.frete.extracao;

import br.edu.ifsp.frete.strategy.*;

import java.math.BigDecimal;

public class Pedido {
    private final BigDecimal pesoKg;
    private final String tipoEntrega;

    public Pedido(BigDecimal pesoKg, String tipoEntrega) {
        this.pesoKg = pesoKg;
        this.tipoEntrega = tipoEntrega;
    }

    public BigDecimal calcularFrete() {
        FreteStrategy frete = switch (tipoEntrega) {
            case "normal" -> new FreteNormal();
            case "expresso" -> new FreteExpresso();
            case "retirada" -> new RetiradaNaLoja();
            default -> throw new IllegalArgumentException("Entrega não suportada.");
        };
        return frete.calcular(pesoKg);
    }
}
