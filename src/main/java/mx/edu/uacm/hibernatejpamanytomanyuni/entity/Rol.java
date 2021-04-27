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
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Permiso> permiso = new ArrayList<>();

	private String nombre;


	public Rol() {

	}

	public Rol(String nombre) {
	this.nombre = nombre;

	}

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public List<Permiso> getPermiso() {
	return permiso;
	}

	public void setPermiso(List<Permiso> permiso) {
	this.permiso = permiso;
	}

	public String getNombre() {
	return nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

}

