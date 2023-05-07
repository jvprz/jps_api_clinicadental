package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Visit;

public interface VisitDAO extends JpaRepository<Visit, Long> {
	
	public List<Visit> findVisitsByClientId(Long clientId);
	public List<Visit> findVisitsByOdontologistId(Long odontologistId);
}