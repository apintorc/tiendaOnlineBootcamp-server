package com.example.jsbackend2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.jsbackend2.util.Categoria;
import com.example.jsbackend2.util.Localidad;
import com.example.jsbackend2.util.Producto;
import com.example.jsbackend2.util.Provincia;
import com.example.jsbackend2.util.Usuario;

@SpringBootApplication
public class Jsbackend2Application {

	public static void main(String[] args) {
		SpringApplication.run(Jsbackend2Application.class, args);
	}
	
	@Bean
	public List<Provincia> getProvincias() {
		List<Provincia> provincias = new ArrayList<Provincia>();
		Provincia p1 = new Provincia("28", "Madrid");
		Provincia p2 = new Provincia("46", "Valencia");
		Provincia p3 = new Provincia("13", "Ciudad Real");
		Provincia p4 = new Provincia("02", "Barcelona");
		Provincia p5 = new Provincia("03", "Alicante");
		provincias.add(p1);
		provincias.add(p2);
		provincias.add(p3);
		provincias.add(p4);
		provincias.add(p5);
		return provincias;
	}
	
	@Bean
	public List<Localidad> getLocalidades() {
		List<Localidad> localidades = new ArrayList<Localidad>();
		Localidad l1 = new Localidad("28", "28300", "Pozuelo");
		Localidad l2 = new Localidad("28", "28400", "Alcobendas");
		Localidad l3 = new Localidad("46", "46300", "Gandia");
		Localidad l4 = new Localidad("46", "46400", "Cullera");
		Localidad l5 = new Localidad("13", "13300", "Manzanares");
		Localidad l6 = new Localidad("13", "13400", "Membrilla");
		Localidad l7 = new Localidad("02", "02300", "Mataró");
		Localidad l8 = new Localidad("02", "02400", "Granoller");
		Localidad l9 = new Localidad("03", "03300", "Calpe");
		Localidad l10 = new Localidad("03", "03400", "Benidorm");
		localidades.add(l1);
		localidades.add(l2);
		localidades.add(l3);
		localidades.add(l4);
		localidades.add(l5);
		localidades.add(l6);
		localidades.add(l7);
		localidades.add(l8);
		localidades.add(l9);
		localidades.add(l10);
		return localidades;
	}
	
	@Bean
	public List<Categoria> getCategorias() {
		Categoria c1 = new Categoria(1, "moviles");
		Categoria c2 = new Categoria(2, "electronica");
		Categoria c3 = new Categoria(3, "informatica");
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(c1);
		categorias.add(c2);
		categorias.add(c3);
		return categorias;
	}
	
	@Bean
	public List<Producto> getProductos() {
		Producto p1 = new Producto(1, 1, "Samsung", 800, 200);
		Producto p2 = new Producto(2, 1, "Xiaomi", 700, 100);
		Producto p3 = new Producto(3, 2, "Television", 800, 200);
		Producto p4 = new Producto(4, 2, "Lavadora", 700, 100);
		Producto p5 = new Producto(5, 3, "Portatil", 500, 350);
		Producto p6 = new Producto(6, 3, "Tablet", 200, 160);
		
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		productos.add(p6);
		
		return productos;
	}
	
	@Bean
	public List<Usuario>getUsuarios(){
		Usuario u1 = new Usuario("Cesar","123","USER");
		Usuario u2 = new Usuario("Admin","123","ADMIN");
		Usuario u3 = new Usuario("Ana","123","USER1");
		List<Usuario>usuarios = new ArrayList<Usuario>();
		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);
		return usuarios;
	}
}
