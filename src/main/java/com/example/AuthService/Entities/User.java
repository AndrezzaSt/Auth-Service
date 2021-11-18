package com.example.AuthService.Entities;

import com.example.AuthService.domain.TipoUsuario;

public class User {
    private String Usuario;
    private String Senha;
    private TipoUsuario tipo;
    private String id;

    public User(){
    }

    public User(String usuario, String senha, TipoUsuario tipo, String id) {
        Usuario = usuario;
        Senha = senha;
        this.tipo = tipo;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
