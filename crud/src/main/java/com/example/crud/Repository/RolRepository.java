package com.example.crud.Repository;

import com.example.crud.Models.Cargo;
import com.example.crud.Models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
