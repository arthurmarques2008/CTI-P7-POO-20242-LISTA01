package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, raiz;
		System.out.println("Digite um número (Digite 0 para fechar): ");
		num = sc.nextDouble();
		while(num > 0)
		{
			quad = num * num;
			cubo = num *num *num;
			raiz = Math.sqrt(num);
			
			System.out.println("Número: "+ num);
			System.out.println("Quadrado: " + quad);
			System.out.println("Cubo: " + cubo);
			System.out.println("Raiz quadrada: " + raiz);
			
			System.out.println("Digite um número (Digite 0 para fechar): ");
			num = sc.nextDouble();
		}
		

	}

}