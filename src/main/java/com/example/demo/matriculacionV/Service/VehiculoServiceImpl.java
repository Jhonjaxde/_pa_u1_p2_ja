package com.example.demo.matriculacionV.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Vehiculo;
import com.example.demo.matriculacionV.Repository.VehiculoRepository;

@Service
public class VehiculoServiceImpl implements VehiculoService {
	@Autowired
	private VehiculoRepository vehiculorepository;

	@Override
	public void actualizar(String placa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crear(String placa) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub

	}

}
