package com.dio.live.service;


import com.dio.live.model.ocorrencia;
import com.dio.live.repository.ocorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ocorrenciaService {

    ocorrenciaRepository occurrenceRepository;

    @Autowired
    public ocorrenciaService(ocorrenciaRepository occurrenceRepository){
        this.occurrenceRepository = occurrenceRepository;
    }

    public ocorrencia save(ocorrencia occurrence){
        return occurrenceRepository.save(occurrence);
    }

    public List<ocorrencia> findAll() {
        return occurrenceRepository.findAll();
    }

    public Optional<ocorrencia> findById(Long id) {
        return occurrenceRepository.findById(id);
    }

    public ocorrencia update(ocorrencia occurrence){
        return occurrenceRepository.save(occurrence);
    }

    public void deleteOccurrence(Long id) {
        occurrenceRepository.deleteById(id);
    }

}