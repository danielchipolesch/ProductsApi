package br.com.cotiinformatica.controllers;

import br.com.cotiinformatica.dtos.CategoryResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/categories")
public class CategoryController {

    @GetMapping
    public ResponseEntity<List<CategoryResponseDto>> getAll(){
        //TODO
        return ResponseEntity.status(200).body(null);
    }
}
