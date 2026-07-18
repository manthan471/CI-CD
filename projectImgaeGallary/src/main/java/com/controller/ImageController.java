package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;
import com.model.Image;
import com.service.ImageService;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class ImageController {
	@Autowired
	ImageService imgService;
	
	@PostMapping("/add")
	public Image addImage(@RequestParam("file") MultipartFile file) {
		
		return imgService.addImage(file);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Image>> getImages(){
		
		List<Image> imgList=imgService.getImages();
		
		return ResponseEntity.status(HttpStatus.OK).body(imgList);
		
		
	}
	
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Resource> getOneImage(@PathVariable Long id) {

	    Optional<Image> img = imgService.getOneImage(id);

	    if (img.isEmpty()) {
	        return ResponseEntity.notFound().build();
	    }

	    Image image = img.get();

	    ByteArrayResource resource =
	            new ByteArrayResource(image.getImageData());

	    return ResponseEntity
	            .status(HttpStatus.OK)
	            .contentType(MediaType.IMAGE_JPEG) // or PNG
	            .body(resource);
	}

}