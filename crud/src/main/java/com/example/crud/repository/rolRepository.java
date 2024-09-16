package com.example.crud.repository;

import com.example.crud.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface rolRepository extends JpaRepository<Rol, Long> {
}
