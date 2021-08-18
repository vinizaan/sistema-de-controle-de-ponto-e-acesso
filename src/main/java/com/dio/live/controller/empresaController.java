package com.dio.live.controller;

import com.dio.live.model.empresa;
import com.dio.live.service.empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class empresaController {

    @Autowired
    empresaService companyService;

    @PostMapping
    public empresa createCompany(@RequestBody empresa company){
        return companyService.save(company);
    }

    @GetMapping
    public List<empresa> getCompanyList(){
        return companyService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<empresa>  getCompanyById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(companyService.findById(id).orElseThrow(()->new Exception("Company not found")));
    }

    @PutMapping
    public empresa updateCompany(@RequestBody empresa company){
        return companyService.update(company);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<empresa> deleteCompany(@PathVariable("id") Long id) {
        companyService.deleteCompany(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}