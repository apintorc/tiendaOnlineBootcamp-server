package com.example.jsbackend2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsbackend2.util.Cliente;
import com.example.jsbackend2.util.Localidad;
import com.example.jsbackend2.util.Provincia;

@RestController
@RequestMapping("/api/hacienda")
@CrossOrigin
public class MiControlador {
	@Autowired
	List<Localidad> localidades;
	
	@Autowired
	List<Provincia> provincias;
	
	@GetMapping("/provincias")
	public ResponseEntity<List<Provincia>> getProvincias() {
		return ResponseEntity.ok(provincias);
	}
	
	@GetMapping("/localidades/{codigoProvincia}")
	public ResponseEntity<List<Localidad>> getLocalidadByProvincia(@PathVariable("codigoProvincia") String codigoProvincia) {
		return ResponseEntity.ok(localidades.stream().filter(l -> l.getCodigoProvincia().equals(codigoProvincia)).toList());
	}
	
	@PostMapping
	public ResponseEntity<Integer> addCliente(@RequestBody Cliente cliente) {
		System.out.println(cliente);
		return ResponseEntity.ok(0);
	}
}
