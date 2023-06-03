package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matriculas {
	public LocalDate fechaDeMatricula;
	public BigDecimal valorDeMatricula;
	public Propietario dueño;
	public Vehiculo auto;
	
	
	
	
	@Override
	public String toString() {
		return "Matriculas [fechaDeMatricula=" + fechaDeMatricula + ", valorDeMatricula=" + valorDeMatricula
				+ ", dueño=" + dueño + ", auto=" + auto + "]";
	}
	public LocalDate getFechaDeMatricula() {
		return fechaDeMatricula;
	}
	public void setFechaDeMatricula(LocalDate fechaDeMatricula) {
		this.fechaDeMatricula = fechaDeMatricula;
	}
	public BigDecimal getValorDeMatricula() {
		return valorDeMatricula;
	}
	public void setValorDeMatricula(BigDecimal valorDeMatricula) {
		this.valorDeMatricula = valorDeMatricula;
	}
	public Propietario getDueño() {
		return dueño;
	}
	public void setDueño(Propietario dueño) {
		this.dueño = dueño;
	}
	public Vehiculo getAuto() {
		return auto;
	}
	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}
	
	
}
