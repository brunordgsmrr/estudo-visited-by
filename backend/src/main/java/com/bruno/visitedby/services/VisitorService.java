package com.bruno.visitedby.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.visitedby.dto.VisitorDTO;
import com.bruno.visitedby.entities.Visitor;
import com.bruno.visitedby.repositories.VisitorRepository;

@Service
public class VisitorService {
	
	@Autowired
	private VisitorRepository visitorRepository;
	
	public List<VisitorDTO> findAll(){
		
		List<Visitor> result = visitorRepository.findAll();
		
		return result.stream().map(x -> new VisitorDTO(x)).toList();
	}

}
