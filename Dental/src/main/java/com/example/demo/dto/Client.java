package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dni;
	@Column(name = "name_surname")
	private String names;
	@Column(name = "phone_number")
	private String phone;
	private String email;
	@OneToMany(mappedBy = "client")
	private List<Visit> visit;
	
	// Constructors
	public Client() {}

	public Client(Long id, String dni, String names, String phone, String email) {
		this.id = id;
		this.dni = dni;
		this.names = names;
		this.phone = phone;
		this.email = email;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getNames() {
		return names;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Visit")
	public List<Visit> getVisit() {
		return visit;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setVisit(List<Visit> visit) {
		this.visit = visit;
	}
}
