package model;

public class Palmares {
    private int id;
    private int equipeId;
    private String titulo;
    private int ano;

    public Palmares() {}

    public Palmares(int equipeId, String titulo, int ano) {
        this.equipeId = equipeId;
        this.titulo = titulo;
        this.ano = ano;
    }

    public Palmares(int id, int equipeId, String titulo, int ano) {
        this.id = id;
        this.equipeId = equipeId;
        this.titulo = titulo;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public int getEquipeId() {
        return equipeId;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEquipeId(int equipeId) {
        this.equipeId = equipeId;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
