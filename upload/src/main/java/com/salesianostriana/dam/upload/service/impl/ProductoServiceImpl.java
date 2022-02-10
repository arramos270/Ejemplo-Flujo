package com.salesianostriana.dam.upload.service.impl;

import com.salesianostriana.dam.upload.model.Producto;
import com.salesianostriana.dam.upload.service.StorageService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class ProductoServiceImpl implements IProductoService {

    /*private final ProductoRepository repository;
    private final StorageService storageService;

    public Producto save(CreateProductoDto createProductoDto, MultipartFile file){

        String filename = storageService.store(file);

        String uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/download/")
                .path(filename)
                .toUriString()

        return repository.save(Producto.builder());

    }*/


}
