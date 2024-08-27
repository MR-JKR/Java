package com.deparment.college;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/ece")

public class Controller {



	@Autowired
	Repository repo; 
			
	@PostMapping("/savedata")
	public String save(@RequestBody StudModel d)
	{
		repo.save(d);
		return "insert success";
	}

	@GetMapping("/getdata")
	List<StudModel> getdata(){
		return repo.findAll();
	}
    
}
