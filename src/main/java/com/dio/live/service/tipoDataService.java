package com.dio.live.service;

import com.dio.live.model.tipoData;
import com.dio.live.repository.tipoDataRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class tipoDataService {

    tipoDataRepositoy dateTypeRepository;

    @Autowired
    public tipoDataService(tipoDataRepositoy dateTypeRepository){
        this.dateTypeRepository = dateTypeRepository;
    }

    public tipoData save(tipoData dateType){
        return dateTypeRepository.save(dateType);
    }

    public List<tipoData> findAll() {
        return dateTypeRepository.findAll();
    }

    public Optional<tipoData> findById(Long id) {
        return dateTypeRepository.findById(id);
    }

    public tipoData update(tipoData dateType){
        return dateTypeRepository.save(dateType);
    }

    public void deleteDateType(Long id) {
        dateTypeRepository.deleteById(id);
    }

}