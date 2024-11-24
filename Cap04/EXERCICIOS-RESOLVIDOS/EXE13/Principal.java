package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, imp = 0, aum = 0, novo_sal;
		int op;
		
		System.out.println("Menu de opções");
		System.out.println("1 - Imposto");
		System.out.println("2 - Novo salário");
		System.out.println("3 - Classificação");
		System.out.println("Digite a opção desejada: ");
		op = sc.nextInt();
		
		if (op == 1) {
			System.out.println("Digite seu salario: ");
			sal = sc.nextDouble();
			
			if (sal < 500) {
				imp = sal * 5/100;
			}
			if (sal >= 500 && sal <= 850) {
				imp = sal * 10/100;
			}
			if (sal > 850) {
				imp = sal * 15/100;
			}
			System.out.println(imp);
		}
		if (op == 2) {
			System.out.println("Digite seu salario: ");
			sal = sc.nextDouble();
			
			if (sal > 1500) {
				aum = 25;
			}
			if (sal >= 750 && sal <= 1500) {
				aum = 50;
			}
			if (sal >= 450 && sal < 750) {
				aum = 75;
			}
			if (sal < 450) {
				aum = 100;
			}
			novo_sal = sal + aum;
			System.out.println(novo_sal);
		}
		if(op == 3) {
			System.out.println("Digite seu salario: ");
			sal = sc.nextDouble();
			
			if (sal <= 700) {
				System.out.println("Mal Remunerado");
			}
			if (sal > 700) {
				System.out.println("Bem Remunerado");
			}
		}
		if (op < 1 || op > 3) {
			System.out.println("Opção inválida");
		}
	}

}
