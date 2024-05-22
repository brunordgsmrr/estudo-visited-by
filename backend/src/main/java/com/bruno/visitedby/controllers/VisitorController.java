package com.bruno.visitedby.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.visitedby.dto.VisitorDTO;
import com.bruno.visitedby.services.VisitorService;

@RestController
@RequestMapping("/all")
public class VisitorController {

	@Autowired
	private VisitorService visitorService;
	
	@GetMapping
	public List<VisitorDTO> findAll(){
		return visitorService.findAll();
	}
}
