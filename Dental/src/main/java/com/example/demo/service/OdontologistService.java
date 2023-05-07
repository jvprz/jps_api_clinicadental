package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OdontologistDAO;
import com.example.demo.dto.Odontologist;

@Service
public class OdontologistService {

	@Autowired
	OdontologistDAO odontologistDAO;
	
	// CRUD
	public List<Odontologist> listOdontologists() {
		return odontologistDAO.findAll();
	}
	
	public Odontologist saveOdontologist(Odontologist odontologist) {
		return odontologistDAO.save(odontologist);
	}
	
	public Odontologist odontologistById(Long id) {
		return odontologistDAO.findById(id).get();
	}
	
	public Odontologist updateOdontologist(Odontologist odontologist) {
		return odontologistDAO.save(odontologist);
	}
	
	public void deleteOdontologist(Long id) {
		odontologistDAO.deleteById(id);
	}
}
