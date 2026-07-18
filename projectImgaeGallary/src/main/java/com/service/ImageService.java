package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.model.Image;

public interface ImageService {

	public Image addImage(MultipartFile file);
	public List<Image> getImages();
	public Optional<Image> getOneImage(Long id);
	
	
}