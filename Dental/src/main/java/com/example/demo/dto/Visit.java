package com.example.demo.dto;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "visits")
public class Visit {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "odontologist_id")
	private Odontologist odontologist;
	@Column(name = "procedure_type")
	private String procedure;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime scheduled;
	private double price;

	// Constructors
	public Visit() {}

	public Visit(Long id, Client client, Odontologist odontologist, String procedure, LocalDateTime scheduled, double price) {
		this.id = id;
		this.client = client;
		this.odontologist = odontologist;
		this.procedure = procedure;
		this.scheduled = scheduled;
		this.price = price;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Client getClient() {
		return client;
	}

	public Odontologist getOdontologist() {
		return odontologist;
	}

	public String getProcedure() {
		return procedure;
	}

	public LocalDateTime getScheduled() {
		return scheduled;
	}

	public double getPrice() {
		return price;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setOdontologist(Odontologist odontologist) {
		this.odontologist = odontologist;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public void setScheduled(LocalDateTime scheduled) {
		this.scheduled = scheduled;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
