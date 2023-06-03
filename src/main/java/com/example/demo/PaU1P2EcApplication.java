package com.example.demo;

import java.sql.SQLOutput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacionV.Service.MatriculaService;
import com.example.demo.matriculacionV.Service.PropietarioSevice;
import com.example.demo.matriculacionV.Service.VehiculoService;

@SpringBootApplication
public class PaU1P2EcApplication implements CommandLineRunner{
	
	@Autowired
	private VehiculoService service;
	@Autowired
	@Qualifier("manual")
	private MatriculaService matriculaService;
	@Autowired
	private PropietarioSevice propietarioSevice;

	public static void main(String[] args) {
		SpringApplication.run(PaU1P2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMarca("buena");
		vehiculo.setPlaca("ABCE");
		
		System.out.println();
		
		
	}

}
