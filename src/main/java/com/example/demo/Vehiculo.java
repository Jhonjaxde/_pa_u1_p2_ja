package com.example.demo;

import java.math.BigDecimal;

public class Vehiculo {
	
	public String marca;
	public String placa;
	public String modelo;
	public BigDecimal precio;
	public String Tipo;
	
	
	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", precio=" + precio
				+ ", Tipo=" + Tipo + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	

}
