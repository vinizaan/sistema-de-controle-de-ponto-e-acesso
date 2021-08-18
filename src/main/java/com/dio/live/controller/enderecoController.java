package com.dio.live.controller;

import com.dio.live.model.endereco;
import com.dio.live.service.enderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class enderecoController {

    @Autowired
    enderecoService addressService;

    @PostMapping
    public endereco createAddress(@RequestBody endereco address){
        return addressService.save(address);
    }

    @GetMapping
    public List<endereco> getAddressList(){
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<endereco>  getAddressById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(addressService.findById(id).orElseThrow(()->new Exception("address not found")));
    }

    @PutMapping
    public endereco updateAddress(@RequestBody endereco address){
        return addressService.update(address);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<endereco> deleteAddress(@PathVariable("id") Long id) {
        addressService.deleteAddress(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}