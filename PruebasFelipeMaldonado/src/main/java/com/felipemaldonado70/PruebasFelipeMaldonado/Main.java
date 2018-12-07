package com.felipemaldonado70.PruebasFelipeMaldonado;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	
    	//Clase optional
    	
    	Persona Felipe = new Persona();
    	
    	Felipe.setDireccion(null);
    	Felipe.setTelefono(null);
    	
    	Felipe.direccionVacia(Felipe.getDireccion());
    	Felipe.validarTelefono(Felipe.getTelefono());
    	
    	
    	double AT, AC;
    	
    	
    	Cuadrado c1 = new Cuadrado();
    	Triangulo t1 = new Triangulo();
    	
    	
    	AC = c1.area(2.5, 3.0);
    	AT = t1.area(5, 6);
    	   	
    	System.out.println( "El area del triangulo es: " + AT);
        System.out.println( "El area del cuadrado es: " + AC);
    }
}
