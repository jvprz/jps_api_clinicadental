package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Visit;

public interface VisitDAO extends JpaRepository<Visit, Long> {}