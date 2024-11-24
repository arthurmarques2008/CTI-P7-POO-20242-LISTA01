package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int d1, m1, a1, d2, m2, a2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira data: ");
		
		System.out.println("Digite o dia: ");
		d1 = sc.nextInt();
		System.out.println("Digite a primeiro Mês: ");
		m1 = sc.nextInt();
		System.out.println("Digite a primeiro Ano: ");
		a1 = sc.nextInt();
		
		System.out.println("Digite a segunda data: ");
		
		System.out.println("Digite o dia:");
		d2 = sc.nextInt();
		System.out.println("Digite o segundo Mês:");
		m2 = sc.nextInt();
		System.out.println("digite o segundo ano: ");
		a2 = sc.nextInt();
		
		if (a1 > a2) {
			System.out.println("A maior data é " + d1 + "-" + m1 + "-" + a1);
		}
		else if(a2 > a1) {
			System.out.println("A maior data é " + d2 + "-" + m2 + "-" + a2);
		}
		else if(m1 > m2) {
			System.out.println("A maior data é " + d1 + "-" + m1 + "-" + a1);
		}
		else if(m2 > m1) {
			System.out.println("A maior data é " + d2 + "-" + m2 + "-" + a2);
		}
		else if(d1 > d2) {
			System.out.println("A maior data é " +"-"+ d1 + "-" + m1 + "-" + a1);
		}
		else if(d2 > d1) {
			System.out.println("A maior data é " + d2 + "-" + m2 + "-" + a2);
		}
		else {
			System.out.println("As datas são iguais !");
		}
	}
}
