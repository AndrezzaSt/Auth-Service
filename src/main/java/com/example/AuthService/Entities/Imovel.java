package com.example.AuthService.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String nome;
    private String tipo;
    private String cidade;
    private String preco;
    private boolean disponibilidade;

    public Imovel() {
    }

    public Imovel(String nome, String tipo, String cidade, String preço, boolean disponibilidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.cidade = cidade;
        this.preco = preço;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Long getId() {
        return Id;
    }
}
