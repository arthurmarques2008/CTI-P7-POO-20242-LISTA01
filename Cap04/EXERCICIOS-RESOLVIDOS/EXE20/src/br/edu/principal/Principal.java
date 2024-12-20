package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod_prod, cod_pais;
        double peso_quilos, peso_gramas, pre_total, imposto = 0, valor_total, pre_grama = 0;


        System.out.println("Digite o código do produto:");
        cod_prod = sc.nextInt();

        System.out.println("Digite o peso em quilos:");
        peso_quilos = sc.nextDouble();

        System.out.println("Digite o código do país:");
        cod_pais = sc.nextInt();


        peso_gramas = peso_quilos * 1000;
        System.out.println("Peso em gramas: " + peso_gramas);


        if (cod_prod >= 1 && cod_prod <= 4) {
            pre_grama = 10;
        } 
        else if (cod_prod >= 5 && cod_prod <= 7) {
            pre_grama = 25;
        } 
        else if (cod_prod >= 8 && cod_prod <= 10) {
            pre_grama = 35;
        } 
        else {
            System.out.println("Código do produto inválido.");
        }

        pre_total = peso_gramas * pre_grama;
        System.out.println("Preço total sem imposto: " + pre_total);
        
        if (cod_pais == 1) {
            imposto = 0;
        } 
        else if (cod_pais == 2) {
            imposto = pre_total * 0.15; 
        } 
        else if (cod_pais == 3) {
            imposto = pre_total * 0.25; 
        } 
        else {
            System.out.println("Código do país inválido.");
        }

        System.out.println("Imposto: " + imposto);

        valor_total = pre_total + imposto;
        System.out.println("Valor total com imposto: " + valor_total);
    }
}

