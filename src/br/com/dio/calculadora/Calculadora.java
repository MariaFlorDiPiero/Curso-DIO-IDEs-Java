package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		float a, b;
				
		System.out.println("Digite o primeiro valor: ");	
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
				
		float soma = soma(a,b);
		float subtra��o = subtracao(a,b);
		float multiplica��o = multiplica��o(a,b);
		float divis�o = divis�o(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("sub "  + subtra��o);
		System.out.println("mult " + multiplica��o);
		System.out.println("div " + divis�o);
	}
		
	public static float soma (float a, float b) {
		return a + b;
	}
	
	public static float subtracao (float a, float b) {
		return a - b;
	}
	public static float multiplica��o (float a, float b) {
		return a * b;
	}
	public static float divis�o (float a, float b) {
		return a / b;
	}
}

