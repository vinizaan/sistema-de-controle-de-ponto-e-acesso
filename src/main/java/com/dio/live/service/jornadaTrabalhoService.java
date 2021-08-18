package com.dio.live.service;

import com.dio.live.model.jornadaTrabalho;
import com.dio.live.repository.jornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class jornadaTrabalhoService {

    jornadaTrabalhoRepository workdayRepository;

    @Autowired
    public jornadaTrabalhoService(jornadaTrabalhoRepository workdayRepository){
        this.workdayRepository = workdayRepository;
    }

    public jornadaTrabalho save(jornadaTrabalho workday){
        return workdayRepository.save(workday);
    }

    public List<jornadaTrabalho> findAll() {
        return workdayRepository.findAll();
    }

    public Optional<jornadaTrabalho> findById(Long id) {
        return workdayRepository.findById(id);
    }

    public jornadaTrabalho update(jornadaTrabalho workday){
        return workdayRepository.save(workday);
    }

    public void deleteWorkday(Long id) {
        workdayRepository.deleteById(id);
    }

}