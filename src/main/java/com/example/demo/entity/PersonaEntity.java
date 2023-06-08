package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class PersonaEntity{
	
@Id
private String idPersona;

private String nombre;

private String apellido;

public String getIdPersona() {
	return idPersona;
}
public void setIdPersona(String idPersona) {
	this.idPersona = idPersona;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}


	
}
