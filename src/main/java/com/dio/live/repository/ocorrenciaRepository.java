package com.dio.live.repository;

import com.dio.live.model.ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ocorrenciaRepository extends JpaRepository<ocorrencia, Long> {
}