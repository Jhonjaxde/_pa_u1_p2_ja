package com.example.demo.matriculacionV.Service;



import com.example.demo.Matriculas;
import com.example.demo.Propietario;

public interface MatriculaService {
	
	public void crear(String placa);
	public Matriculas buscar(String placa);
	public void actualizar(String placa);
	public void borrar(String placa);
	
	public Matriculas realizar(Propietario pro , String vehiculo );
	
	
	

}
