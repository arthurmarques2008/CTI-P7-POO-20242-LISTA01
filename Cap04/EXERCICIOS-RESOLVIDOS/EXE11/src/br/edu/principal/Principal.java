package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double hora_i, min_i, hora_f, min_f, hora_d, min_d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horário inicial: ");
		System.out.println("hora: ");
		hora_i = sc.nextDouble();
		
		System.out.println("Minutos: ");
		min_i = sc.nextDouble();
		
		System.out.println("Digite o horário final");
		System.out.println("Hora: ");
		hora_f = sc.nextDouble();
		
		System.out.println("Minutos:");
		min_f = sc.nextDouble();
		
		if (min_i > min_f) {
			min_f = min_f + 60;
			hora_f = hora_f - 1;
		}
		if(hora_i > hora_f) {
			hora_f = hora_f + 24;
		}
		min_d = min_f - min_i;
		hora_d = hora_f - hora_i;
		System.out.println("O jogo durou" + " " + hora_d + " Hora(s) e" + " " + min_d +" Minuto(s)");
	}

}
