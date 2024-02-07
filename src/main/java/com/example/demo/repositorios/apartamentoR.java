package com.example.demo.repositorios;

import com.example.demo.modelos.apartamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface apartamentoR extends JpaRepository<apartamento,Long> {
}
