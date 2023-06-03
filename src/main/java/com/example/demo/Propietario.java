package com.example.demo;

import java.time.LocalDate;

public class Propietario {
	
	public String nombre, apellido;
	public int identificacion;
	public LocalDate fechaDeNacimiento;

	
	
	@Override
	public String toString() {
		return "Propietarios [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
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
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
