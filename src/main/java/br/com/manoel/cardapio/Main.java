package br.com.manoel.cardapio;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        List<ItemCardapio> itens = database.listaDeItensCardapio();

        // saber quantos itens de cada categoria realmente tem no cardápio
        Map<ItemCardapio.CategoriaCardapio, Integer> itensPorCategoria = new TreeMap<>();
        for (ItemCardapio item : itens) {
            ItemCardapio.CategoriaCardapio categoria = item.categoria();
            if(!itensPorCategoria.containsKey(categoria)) {
                itensPorCategoria.put(categoria, 1);
            } else {
                Integer quantidadeAnterior = itensPorCategoria.get(categoria);
                itensPorCategoria.put(categoria, quantidadeAnterior + 1);
            }
        }
        System.out.println(itensPorCategoria);
        System.out.println("---------------------");
        itens.stream()
                .collect(Collectors.groupingBy(
                        ItemCardapio::categoria,
                        TreeMap::new,
                        Collectors.counting()
                ))
                .forEach((categoria, quantidade) -> System.out.println(categoria + " : " + quantidade));

        // saber quais categorias existem no cardápio
        /*
        Comparator<ItemCardapio.CategoriaCardapio> comparadorPorNome = Comparator.comparing(ItemCardapio.CategoriaCardapio::name);
        Set<ItemCardapio.CategoriaCardapio> categorias = new TreeSet<>(comparadorPorNome);
        for (ItemCardapio item : itens) {
            ItemCardapio.CategoriaCardapio categoria = item.categoria();
            categorias.add(categoria);
        }
        for (ItemCardapio.CategoriaCardapio categoria : categorias) {
            System.out.println(categoria);
        }
        System.out.println("---------------------");
        itens.stream().map(ItemCardapio::categoria)
                .collect(Collectors.toCollection(() -> new TreeSet<>(comparadorPorNome)))
                .forEach(System.out::println);

         */
    }
}
