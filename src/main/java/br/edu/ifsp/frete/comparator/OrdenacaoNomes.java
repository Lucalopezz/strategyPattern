package br.edu.ifsp.frete.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Liskov", "Gamma", "Dijkstra", "Booch"));

        nomes.sort(Comparator.naturalOrder());
        System.out.println("Alfabética: " + nomes);

        nomes.sort(Comparator.comparingInt(String::length));
        System.out.println("Por tamanho: " + nomes);
    }
}
