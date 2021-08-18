package com.dio.live.controller;

import com.dio.live.model.bancoHoras;
import com.dio.live.service.bancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/annualleave")
public class bancoHorasController {

    @Autowired
    bancoHorasService annualLeaveService;

    @PostMapping
    public bancoHoras createAnnualLeave(@RequestBody bancoHoras annualLeave){
        return annualLeaveService.save(annualLeave);
    }

    @GetMapping
    public List<bancoHoras> getAnnualLeaveList(){
        return annualLeaveService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<bancoHoras>  getAnnualLeaveById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(annualLeaveService.findById(id).orElseThrow(()->new Exception("Annualleave not found")));
    }

    @PutMapping
    public bancoHoras updateAnnualLeave(@RequestBody bancoHoras annualLeave){
        return annualLeaveService.update(annualLeave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<bancoHoras> deleteAnnualLeave(@PathVariable("id") Long id) {
        annualLeaveService.deleteAnnualLeave(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}