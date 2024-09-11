package com.example.crud.Repository;

import com.example.crud.Models.Cargo;
import com.example.crud.Models.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisosRepository extends JpaRepository<Permisos,Long> {
}
