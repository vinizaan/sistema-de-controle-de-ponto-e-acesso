package com.dio.live.repository;

import com.dio.live.model.empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empresaRepository extends JpaRepository<empresa, Long> {
}