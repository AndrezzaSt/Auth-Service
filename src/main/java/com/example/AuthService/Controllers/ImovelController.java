package com.example.AuthService.Controllers;

import com.example.AuthService.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    ImovelService imovelService;
    @GetMapping
    public List buscaImovel(){
        return imovelService.buscaTodosImoveis();
    }
}
