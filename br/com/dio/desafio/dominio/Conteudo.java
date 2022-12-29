package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void String setTitulo() {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void String setDescricao() {
        this.descricao = descricao;
    }
}