package com.sample.demo;

import java.io.IOException;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class FileController {

	
	@Autowired
	FileService service;
	

	@PostMapping("/uploading")
	public ResponseEntity<?> uploadingImage(@RequestParam("image") MultipartFile file) throws IOException{
		String response=service.uploadImage(file);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	
	@GetMapping("/getimage/{filename}")
	public ResponseEntity<?> downloadingImage(@PathVariable("filename") String filename) throws IOException, DataFormatException{
		byte[] imagedata= service.downloadImage(filename);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(imagedata);
	}
	

}
