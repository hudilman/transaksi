package com.example.transaksi.controller;

import com.example.transaksi.model.LogTransaksi;
import com.example.transaksi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/private")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

 @PostMapping("/upload-csv")
    public ResponseEntity<String> uploadCSV(@RequestParam("file") MultipartFile file) {
        try {
            // Process the file here
            // For example, save it to the server or parse it
            String fileName = file.getOriginalFilename();
            byte[] bytes = file.getBytes();
            // Process the file (e.g., save it, or process CSV content)

            // Returning a successful response
            return ResponseEntity.ok("File uploaded successfully: " + fileName);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("File upload failed: " + e.getMessage());
        }
    }
}
