/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Joao Sertoli
 */
@Entity
@Table(name = "tbl_carta")
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", updatable = false, nullable = false)
    private int id;

    @Column(name = "car_nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "car_ataque", nullable = false)
    private int ataque;

    @Column(name = "car_defesa", nullable = false)
    private int defesa;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_categoria", length = 20)
    private Categoria categoria;

    @Column(name = "car_raridade")
    private Integer raridade;
    
    @ManyToOne
    @JoinColumn(name = "jog_id") 
    private Jogador jogador;


    public Carta() {}

    public Carta(int id, String nome, int ataque, int defesa, Categoria categoria, Integer raridade) {
        this.id = id;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.categoria = categoria;
        this.raridade = raridade;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getRaridade() {
        return raridade;
    }

    public void setRaridade(Integer raridade) {
        this.raridade = raridade;
    }
   
    @Override
    public String toString() {
        return nome +" ("+categoria+"): A: "+ataque+" - D: "+defesa;
    }
}
