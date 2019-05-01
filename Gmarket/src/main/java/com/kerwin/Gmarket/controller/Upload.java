package com.kerwin.Gmarket.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kerwin.Gmarket.model.Item;
import com.kerwin.Gmarket.service.ItemService;

@RestController
public class Upload {
	private static String UPLOADED_FOLDER = "E://temp//";
	
	@Autowired
	private ItemService iService;
	

	@GetMapping("/")
	public String index() {
	    return "upload";
	}
	
	
	@PostMapping("/upload") 
	public String singleFileUpload(@RequestParam("file") MultipartFile file,@RequestParam("tip") String tip,@RequestParam("id") String id,
	                               RedirectAttributes redirectAttributes) {
	    if (file.isEmpty()) {
	        //redirectAttributes.addFlashAttribute("message", "Please select a file to upload");

	        return "Please select a file to upload";
	    }

	    try {
	    	
	        // Get the file and save it somewhere
	        byte[] bytes = file.getBytes();
	        File dir = new File(UPLOADED_FOLDER + id);
	        if (dir.exists() && dir.isDirectory()) {
	        	//Path path = Paths.get(UPLOADED_FOLDER  +id+"//"+ file.getOriginalFilename());
			}else {
				dir.mkdir();
			}
	        
			Path path = Paths.get(UPLOADED_FOLDER  +id+"//"+ file.getOriginalFilename());
	        Files.write(path, bytes);

	        System.out.println("id="+id+",tip="+tip);
	        
	        /*redirectAttributes.addFlashAttribute("message",
	                "You successfully uploaded '" + file.getOriginalFilename() + "'");*/
	        Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
			String formattedDate = dateFormat.format(date);
	        Item item = new Item(id, path.toString(), tip, formattedDate);
	        iService.addItem(item);
	        
	        
	        

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return "You successfully uploaded '" + file.getOriginalFilename() + "'";
	}
	
	
	@GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }
	
}
