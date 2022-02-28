package br.com.salomaotech;

public class BemVindo {

    private final long id;
    private final String conteudo;

    public BemVindo(long id, String conteudo) {
        this.id = id;
        this.conteudo = conteudo;
    }

    public long getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

}
