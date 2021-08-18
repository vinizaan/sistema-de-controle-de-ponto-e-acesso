package com.dio.live.service;

import com.dio.live.model.endereco;
import com.dio.live.repository.enderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class enderecoService {

    enderecoRepository addressRepository;

    @Autowired
    public enderecoService(enderecoRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public endereco save(endereco address){
        return addressRepository.save(address);
    }

    public List<endereco> findAll() {
        return addressRepository.findAll();
    }

    public Optional<endereco> findById(Long id) {
        return addressRepository.findById(id);
    }

    public endereco update(endereco address){
        return addressRepository.save(address);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

}