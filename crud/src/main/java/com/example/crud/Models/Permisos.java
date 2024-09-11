package com.example.crud.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table
@Entity
public class Permisos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPermiso;
    @Column(nullable = false)
    private String nombre;
}
