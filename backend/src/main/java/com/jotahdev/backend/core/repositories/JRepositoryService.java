package com.jotahdev.backend.core.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jotahdev.backend.core.models.JService;

public interface JRepositoryService extends JpaRepository<JService, UUID> {
    
}
