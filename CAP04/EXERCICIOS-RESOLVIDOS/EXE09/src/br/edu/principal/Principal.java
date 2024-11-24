package br.edu.principal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
   
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();

        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        String nomeMes = "";
        if (mes == 1) nomeMes = "janeiro";
        else if (mes == 2) nomeMes = "fevereiro";
        else if (mes == 3) nomeMes = "março";
        else if (mes == 4) nomeMes = "abril";
        else if (mes == 5) nomeMes = "maio";
        else if (mes == 6) nomeMes = "junho";
        else if (mes == 7) nomeMes = "julho";
        else if (mes == 8) nomeMes = "agosto";
        else if (mes == 9) nomeMes = "setembro";
        else if (mes == 10) nomeMes = "outubro";
        else if (mes == 11) nomeMes = "novembro";
        else if (mes == 12) nomeMes = "dezembro";
        else nomeMes = "Mês inválido";

        System.out.println(nomeMes);

        int hora = horaAtual.getHour();
        int minuto = horaAtual.getMinute();

        System.out.println("Hora Atual: " + hora + ":" + String.format("%02d", minuto));
    }
}

