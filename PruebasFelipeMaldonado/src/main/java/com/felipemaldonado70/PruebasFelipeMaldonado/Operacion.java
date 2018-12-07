package com.felipemaldonado70.PruebasFelipeMaldonado;


import java.util.List;

public class Operacion {
	
		
	public void filtrar(List<String> lista)
	{
				
		lista.stream().filter(x -> x.startsWith("M")).forEach(x -> System.out.println(x));
		
	}
	
	public void ordenar(List<String> lista)
	{
				
		lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(x -> System.out.println(x));
		
	}
	
	public void calcularIncremento(List<String> lista)
	{
				
		lista.stream().map(x -> Integer.parseInt(x) + 2500).forEach(x -> System.out.println(x));
		
	}
	
	
}
