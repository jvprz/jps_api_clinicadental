package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "odontologists")
public class Odontologist {
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
	private String speciality;
	private int medical_license_no;
	@OneToMany(mappedBy = "odontologist")
	private List<Visit> visit;
	
	// Constructors
	public Odontologist() {}
	
	public Odontologist(Long id, String dni, String names, String phone, String email, String speciality, int medical_license_no) {
		this.id = id;
		this.dni = dni;
		this.names = names;
		this.phone = phone;
		this.email = email;
		this.speciality = speciality;
		this.medical_license_no = medical_license_no;
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

	public String getSpeciality() {
		return speciality;
	}

	public int getMedical_license_no() {
		return medical_license_no;
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

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public void setMedical_license_no(int medical_license_no) {
		this.medical_license_no = medical_license_no;
	}

	public void setVisit(List<Visit> visit) {
		this.visit = visit;
	}
}
