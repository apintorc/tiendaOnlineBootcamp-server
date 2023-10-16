package com.example.jsbackend2.util;

public class Cliente {
	private String nif;
	private String codigoProvincia;
	private String codigoLocalidad;
	private String nombre;
	public Cliente() {
		super();
	}
	public Cliente(String nif, String codigoProvincia, String codigoLocalidad, String nombre) {
		super();
		this.nif = nif;
		this.codigoProvincia = codigoProvincia;
		this.codigoLocalidad = codigoLocalidad;
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", codigoProvincia=" + codigoProvincia + ", codigoLocalidad=" + codigoLocalidad
				+ ", nombre=" + nombre + "]";
	}
	
	
}
