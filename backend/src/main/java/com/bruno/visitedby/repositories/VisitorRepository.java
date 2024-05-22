package com.bruno.visitedby.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.visitedby.entities.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long>{

}
