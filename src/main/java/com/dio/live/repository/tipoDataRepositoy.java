package com.dio.live.repository;

import com.dio.live.model.tipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoDataRepositoy extends JpaRepository<tipoData, Long> {
}