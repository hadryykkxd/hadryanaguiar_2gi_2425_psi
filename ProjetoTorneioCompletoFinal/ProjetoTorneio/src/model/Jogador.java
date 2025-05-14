package model;

public class Jogador {
    private int id;
    private String nome;
    private int idade;
    private String posicao;
    private int equipeId;

    public Jogador() {}

    public Jogador(String nome, int idade, String posicao, int equipeId) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.equipeId = equipeId;
    }

    public Jogador(int id, String nome, int idade, String posicao, int equipeId) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.equipeId = equipeId;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getEquipeId() {
        return equipeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setEquipeId(int equipeId) {
        this.equipeId = equipeId;
    }
}
