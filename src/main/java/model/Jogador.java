/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Joao Sertoli
 */

@Table(name = "tbl_jogador")
@Entity
public class Jogador implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jog_id")
    private int id;
    @Column(name = "jog_nickname", nullable = false)
    private String nickname;
    @Column(name = "jog_level")
    private int level;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "tbl_baralho_jogador",
        joinColumns = @JoinColumn(name = "jogador"),
        inverseJoinColumns = @JoinColumn(name = "carta")
    )
    private List<Carta> baralho;

    public Jogador() {
        baralho = new ArrayList<>();
    }

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

    public void adicionarCarta(Carta carta) {
        baralho.add(carta);
    }
    
    public void removeCarta(Carta c){
        baralho.remove(c);
    }

    @Override
    public String toString() {
        return nickname;
    }
}
