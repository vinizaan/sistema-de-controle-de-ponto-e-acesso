package com.dio.live.service;

import com.dio.live.model.usuario;
import com.dio.live.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuarioService {

    usuarioRepository userRepository;

    @Autowired
    public usuarioService(usuarioRepository userRepository){
        this.userRepository = userRepository;
    }

    public usuario save(usuario user){
        return userRepository.save(user);
    }

    public List<usuario> findAll() {
        return userRepository.findAll();
    }

    public Optional<usuario> findById(Long id) {
        return userRepository.findById(id);
    }

    public usuario update(usuario user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}