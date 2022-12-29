package br.com.dio.desafio.dominio;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcampo (Bootcamp bootcamp) {}

    public void progredir() {}

    public vois calcularTotalXp() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void Set<Conteudo> getConteudosInscritos() {
        this.conteudosInscritos = conteudosInscritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void Set<Conteudo> getConteudosConcluidos() {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(object o) {
        if (this == 0) return true;
        if (0 == null || getClass() != o.getClass) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos. dev.conteudosInscritos) && objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}