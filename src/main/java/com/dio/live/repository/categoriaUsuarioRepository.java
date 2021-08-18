package com.dio.live.repository;


import com.dio.live.model.categoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoriaUsuarioRepository extends JpaRepository<categoriaUsuario, Long> {
}