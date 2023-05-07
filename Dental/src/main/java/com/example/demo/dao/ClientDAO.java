package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Client;

public interface ClientDAO extends JpaRepository<Client, Long> {}