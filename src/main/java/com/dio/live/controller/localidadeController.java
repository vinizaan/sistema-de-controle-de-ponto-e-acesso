package com.dio.live.controller;

import com.dio.live.model.localidade;
import com.dio.live.service.localidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/location")
public class localidadeController {

    @Autowired
    localidadeService locationService;

    @PostMapping
    public localidade createLocation(@RequestBody localidade location){
        return locationService.save(location);
    }

    @GetMapping
    public List<localidade> getLocationList(){
        return locationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<localidade>  getLocationById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(locationService.findById(id).orElseThrow(()->new Exception("Location not found")));
    }

    @PutMapping
    public localidade updateLocation(@RequestBody localidade location){
        return locationService.update(location);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<localidade> deleteLocation(@PathVariable("id") Long id) {
        locationService.deleteLocation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}