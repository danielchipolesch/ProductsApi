package br.com.cotiinformatica.controllers;

import br.com.cotiinformatica.dtos.ProductRequestDto;
import br.com.cotiinformatica.dtos.ProductResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    @PostMapping
    public ResponseEntity<ProductResponseDto> post(@RequestBody ProductRequestDto request){
        //TODO
        return ResponseEntity.status(201).body(null);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductResponseDto> put(@PathVariable("id") Long id, @RequestBody ProductRequestDto request){
        //TODO
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ProductResponseDto> delete(@PathVariable("id") Long id){
        //TODO
        return ResponseEntity.status(200).body(null);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size){
        //TODO
        return ResponseEntity.status(200).body(null);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductResponseDto> getById(@PathVariable("id") Long id){
        //TODO
        return ResponseEntity.status(200).body(null);
    }
}
