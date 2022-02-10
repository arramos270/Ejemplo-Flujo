package com.salesianostriana.dam.upload.controller;

import com.salesianostriana.dam.upload.service.impl.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {

    //private final IProductoService service;

    /*@PostMapping("/")
    public ResponseEntity<?> create(@RequestPart("file")MultipartFile file,
                                    @RequestPart("product")CreateProductoDto productoDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.save(newProduct, file));
    }

    @GetMapping
    public ResponseEntity<?> list(){
        
    }*/
}
