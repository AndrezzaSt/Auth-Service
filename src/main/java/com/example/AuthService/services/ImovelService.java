package com.example.AuthService.services;

import com.example.AuthService.Entities.Imovel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImovelService {
    ArrayList<Imovel> imoveis = new ArrayList();
    public List buscaTodosImoveis() {
        List imoveisDisponiveis =new ArrayList();
        return  imoveisDisponiveis= imoveis.stream().filter(iterator-> iterator.isDisponibilidade()==true).collect(Collectors.toList());
    }
}
