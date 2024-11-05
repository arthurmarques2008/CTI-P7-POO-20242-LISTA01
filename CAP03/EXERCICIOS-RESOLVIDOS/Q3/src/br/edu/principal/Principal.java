package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double n1 = 4, n2 = 7.9, n3 = 10, peso1 = 1, peso2 = 2, peso3 = 3, media;
		media = (n1*peso1 + n2*peso2 + n3*peso3)/(peso1+peso2+peso3);
		System.out.println("Sua média final é :" + media);
	}

}
