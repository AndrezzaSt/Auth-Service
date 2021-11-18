package com.example.AuthService.services;

import com.example.AuthService.Entities.User;
import com.example.AuthService.domain.TipoUsuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    ArrayList<User> listaUsuarios = new ArrayList<>();
    public void iniciar(){
        listaUsuarios.add(new User("locador","123",TipoUsuario.LOCADOR, "1"));
        listaUsuarios.add(new User("locatario","123",TipoUsuario.LOCATARIO, "2"));
    }
    public User cadastraUsuario(User usuario){
        listaUsuarios.add(usuario);
        return usuario;
    }
    public List busca(){
        return listaUsuarios;
    }
    public User buscaUsuario(String user){
        for(int i=0; i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getUsuario().equals(user))
                return listaUsuarios.get(i);
        }
        return null;
    }
    public String delete(String user){
        String resposta=null;
        for(int i=0; i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getUsuario().equals(user)){
                listaUsuarios.remove(i);
                resposta="Removido com sucesso!!";
            }else{
                resposta="Usuario não encontrado!!";
            }
        }
        return resposta;
    }

    public String valida(String user, String senha) {
        User usuario= listaUsuarios.stream().filter(iterator->iterator.getUsuario().equals(user)).findFirst().get();
        if(usuario.getSenha().equals(senha)&& usuario.getTipo().equals(TipoUsuario.LOCADOR)){
            boolean locadorLogado = true;
            return "Locador Logado";
        }else if(usuario.getSenha().equals(senha)&& usuario.getTipo().equals(TipoUsuario.LOCADOR)){
            boolean locatarioLogado = true;
            return "Locatario Logado";
        }
        return "Não logado";
    }
}
