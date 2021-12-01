package com.example.AuthService.interfaces;

import com.example.AuthService.Entities.Imovel;
import com.example.AuthService.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository  extends JpaRepository<Imovel, Long> {
}
