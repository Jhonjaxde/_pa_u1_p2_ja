package com.example.demo.matriculacionV.Service;

import com.example.demo.Propietario;

public interface PropietarioSevice {
	public void crear(String placa);

	public Propietario buscar(String placa);

	public void actualizar(String placa);

	public void borrar(String placa);


}
