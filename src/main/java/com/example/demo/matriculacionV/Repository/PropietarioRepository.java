package com.example.demo.matriculacionV.Repository;

import com.example.demo.Propietario;


public interface PropietarioRepository {
	public void insertar(String placa);
	public Propietario seleccionar(Propietario pro);
	public void actualizar(String placa);
	public void eliminar(String placa);
}
