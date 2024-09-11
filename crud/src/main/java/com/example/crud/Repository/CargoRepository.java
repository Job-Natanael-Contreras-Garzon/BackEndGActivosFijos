package com.example.crud.Repository;

import com.example.crud.Models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo,Long> {
}
