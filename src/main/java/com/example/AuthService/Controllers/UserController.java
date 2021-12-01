package com.example.AuthService.Controllers;

import com.example.AuthService.Entities.User;
import com.example.AuthService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UserController {
    public static boolean locatarioLogado = false;
    public static boolean locadorLogado = false;
    @Autowired
    UserService usuarioService;

    @PostMapping
    public void cadastro(@RequestBody User usuario) {
        usuarioService.cadastraUsuario(usuario);
    }

    @PostMapping("/login/{user}/{senha}")
    public String login(@PathVariable String user, @PathVariable String senha) {
        return usuarioService.valida(user, senha);


    }

    @GetMapping("/iniciar")
    public void iniciar() {
        usuarioService.iniciar();
    }

    @GetMapping
    public List buscaTodos() {
        return usuarioService.busca();
    }

    @GetMapping("/{id}")
    public User buscaUsuario(@PathVariable("id") Long id) {
        return usuarioService.buscaUsuario(id).stream().findFirst().orElseThrow();
    }

    @DeleteMapping("/{user}")
    public void delete(@PathVariable("user") User user) {
        usuarioService.delete(user);
    }
}
