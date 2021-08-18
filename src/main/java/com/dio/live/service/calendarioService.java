package com.dio.live.service;

import com.dio.live.model.calendario;
import com.dio.live.repository.calendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class calendarioService {

    calendarioRepository calendarRepository;

    @Autowired
    public calendarioService(calendarioRepository calendarRepository){
        this.calendarRepository = calendarRepository;
    }

    public calendario save(calendario calendar){
        return calendarRepository.save(calendar);
    }

    public List<calendario> findAll() {
        return calendarRepository.findAll();
    }

    public Optional<calendario> findById(Long id) {
        return calendarRepository.findById(id);
    }

    public calendario update(calendario calendar){
        return calendarRepository.save(calendar);
    }

    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);
    }

}