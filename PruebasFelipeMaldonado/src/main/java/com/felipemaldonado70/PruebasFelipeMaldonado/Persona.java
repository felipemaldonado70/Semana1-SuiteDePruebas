package com.felipemaldonado70.PruebasFelipeMaldonado;

import java.util.Optional;

public class Persona {
	
	String nombre;
	String apellido;
	int id;
	String telefono;
	String direccion;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void  direccionVacia(String Direccion ) {
		
		Optional<String> op = Optional.ofNullable(Direccion);		
		String x =  op.orElse("calle falsa 123 es predeterminada para evitar el null");
		System.out.println(x);
	}
	
	
	public void validarTelefono(String Telefono)
	{
		Optional<String> op = Optional.ofNullable(Telefono);		
		if (op.isPresent()) {
			
			System.out.println("Registro de telefono completado");
			
		}else {
			
			System.out.println("Debe ingresar un numero de telefono");
			
		}
			
			
	
	};
	
}
