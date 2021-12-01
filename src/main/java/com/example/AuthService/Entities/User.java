package com.example.AuthService.Entities;

import com.example.AuthService.domain.TipoUsuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String Usuario;
    private String Senha;
    private TipoUsuario tipo;


    public User(){
    }

    public User(String usuario, String senha, TipoUsuario tipo) {
        Usuario = usuario;
        Senha = senha;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }
}
