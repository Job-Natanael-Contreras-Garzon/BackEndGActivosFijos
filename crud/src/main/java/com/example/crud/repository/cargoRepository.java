package com.example.crud.repository;

import com.example.crud.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cargoRepository extends JpaRepository<Cargo, Long> {

}
