package com.example.jsbackend2.util;

public class Usuario {
	public String user;
	public String password;
	public String role;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(String user, String password, String role) {
		super();
		this.user = user;
		this.password = password;
		this.role = role;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
