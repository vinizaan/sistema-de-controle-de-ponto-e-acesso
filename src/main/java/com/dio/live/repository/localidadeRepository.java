package com.dio.live.repository;

import com.dio.live.model.localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface localidadeRepository extends JpaRepository<localidade, Long> {
}