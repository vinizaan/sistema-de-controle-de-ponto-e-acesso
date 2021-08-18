package com.dio.live.repository;


import com.dio.live.model.calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface calendarioRepository extends JpaRepository<calendario, Long> {
}