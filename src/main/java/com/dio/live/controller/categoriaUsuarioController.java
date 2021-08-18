package com.dio.live.controller;

import com.dio.live.model.categoriaUsuario;
import com.dio.live.service.categoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/usercategory")
public class categoriaUsuarioController {

    @Autowired
    categoriaUsuarioService userCategoryService;

    @PostMapping
    public categoriaUsuario createUserCategory(@RequestBody categoriaUsuario userCategory){
        return userCategoryService.save(userCategory);
    }

    @GetMapping
    public List<categoriaUsuario> getUserCategoryList(){
        return userCategoryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<categoriaUsuario>  getUserCategoryById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(userCategoryService.findById(id).orElseThrow(()->new Exception("UserCategory not found")));
    }

    @PutMapping
    public categoriaUsuario updateUserCategory(@RequestBody categoriaUsuario userCategory){
        return userCategoryService.update(userCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<categoriaUsuario> deleteUserCategory(@PathVariable("id") Long id) {
        userCategoryService.deleteUserCategory(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}