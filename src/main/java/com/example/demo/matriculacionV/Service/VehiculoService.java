package com.example.demo.matriculacionV.Service;

import com.example.demo.Vehiculo;

public interface VehiculoService {
	
	
	public void crear(String placa);

	public Vehiculo buscar(String placa);

	public void actualizar(String placa);

	public void borrar(String placa);

}
