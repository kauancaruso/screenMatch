package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(9);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(7);
        var novoFilme = new Filme("Star Wars: Episódio V – O Império Contra-Ataca", 1980);
        novoFilme.avalia(10);
        Serie serie = new Serie("La Casa de Papel", 2017);

        Filme f1 = novoFilme;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(novoFilme);
        lista.add(outro);
        lista.add(favorito);
        lista.add(serie);

//        Forma compacta de definir uma função que recebe um parâmetro nome e realiza a operação de impressão.
//        lista.forEach(nome -> System.out.println(nome));

//        É possível simplificar ainda mais o exemplo de código anterior, utilizando o recurso conhecido como Method Reference, que nada mais é do que uma forma reduzida de uma expressão lambda:
//        lista.forEach(System.out::println);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
