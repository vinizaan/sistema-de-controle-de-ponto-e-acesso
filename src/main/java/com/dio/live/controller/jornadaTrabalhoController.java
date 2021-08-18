package com.dio.live.controller;

import com.dio.live.service.jornadaTrabalhoService;
import com.dio.live.model.jornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workday")
public class jornadaTrabalhoController {

    @Autowired
    jornadaTrabalhoService workdayService;

    @PostMapping
    public jornadaTrabalho createWorkay(@RequestBody jornadaTrabalho workday){
        return workdayService.save(workday);
    }

    @GetMapping
    public List<jornadaTrabalho> getWorkdayList(){
        return workdayService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<jornadaTrabalho>  getWorkdayById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(workdayService.findById(id).orElseThrow(()->new Exception("Workday not found")));
    }

    @PutMapping
    public jornadaTrabalho updateWorkday(@RequestBody jornadaTrabalho workday){
        return workdayService.update(workday);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<jornadaTrabalho> deleteWorkday(@PathVariable("id") Long id) {
        workdayService.deleteWorkday(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}