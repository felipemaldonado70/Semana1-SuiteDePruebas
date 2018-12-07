package com.felipemaldonado70.PruebasFelipeMaldonado;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.Test;

public class PruebasUnitarias {
	
	Cuadrado c1 = new Cuadrado();
	Triangulo t1 = new Triangulo();
	Persona Felipe = new Persona();

	@Test
	public void  direccionVacia() {
		
		Felipe.setDireccion(null);
		Felipe.direccionVacia(Felipe.getDireccion());
		
		assertNull(Felipe.getDireccion());
		
	}
	
	@Test
	public void validarInicializacion() {
	    
		Felipe.setTelefono(null);
		Felipe.validarTelefono(Felipe.getTelefono());
		
	}
	
	@Test
	public void ACesperado() {
		double AC;
		double AreaEsperada = 7;
		
		AC = c1.area(2, 3);
		
		assertEquals(AreaEsperada, AC);
		
	}
	
	
	@Test
	public void ATesperado() {
		double AT;
		double AreaEsperada = 7;
		
		AT = t1.area(2, 3);
		
		assertEquals(AreaEsperada, AT);
		
	}
	
		

}
