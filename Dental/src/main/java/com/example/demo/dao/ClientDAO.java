package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.qos.logback.core.net.server.Client;

public interface ClientDAO extends JpaRepository<Client, Long> {}