package com.dio.live.service;

import com.dio.live.model.movimentacao;
import com.dio.live.repository.movimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movimentacaoService {

    movimentacaoRepository operationRepository;

    @Autowired
    public movimentacaoService(movimentacaoRepository operationRepository){
        this.operationRepository = operationRepository;
    }

    public movimentacao save(movimentacao operation){
        return operationRepository.save(operation);
    }

    public List<movimentacao> findAll() {
        return operationRepository.findAll();
    }

    public Optional<movimentacao> findById(Long id) {
        return operationRepository.findById(id);
    }

    public movimentacao update(movimentacao operation){
        return operationRepository.save(operation);
    }

    public void deleteOperation(Long id) {
        operationRepository.deleteById(id);
    }

}