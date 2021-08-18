package com.dio.live.controller;

import com.dio.live.model.ocorrencia;
import com.dio.live.service.ocorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/occurrence")
public class ocorrenciaController {

    @Autowired
    ocorrenciaService occurrenceService;

    @PostMapping
    public ocorrencia createOccurrence(@RequestBody ocorrencia occurrence){
        return occurrenceService.save(occurrence);
    }

    @GetMapping
    public List<ocorrencia> getOccurrenceList(){
        return occurrenceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ocorrencia>  getOccurrenceById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(occurrenceService.findById(id).orElseThrow(()->new Exception("Occurrence not found")));
    }

    @PutMapping
    public ocorrencia updateOccurrence(@RequestBody ocorrencia occurrence){
        return occurrenceService.update(occurrence);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ocorrencia> deleteOccurrence(@PathVariable("id") Long id) {
        occurrenceService.deleteOccurrence(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}