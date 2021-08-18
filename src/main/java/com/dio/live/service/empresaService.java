package com.dio.live.service;

import com.dio.live.model.empresa;
import com.dio.live.repository.empresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class empresaService {

    empresaRepository companyRepository;

    @Autowired
    public empresaService(empresaRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    public empresa save(empresa company){
        return companyRepository.save(company);
    }

    public List<empresa> findAll() {
        return companyRepository.findAll();
    }

    public Optional<empresa> findById(Long id) {
        return companyRepository.findById(id);
    }

    public empresa update(empresa company){
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

}