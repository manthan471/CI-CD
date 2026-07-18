package com.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dao.ImageRepository;
import com.model.Image;

@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	ImageRepository imgRepo;

	@Override
	public Image addImage(MultipartFile file) {
		Image img=new Image();
		img.setName(file.getOriginalFilename());
		
		try {
			img.setImageData(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return imgRepo.save(img);
	}
	
	@Override
	public List<Image> getImages(){
		return imgRepo.findAll();
		
	}
	
	@Override
	public Optional<Image> getOneImage(Long id){
		
		Optional<Image> img=imgRepo.findById(id);
		
				return img;
		
	}
}