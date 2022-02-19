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
		float subtração = subtracao(a,b);
		float multiplicação = multiplicação(a,b);
		float divisão = divisão(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("sub "  + subtração);
		System.out.println("mult " + multiplicação);
		System.out.println("div " + divisão);
	}
		
	public static float soma (float a, float b) {
		return a + b;
	}
	
	public static float subtracao (float a, float b) {
		return a - b;
	}
	public static float multiplicação (float a, float b) {
		return a * b;
	}
	public static float divisão (float a, float b) {
		return a / b;
	}
}

