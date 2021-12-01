package com.example.AuthService.services;

import com.example.AuthService.Entities.Imovel;
import com.example.AuthService.interfaces.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImovelService {
    @Autowired
    private ImovelRepository repo;

    public List buscaTodosImoveis() {
        List imoveisDisponiveis = new ArrayList();
        return imoveisDisponiveis = repo.findAll().stream().filter(iterator -> iterator.isDisponibilidade() == true).collect(Collectors.toList());
    }

    public Imovel Save(Imovel obj) {
        return repo.save(obj);
    }
}
