package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Visit;
import com.example.demo.service.VisitService;

@RestController
@RequestMapping("/api")
public class VisitController {

	@Autowired
	VisitService visitService;
	
	@GetMapping("/visit")
	public List<Visit> listVisits() {
		return visitService.listVisits();
	}
	
	@GetMapping("/visit/{id}")
	public Visit visitById(@PathVariable(name = "id") Long id) {
		return visitService.visitById(id);
	}
	
	@GetMapping("/visit/client/{clientId}")
	public List<Visit> listVisitsByClientId(@PathVariable(name = "clientId") Long clientId) {
		return visitService.listVisitsByClientId(clientId);
	}
	
	@GetMapping("/visit/odontologist/{odontologistId}")
	public List<Visit> listVisitsByOdontologistId(@PathVariable(name = "odontologistId") Long odontologistId) {
		return visitService.listVisitsByOdontologistId(odontologistId);
	}
	
	@PostMapping("/visit")
	public Visit saveVisit(@RequestBody Visit visit) {
		return visitService.saveVisit(visit);
	}
	
	@PutMapping("/visits/{id}")
	public Visit updateVisit(@PathVariable(name = "id") Long id, @RequestBody Visit visit) {
		Visit selectedVisit = new Visit(id, visit.getClient(), visit.getOdontologist(), visit.getProcedure(), visit.getScheduled(), visit.getPrice());
		return visitService.updateVisit(selectedVisit);
	}
	
	@DeleteMapping("/visits/{id}")
	public void deleteVisit(@PathVariable(name = "id") Long id) {
		visitService.deleteVisit(id);
	}
}
