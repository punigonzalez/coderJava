package com.coderhouse;

public class Persona {
	public String nombre;
    public String apellido;
    
    
    @Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido  +"]";
	}

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
    
    
    
    
    
    
    
    
    
    
    
    
}


