package com.dio.live.repository;

import com.dio.live.model.endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enderecoRepository extends JpaRepository<endereco, Long> {
}