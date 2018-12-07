package com.felipemaldonado70.PruebasFelipeMaldonado;

public class Cuadrado implements InterfazFuncional{
	
	
	@Override
	public double area(double lado1, double lado2) {
		// TODO Auto-generated method stub
		InterfazFuncional AreaC = (x , y) -> x*y;
		
		return AreaC.area(lado1, lado2);
	}
	
}
