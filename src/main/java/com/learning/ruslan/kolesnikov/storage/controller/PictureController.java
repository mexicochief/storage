package com.learning.ruslan.kolesnikov.storage.controller;

import com.learning.ruslan.kolesnikov.storage.dto.StorageFile;
import com.learning.ruslan.kolesnikov.storage.service.PictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/picture")
@RequiredArgsConstructor
public class PictureController {
    private final PictureService pictureService;

    @PostMapping
    public ResponseEntity<StorageFile> post(StorageFile storageFile) {
        return null;
    }

    @GetMapping
    public ResponseEntity<byte[]> get() {
        return ResponseEntity.ok(pictureService.get());
    }
}

