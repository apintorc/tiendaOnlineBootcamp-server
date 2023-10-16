package com.example.jsbackend2.util;

public class Item {
	private int idProducto;

	private String descripcion;

	private double precio;

	private int cantidad;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(int idProducto, String descripcion, double precio, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Item [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
				+ cantidad + "]";
	}
	
	
}
