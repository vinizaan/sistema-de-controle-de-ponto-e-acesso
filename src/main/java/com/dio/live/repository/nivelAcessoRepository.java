package com.dio.live.repository;

import com.dio.live.model.nivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface nivelAcessoRepository extends JpaRepository<nivelAcesso, Long> {
}