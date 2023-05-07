package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VisitDAO;
import com.example.demo.dto.Visit;

@Service
public class VisitService {

	@Autowired
	VisitDAO visitDAO;
	
	// CRUD
	public List<Visit> listVisits() {
		return visitDAO.findAll();
	}
	
	public Visit saveVisit(Visit visit) {
		return visitDAO.save(visit);
	}
	
	public Visit visitById(Long id) {
		return visitDAO.findById(id).get();
	}
	
	public List<Visit> listVisitsByClientId(Long clientId) {
		return visitDAO.findVisitsByClientId(clientId);
	}
	
	public List<Visit> listVisitsByOdontologistId(Long odontologistId) {
		return visitDAO.findVisitsByOdontologistId(odontologistId);
	}
	
	public Visit updateVisit(Visit visit) {
		return visitDAO.save(visit);
	}
	
	public void deleteVisit(Long id) {
		visitDAO.deleteById(id);
	}
}
