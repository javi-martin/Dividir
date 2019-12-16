package es.studium.Dividir;

import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) 
	{
		int denominador, numerador;
		double resultado;
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indicar el nuerador:");
		numerador = teclado.nextInt();
		System.out.println("Indicar el denominador:");
		denominador = teclado.nextInt();
		
		resultado = dividir(numerador, denominador);
		System.out.println("La division vale:" + resultado);
		
		teclado.close();
	}
	
	public static double dividir(int a, int b) 
	{
		double resultado;
		resultado = (double) a /(double) b;
		return(resultado);
	}

}
