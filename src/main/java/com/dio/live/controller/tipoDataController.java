package com.dio.live.controller;

import com.dio.live.model.tipoData;
import com.dio.live.service.tipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datetype")
public class tipoDataController {

    @Autowired
    tipoDataService dateTypeService;

    @PostMapping
    public tipoData createDateType(@RequestBody tipoData dateType){
        return dateTypeService.save(dateType);
    }

    @GetMapping
    public List<tipoData> getDateTypeList(){
        return dateTypeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<tipoData>  getDateTypeById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(dateTypeService.findById(id).orElseThrow(()->new Exception("Date Type not found")));
    }

    @PutMapping
    public tipoData updateDateType(@RequestBody tipoData dateType){
        return dateTypeService.update(dateType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<tipoData> deleteDateType(@PathVariable("id") Long id) {
        dateTypeService.deleteDateType(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}