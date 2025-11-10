package br.com.manoel.cardapio;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        List<ItemCardapio> itens = database.listaDeItensCardapio();
        for (ItemCardapio itemCardapio : itens) {
            System.out.println(itemCardapio);
        }
    }
}
