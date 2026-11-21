# Padrão Strategy

Projeto em Java para a apresentação do padrão de projeto Strategy, usando o cálculo de frete e de descontos como exemplos.

Os códigos ficam em `src/main/java/br/edu/ifsp/frete/`:

- `withoutStrategy`: cálculo de frete com `if` e `else`, sem usar o padrão.
- `extracao`: primeiro passo para separar os cálculos de frete.
- `withStrategy`: exemplo com Strategy, organizado em:
  - `domain/frete`: interface e estratégias de frete.
  - `domain/pedido`: classe Pedido.
  - `main`: demonstração do exemplo.
- `exercicioSolucao`: exercício de aplicação de Strategy aos descontos:
  - `yourResolution`: ponto de partida para resolver o exercício.
  - `ourSolution`: solução com estratégias de desconto, organizada em:
    - `desconto`: interface e estratégias de desconto.
    - `pedido`: Pedido original, PedidoCorrigido e PedidoContext.
    - `main`: demonstração da troca de estratégias de frete e desconto.
- `comparator`: exemplo de ordenação usando Comparator.
