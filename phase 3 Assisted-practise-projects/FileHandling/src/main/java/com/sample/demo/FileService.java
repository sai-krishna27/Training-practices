package com.sample.demo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	@Autowired
	FileRepo repo;
	private final String FOLDER_PATH="E:\\images\\";
	public String uploadImage(MultipartFile file) throws IOException
	{
		FileData  data=new FileData();
		data.setName(file.getOriginalFilename());
		data.setType(file.getContentType());
		data.setFilePath(FOLDER_PATH+file.getOriginalFilename());
		FileData res=repo.save(data);
		if(res!=null) {
			return "file path is uploaded into the dB successfully..."+file.getOriginalFilename();
		}
		return null;
	}
	
	public byte[] downloadImage(String filename) throws IOException {
		Optional<FileData> fileimg= repo.findByName(filename);
		
		String filePath=fileimg.get().getFilePath();
		byte[] images=Files.readAllBytes(new File(filePath).toPath());
		
		
		return images;
	}
	
}
