package com.dio.live.repository;


import com.dio.live.model.movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movimentacaoRepository extends JpaRepository<movimentacao, Long> {
}