package com.dio.live.repository;


import com.dio.live.model.jornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jornadaTrabalhoRepository extends JpaRepository<jornadaTrabalho, Long> {
}