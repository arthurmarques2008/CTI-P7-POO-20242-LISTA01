package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double i, num, qtde;
		num = 5;
		qtde = 0;
		
		for (i = 1;i <= num ; i++) {
			if (num % i == 0) {
				qtde = qtde + 1;
			}
		}
		if (qtde > 2) {
			System.out.println("Número não é primo");
		}
		else {
			System.out.println("Número Primo");
		}

	}

}