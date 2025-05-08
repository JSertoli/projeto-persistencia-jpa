/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joao Sertoli
 */
class Jogador {
    private int id;
    private String nickname;
    private int level;
    private List<Carta> baralho;

    // Construtor
    public Jogador(int id, String nickname, int level) {
        this.id = id;
        this.nickname = nickname;
        this.level = level;
        this.baralho = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(List<Carta> baralho) {
        this.baralho = baralho;
    }

    // Método para adicionar uma carta ao baralho
    public void adicionarCarta(Carta carta) {
        baralho.add(carta);
    }
}
