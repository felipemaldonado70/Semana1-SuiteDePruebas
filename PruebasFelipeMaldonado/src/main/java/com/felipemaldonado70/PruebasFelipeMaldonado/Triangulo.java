package com.felipemaldonado70.PruebasFelipeMaldonado;

public class Triangulo implements InterfazFuncional{
	
	@Override
	public double area(double lado1, double lado2) {
		// TODO Auto-generated method stub
		InterfazFuncional AreaT = (x , y) -> (x*y)/2;
		
		return AreaT.area(lado1, lado2);
	}
	
}
