package br.com.manoel.cardapio;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        List<ItemCardapio> itens = database.listaDeItensCardapio();

        // saber quais categorias existem no cardápio
        Set<ItemCardapio.CategoriaCardapio> categorias = new HashSet<>();
        for (ItemCardapio item : itens) {
            ItemCardapio.CategoriaCardapio categoria = item.categoria();
            categorias.add(categoria);
        }
        for (ItemCardapio.CategoriaCardapio categoria : categorias) {
            System.out.println(categoria);
        }
        System.out.println("---------------------");
        itens.stream().map(ItemCardapio::categoria)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
