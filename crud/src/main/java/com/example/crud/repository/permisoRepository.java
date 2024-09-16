package com.example.crud.repository;

import com.example.crud.model.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface permisoRepository extends JpaRepository<Permiso, Long> {
}
