package br.com.manoel.cardapio;

import java.util.LinkedList;
import java.util.List;

public class Database {

    public List<ItemCardapio> listaDeItensCardapio() {
        List<ItemCardapio> itens = new LinkedList<>();

        ItemCardapio refrescoDoChaves = new ItemCardapio(1L, "Refresco do Chaves", """
                Suco de limão, que parece tamarindo mas tem gosto de groselha
                """, ItemCardapio.CategoriaCardapio.BEBIDAS, null, null);
        itens.add(refrescoDoChaves);

        ItemCardapio sopaDeLetra = new ItemCardapio(2L, "Sopa de Letra", """
                Sopa com macarrão em formato de letras do alfabeto
                """, ItemCardapio.CategoriaCardapio.ENTRADAS, null, null);
        itens.add(sopaDeLetra);

        ItemCardapio pizzaDeQueijo = new ItemCardapio(3L, "Pizza de Queijo", """
                Pizza com muito queijo derretido e borda recheada
                """, ItemCardapio.CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itens.add(pizzaDeQueijo);

        ItemCardapio pudimDeLeite = new ItemCardapio(4L, "Pudim de Leite", """
                Pudim cremoso com calda de caramelo
                """, ItemCardapio.CategoriaCardapio.SOBREMESA, null, null);
        itens.add(pudimDeLeite);

        ItemCardapio aguaMineral = new ItemCardapio(5L, "Água Mineral", """
                Água mineral sem gás
                """, ItemCardapio.CategoriaCardapio.BEBIDAS, null, null);
        itens.add(aguaMineral);

        ItemCardapio saladaCaesar = new ItemCardapio(6L, "Salada Caesar", """
                Salada com alface, croutons, queijo parmesão e molho Caesar
                """, ItemCardapio.CategoriaCardapio.ENTRADAS, null, null);
        itens.add(saladaCaesar);

        ItemCardapio bifeAcebolado = new ItemCardapio(7L, "Bife Acebolado", """
                Bife grelhado com cebolas caramelizadas
                """, ItemCardapio.CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itens.add(bifeAcebolado);

        ItemCardapio mousseDeChocolate = new ItemCardapio(8L, "Mousse de Chocolate", """
                Mousse leve e aerado de chocolate meio amargo
                """, ItemCardapio.CategoriaCardapio.SOBREMESA, null, null);
        itens.add(mousseDeChocolate);

        ItemCardapio refrigeranteLaranja = new ItemCardapio(9L, "Refrigerante de Laranja", """
                Refrigerante sabor laranja geladinho
                """, ItemCardapio.CategoriaCardapio.BEBIDAS, null, null);
        itens.add(refrigeranteLaranja);

        ItemCardapio bruschetta = new ItemCardapio(10L, "Bruschetta", """
                Pão italiano tostado com tomate, manjericão e azeite
                """, ItemCardapio.CategoriaCardapio.ENTRADAS, null, null);
        itens.add(bruschetta);

        ItemCardapio lasanhaBolonhesa = new ItemCardapio(11L, "Lasanha à Bolonhesa", """
                Camadas de massa, molho bolonhesa, queijo e molho bechamel
                """, ItemCardapio.CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itens.add(lasanhaBolonhesa);

        ItemCardapio sorveteBaunilha = new ItemCardapio(12L, "Sorvete de Baunilha", """
                Sorvete cremoso sabor baunilha com calda de chocolate
                """, ItemCardapio.CategoriaCardapio.SOBREMESA, null, null);
        itens.add(sorveteBaunilha);

        ItemCardapio chaGelado = new ItemCardapio(13L, "Chá Gelado", """
                Chá preto gelado com limão e hortelã
                """, ItemCardapio.CategoriaCardapio.BEBIDAS, null, null);
        itens.add(chaGelado);

        return itens;
    }
}
