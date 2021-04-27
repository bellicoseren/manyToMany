package mx.edu.uacm.hibernatejpamanytomanyuni.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Rol> rol = new ArrayList<>();

	private String correo;
	private String contrasena;

	public String getCorreo() {
	return correo;
	}

	public void setCorreo(String correo) {
	this.correo = correo;
	}

	public String getContrasena() {
	return contrasena;
	}

	public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
	}

	public void setRol(List<Rol> rol) {
	this.rol = rol;
	}

	public Usuario() {

	}

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public List<Rol> getRol() {
	return rol;
	}

	public void setAddresses(List<Rol> rol) {
	this.rol = rol;
	}




}

