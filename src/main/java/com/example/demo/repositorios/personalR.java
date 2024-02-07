package com.example.demo.repositorios;

import com.example.demo.modelos.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personalR extends JpaRepository<usuarios,Long> {
}
