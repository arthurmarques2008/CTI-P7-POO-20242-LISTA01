package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double hora, h, m, conversao;
		hora = 4.30;
		h = Math.round(hora);
		m = hora - h;
		conversao = (h * 60) + (m * 100);
		System.out.println(conversao);

	}

}
