package com.example.jsbackend2.util;

public class Provincia {
	private String codigoProvincia;
	private String descripcion;
	public Provincia() {
		super();
	}
	public Provincia(String codigo, String descripcion) {
		super();
		this.codigoProvincia = codigo;
		this.descripcion = descripcion;
	}
	public String getCodigoProvincia() {
		return codigoProvincia;
	}
	public void setCodigoProvincia(String codigo) {
		this.codigoProvincia = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Provincia [codigoProvincia=" + codigoProvincia + ", descripcion=" + descripcion + "]";
	}
	
	
}
