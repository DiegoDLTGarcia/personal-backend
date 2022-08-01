package com.proyecto.personal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.personal.model.Empleados;
import com.proyecto.personal.repositorio.EmpleadosRepositorio;


@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {

	@Autowired
	private EmpleadosRepositorio repositorio;

	@GetMapping("/empleados")
	public List<Empleados> listarTodosLosEmpleados() {
		return repositorio.findAll();
	}

}