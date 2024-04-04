package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String direto;

    public String getDireto() {
        return direto;
    }

    public void setDireto(String direto) {
        this.direto = direto;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }
}
