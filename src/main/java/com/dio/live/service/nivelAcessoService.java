package com.dio.live.service;

import com.dio.live.model.nivelAcesso;
import com.dio.live.repository.nivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class nivelAcessoService {

    nivelAcessoRepository accessLevelRepository;

    @Autowired
    public nivelAcessoService(nivelAcessoRepository accessLevelRepository){
        this.accessLevelRepository = accessLevelRepository;
    }

    public nivelAcesso save(nivelAcesso accessLevel){
        return accessLevelRepository.save(accessLevel);
    }

    public List<nivelAcesso> findAll() {
        return accessLevelRepository.findAll();
    }

    public Optional<nivelAcesso> findById(Long id) {
        return accessLevelRepository.findById(id);
    }

    public nivelAcesso update(nivelAcesso accessLevel){
        return accessLevelRepository.save(accessLevel);
    }

    public void deleteAccessLevel(Long id) {
        accessLevelRepository.deleteById(id);
    }

}