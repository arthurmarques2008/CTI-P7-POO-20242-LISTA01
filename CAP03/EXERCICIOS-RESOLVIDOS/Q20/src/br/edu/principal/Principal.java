package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int ang, alt;
		double escada, radiano;
		ang = 160;
		alt = 8;
		
		radiano = ang * 3.14 / 180;
		
		escada = alt / Math.sin(radiano);
		System.out.println(escada);
	}
}
