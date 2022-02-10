package com.salesianostriana.dam.upload.controller;

import com.salesianostriana.dam.upload.dto.FileResponse;
import com.salesianostriana.dam.upload.service.StorageService;
import com.salesianostriana.dam.upload.utils.MediaTypeUrlResource;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class FileController {

    private final StorageService storageService;


    @PostMapping("/upload") //le ponemos el nombre "file" al archivo
    public ResponseEntity<?> upload(@RequestPart("file") MultipartFile file) {

        String name = storageService.store(file);

        String uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/download/")
                .path(name)
                .toUriString();

        String miniUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/download/")
                .path("mini"+name)
                .toUriString();

        FileResponse response = FileResponse.builder()
                .name(name)
                .size(file.getSize())
                .type(file.getContentType())
                .uri(uri)
                .build();

        FileResponse miniResponse = FileResponse.builder()
                .name("mini"+name)
                .size(512L)
                .type(file.getContentType())
                .uri(miniUri)
                .build();

        List<FileResponse> imagesResponses = List.of(response, miniResponse);
        //URI.create(miniUri);

        return ResponseEntity.created(URI.create(uri)).body(imagesResponses);

    }

    @GetMapping("/download/{filename:.+}")
    public ResponseEntity<List<Resource>> getFile(@PathVariable String filename) {
        MediaTypeUrlResource resource = (MediaTypeUrlResource) storageService.loadAsResource(filename);
        MediaTypeUrlResource miniImage = (MediaTypeUrlResource) storageService.loadAsResource("mini"+filename);

        return ResponseEntity.status(HttpStatus.OK)
                .header("content-type", resource.getType())
                .body(List.of(resource, miniImage));


    }

}
