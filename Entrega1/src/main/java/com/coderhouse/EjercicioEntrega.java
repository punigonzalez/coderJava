package com.coderhouse;

public class EjercicioEntrega {

	public static void main(String[] args) {
		float numero = (float) 9.145;
		
		int numeroEntero = (int) numero;
		byte numeroDecimal = (byte) ((numero - numeroEntero) * 100);
		
		System.out.println("Numero: " + numero );
		System.out.println("Parte entera: " + numeroEntero );
		System.out.println("Parte decimal: " + numeroDecimal );
		

	}

}
