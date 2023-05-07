package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Odontologist;

public interface OdontologistDAO extends JpaRepository<Odontologist, Long> {}