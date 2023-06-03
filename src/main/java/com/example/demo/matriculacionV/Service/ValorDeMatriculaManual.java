package com.example.demo.matriculacionV.Service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
@Service("manual")
public class ValorDeMatriculaManual implements ValorDeMatricula{

	@Override
	public BigDecimal precioM(BigDecimal preciom) {
		
		return preciom.multiply(new BigDecimal(0.10));
		
		
	}

}
