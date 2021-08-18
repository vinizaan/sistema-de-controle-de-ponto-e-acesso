package com.dio.live.controller;

import com.dio.live.model.nivelAcesso;
import com.dio.live.service.nivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/accesslevel")
public class nivelAcessoController {

    @Autowired
    nivelAcessoService accessLevelService;

    @PostMapping
    public nivelAcesso createAccessLevel(@RequestBody nivelAcesso accessLevel){
        return accessLevelService.save(accessLevel);
    }

    @GetMapping
    public List<nivelAcesso> getAccessLevelList(){
        return accessLevelService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<nivelAcesso>  getAccessLevelById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(accessLevelService.findById(id).orElseThrow(()->new Exception("AccessLevel not found")));
    }

    @PutMapping
    public nivelAcesso updateAccessLevel(@RequestBody nivelAcesso accessLevel){
        return accessLevelService.update(accessLevel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<nivelAcesso> deleteDateType(@PathVariable("id") Long id) {
        accessLevelService.deleteAccessLevel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}