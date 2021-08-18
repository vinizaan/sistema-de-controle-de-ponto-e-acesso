package com.dio.live.repository;


import com.dio.live.model.bancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bancoHorasRepository extends JpaRepository<bancoHoras, Long> {
}