package br.edu.ifsp.frete.exercicio;

import br.edu.ifsp.frete.withStrategy.domain.frete.FreteStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Ponto de partida do exercício: o frete já usa Strategy, mas o desconto ainda não.
public class Pedido {
    private final BigDecimal valorItens;
    private final BigDecimal pesoKg;
    private final FreteStrategy frete;
    private final String tipoCupom;

    public Pedido(BigDecimal valorItens, BigDecimal pesoKg, FreteStrategy frete, String tipoCupom) {
        this.valorItens = valorItens;
        this.pesoKg = pesoKg;
        this.frete = frete;
        this.tipoCupom = tipoCupom;
    }

    public BigDecimal calcularFrete() {
        return frete.calcular(pesoKg);
    }

    public BigDecimal calcularDesconto() {
        if (tipoCupom.equals("nenhum")) {
            return BigDecimal.ZERO;
        } else if (tipoCupom.equals("percentual")) {
            return valorItens.multiply(new BigDecimal("0.10"));
        } else if (tipoCupom.equals("valorFixo")) {
            return new BigDecimal("20.00").min(valorItens);
        } else if (tipoCupom.equals("freteGratis")) {
            return calcularFrete();
        } else {
            throw new IllegalArgumentException("Cupom não suportado: " + tipoCupom);
        }
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = valorItens.add(calcularFrete()).subtract(calcularDesconto());
        return total.setScale(2, RoundingMode.HALF_UP);
    }
}
