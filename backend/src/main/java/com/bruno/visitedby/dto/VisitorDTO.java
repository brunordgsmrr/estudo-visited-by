package com.bruno.visitedby.dto;

import org.springframework.beans.BeanUtils;

import com.bruno.visitedby.entities.Visitor;

public class VisitorDTO {

	private Long id;
	private String name;
	
	public VisitorDTO() {
		
	}
	
	public VisitorDTO(Visitor entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
