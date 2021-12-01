package com.example.AuthService.Controllers;

import com.example.AuthService.Entities.Imovel;
import com.example.AuthService.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping("/cadastrarImovel")
    public ResponseEntity<Void> save(@RequestBody Imovel obj) {
        obj = imovelService.Save(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build(); //created retorna o cod 201
    }
}
