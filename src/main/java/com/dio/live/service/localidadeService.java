package com.dio.live.service;

import com.dio.live.model.localidade;
import com.dio.live.repository.localidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class localidadeService {

    localidadeRepository locationRepository;

    @Autowired
    public localidadeService(localidadeRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    public localidade save(localidade location){
        return locationRepository.save(location);
    }

    public List<localidade> findAll() {
        return locationRepository.findAll();
    }

    public Optional<localidade> findById(Long id) {
        return locationRepository.findById(id);
    }

    public localidade update(localidade location){
        return locationRepository.save(location);
    }

    public void deleteLocation(Long id) {
        locationRepository.deleteById(id);
    }

}