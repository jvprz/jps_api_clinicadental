package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Odontologist;
import com.example.demo.dto.Visit;
import com.example.demo.service.OdontologistService;
import com.example.demo.service.VisitService;

@RestController
@RequestMapping("/api")
public class OdontologistController {
	
	// Services
	@Autowired
	OdontologistService odontologistService;
	@Autowired
	VisitService visitService;
	
	@GetMapping("/odontologist")
	public List<Odontologist> listOdontologists() {
		return odontologistService.listOdontologists();
	}
	
	@GetMapping("/odontologist/{id}")
	public Odontologist odontologistById(@PathVariable(name = "id") Long id) {
		return odontologistService.odontologistById(id);
	}
	
	// Get list of visits for odontologist
	@GetMapping("/odontologist/{odontologistId}/visit")
	public List<Visit> listVisits(@PathVariable(name = "odontologistId") Long odontologistId) {
		return visitService.listVisitsByOdontologistId(odontologistId);
	}
	
	@PostMapping("/odontologist")
	public Odontologist saveOdontologist(@RequestBody Odontologist odontologist) {
		return odontologistService.saveOdontologist(odontologist);
	}
	
	@PutMapping("/odontologist/{id}")
	public Odontologist updateOdontologist(@PathVariable(name = "id") Long id, @RequestBody Odontologist odontologist) {
		Odontologist selectedOdontologist = new Odontologist(id, odontologist.getDni(), odontologist.getNames(), odontologist.getPhone(), odontologist.getEmail(), odontologist.getSpeciality(), odontologist.getMedical_license_no());
		return odontologistService.updateOdontologist(selectedOdontologist);
	}

	@DeleteMapping("/odontologist/{id}")
	public void deleteOdontologist(@PathVariable(name = "id") Long id) {
		odontologistService.deleteOdontologist(id);
	}
}
