package com.example.AuthService.services;

import com.example.AuthService.Entities.User;
import com.example.AuthService.domain.TipoUsuario;
import com.example.AuthService.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public void iniciar(){
        repo.save(new User("locador","123",TipoUsuario.LOCADOR));
        repo.save(new User("locatario","123",TipoUsuario.LOCATARIO));
    }
    public User cadastraUsuario(User usuario){
        repo.save(usuario);
        return usuario;
    }
    public List busca(){
        return (List) repo.findAll();
    }
    public Optional<User> buscaUsuario(long Id){

        return repo.findById(Id);
    }
    public void delete(User user){
        repo.delete(user);
    }

    public String valida(String user, String senha) {
        User usuario = repo.findAll().stream().filter(iterator->iterator.getUsuario().equals(user)).findFirst().get();
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
