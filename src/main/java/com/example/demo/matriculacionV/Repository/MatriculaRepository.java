package com.example.demo.matriculacionV.Repository;

import com.example.demo.Matriculas;
import com.example.demo.Vehiculo;

public interface MatriculaRepository {
	public void insertar(String placa);
	public Vehiculo seleccionar(String placa);
	public void actualizar(String placa);
	public void eliminar(String placa);
}
