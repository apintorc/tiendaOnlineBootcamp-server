package com.example.jsbackend2.util;

public class Producto {
	private int idProducto;
	private int idCategoria;
	private String descripcion;
	private double precio;
	private int stock;
	public Producto() {
		super();
	}
	public Producto(int idProducto, int idCategoria, String descripcion, double precio, int stock) {
		super();
		this.idProducto = idProducto;
		this.idCategoria = idCategoria;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", idCategoria=" + idCategoria + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	
}
