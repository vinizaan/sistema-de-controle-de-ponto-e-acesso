package com.dio.live.controller;

import com.dio.live.model.movimentacao;
import com.dio.live.service.movimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operation")
public class movimentacaoController {

    @Autowired
    movimentacaoService operationService;

    @PostMapping
    public movimentacao createOperation(@RequestBody movimentacao operation){
        return operationService.save(operation);
    }

    @GetMapping
    public List<movimentacao> getOperationList(){
        return operationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<movimentacao>  getOperationById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(operationService.findById(id).orElseThrow(()->new Exception("operation not found")));
    }

    @PutMapping
    public movimentacao updateOperation(@RequestBody movimentacao operation){
        return operationService.update(operation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<movimentacao> deleteOperation(@PathVariable("id") Long id) {
        operationService.deleteOperation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}