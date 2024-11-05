package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num, i, f, a;
		num = 3.14;
		i = Math.round(num);
		f = num - i;
		a = Math.ceil(num);
		System.out.println(i);
		System.out.println(f);
		System.out.println(a);

	}

}
