package com.example.demo.repositorios;

import com.example.demo.modelos.mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface mantenimientoR extends JpaRepository<mantenimiento,Long> {
}
