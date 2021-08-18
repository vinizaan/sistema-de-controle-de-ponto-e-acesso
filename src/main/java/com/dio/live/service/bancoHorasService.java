package com.dio.live.service;

import com.dio.live.model.bancoHoras;
import com.dio.live.repository.bancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class bancoHorasService {

    bancoHorasRepository annualLeaveRepository;

    @Autowired
    public bancoHorasService(bancoHorasRepository annualLeaveRepository){
        this.annualLeaveRepository = annualLeaveRepository;
    }

    public bancoHoras save(bancoHoras annualLeave){
        return annualLeaveRepository.save(annualLeave);
    }

    public List<bancoHoras> findAll() {
        return annualLeaveRepository.findAll();
    }

    public Optional<bancoHoras> findById(Long id) {
        return annualLeaveRepository.findById(id);
    }

    public bancoHoras update(bancoHoras annualLeave){
        return annualLeaveRepository.save(annualLeave);
    }

    public void deleteAnnualLeave(Long id) {
        annualLeaveRepository.deleteById(id);
    }

}