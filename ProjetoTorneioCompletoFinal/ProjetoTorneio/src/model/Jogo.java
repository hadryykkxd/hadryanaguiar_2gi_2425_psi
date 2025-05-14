package model;

import java.time.LocalDate;

public class Jogo {
    private int id;
    private int equipe1Id;
    private int equipe2Id;
    private LocalDate data;
    private String placar;

    public Jogo() {}

    public Jogo(int equipe1Id, int equipe2Id, LocalDate data, String placar) {
        this.equipe1Id = equipe1Id;
        this.equipe2Id = equipe2Id;
        this.data = data;
        this.placar = placar;
    }

    public Jogo(int id, int equipe1Id, int equipe2Id, LocalDate data, String placar) {
        this.id = id;
        this.equipe1Id = equipe1Id;
        this.equipe2Id = equipe2Id;
        this.data = data;
        this.placar = placar;
    }

    public int getId() {
        return id;
    }

    public int getEquipe1Id() {
        return equipe1Id;
    }

    public int getEquipe2Id() {
        return equipe2Id;
    }

    public LocalDate getData() {
        return data;
    }

    public String getPlacar() {
        return placar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEquipe1Id(int equipe1Id) {
        this.equipe1Id = equipe1Id;
    }

    public void setEquipe2Id(int equipe2Id) {
        this.equipe2Id = equipe2Id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setPlacar(String placar) {
        this.placar = placar;
    }
}
