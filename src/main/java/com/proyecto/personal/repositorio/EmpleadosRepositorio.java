package com.proyecto.personal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.personal.model.Empleados;

@Repository
public interface EmpleadosRepositorio extends JpaRepository<Empleados, Long>{

}
