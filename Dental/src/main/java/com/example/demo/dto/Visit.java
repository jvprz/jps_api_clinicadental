package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "odontologists")
public class Visit {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dni;
	@Column(name = "name_surname")
	private String names;

		private String phone_number;

		private String email;

		private String speciality;

		private int medical_license_no;

		@OneToMany(mappedBy = "odontologist")
		private List<Visit> visit;

}
