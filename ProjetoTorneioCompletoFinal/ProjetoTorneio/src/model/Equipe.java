package model;

public class Equipe {
    private int id;
    private String nome;
    private String pais;

    public Equipe() {}

    public Equipe(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public Equipe(int id, String nome, String pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
