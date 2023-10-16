package com.example.jsbackend2.controller;

import java.util.Iterator;
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

import com.example.jsbackend2.util.Categoria;
import com.example.jsbackend2.util.Compra;
import com.example.jsbackend2.util.Item;
import com.example.jsbackend2.util.Localidad;
import com.example.jsbackend2.util.Producto;
import com.example.jsbackend2.util.Provincia;
import com.example.jsbackend2.util.Usuario;

@RestController
@RequestMapping("/api/tiendaonline")
@CrossOrigin
public class MiControlador2 {
	@Autowired
	List<Categoria> categorias;
	@Autowired
	List<Producto> productos;
	@Autowired
	List<Usuario> usuarios;
	
	@GetMapping("/categorias")
	public ResponseEntity<List<Categoria>> getCategoria() {
		return ResponseEntity.ok(categorias);
	}
	
	@GetMapping("/productos/{idCategoria}")
	public ResponseEntity<List<Producto>> getProductosByCategoria(@PathVariable("idCategoria") int idCategoria) {
		return ResponseEntity.ok(productos.stream().filter(p -> p.getIdCategoria() == idCategoria).toList());
	}
	
	@GetMapping("/login/{usuario}/{password}")
	public ResponseEntity<Usuario> isLogado(@PathVariable("usuario") String usuario,
			@PathVariable("password") String password) {
		for (Usuario u : usuarios) {
			if (u.getUser().equals(usuario) && u.getPassword().equals(password)) {
				return ResponseEntity.ok(u);
			}
		}
		return null;
	}
	
	@PostMapping("/comprar")
	public ResponseEntity<Integer> comprar(@RequestBody Compra compra) {
		//System.out.println(compra);
		System.out.println(compra.getUser());
		double factura = 0;
		for (Item item : compra.getItems()) {
			System.out.println(item);
			factura += item.getPrecio() * item.getCantidad();
		}
		System.out.println("Total: " + factura);
		return ResponseEntity.ok(0);
	}
	
	@GetMapping("/{idCategoria}")
	public ResponseEntity<Categoria>getCategoriaById(@PathVariable("idCategoria") int idCategoria){
		for(Categoria categoria:categorias) {
			if(categoria.getIdCategoria() == idCategoria) {
				return ResponseEntity.ok(categoria);
			}
		}
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public ResponseEntity<Integer>addCategoria(@RequestBody Categoria categoria){
		categorias.add(categoria);
		return ResponseEntity.ok(0);
	}

}
