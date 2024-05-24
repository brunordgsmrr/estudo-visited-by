package com.bruno.visitedby.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.visitedby.dto.VisitorDTO;
import com.bruno.visitedby.entities.Visitor;
import com.bruno.visitedby.services.VisitorService;

@RestController
@RequestMapping("/")
public class VisitorController {

	@Autowired
	private VisitorService visitorService;
	
	@GetMapping("/all")
	public List<VisitorDTO> findAll(){
		return visitorService.findAll();
	}
	
	@PostMapping("/add")
	public boolean addVisitor(@RequestBody Visitor visitor) {
		VisitorDTO newVisitor = new VisitorDTO(visitor);
		visitorService.addVisitor(newVisitor);
		return true;
	}
}
