package com.dio.live.controller;

import com.dio.live.model.usuario;
import com.dio.live.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usuarioController {

    @Autowired
    usuarioService userService;

    @PostMapping
    public usuario createUser(@RequestBody usuario user){
        return userService.save(user);
    }

    @GetMapping
    public List<usuario> getUserList(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<usuario>  getUserById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(userService.findById(id).orElseThrow(()->new Exception("User not found")));
    }

    @PutMapping
    public usuario updateUser(@RequestBody usuario user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<usuario> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}