package com.example.jsbackend2.util;

public class Localidad {
	private String codigoProvincia;
	private String codigoLocalidad;
	private String descripcion;
	public Localidad() {
		super();
	}
	public Localidad(String codigoProvincia, String codigoLocalidad, String descripcion) {
		super();
		this.codigoProvincia = codigoProvincia;
		this.codigoLocalidad = codigoLocalidad;
		this.descripcion = descripcion;
	}
	public String getCodigoProvincia() {
		return codigoProvincia;
	}
	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}
	public String getCodigoLocalidad() {
		return codigoLocalidad;
	}
	public void setCodigoLocalidad(String codigoLocalidad) {
		this.codigoLocalidad = codigoLocalidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Localidad [codigoProvincia=" + codigoProvincia + ", codigoLocalidad=" + codigoLocalidad
				+ ", descripcion=" + descripcion + "]";
	}
	
	
}
