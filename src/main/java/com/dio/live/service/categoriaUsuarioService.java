package com.dio.live.service;

import com.dio.live.model.categoriaUsuario;
import com.dio.live.repository.categoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class categoriaUsuarioService {

    categoriaUsuarioRepository userCategoryRepository;

    @Autowired
    public categoriaUsuarioService(categoriaUsuarioRepository userCategoryRepository){
        this.userCategoryRepository = userCategoryRepository;
    }

    public categoriaUsuario save(categoriaUsuario userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public List<categoriaUsuario> findAll() {
        return userCategoryRepository.findAll();
    }

    public Optional<categoriaUsuario> findById(Long id) {
        return userCategoryRepository.findById(id);
    }

    public categoriaUsuario update(categoriaUsuario workday){
        return userCategoryRepository.save(workday);
    }

    public void deleteUserCategory(Long id) {
        userCategoryRepository.deleteById(id);
    }

}