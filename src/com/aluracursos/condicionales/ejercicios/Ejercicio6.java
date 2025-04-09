package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana en minúsculas:");
        String dia = teclado.nextLine();
        String salida = dia.substring(0,1).toUpperCase()+dia.substring(1).toLowerCase();
        switch (dia){
            case "lunes","martes","miercoles","jueves","viernes":
                System.out.println(salida+" es un dia habil");
                break;
            case "sabado","domingo":
                System.out.println(salida+" no es un dia habil");
                break;
            default:
                System.out.println("dia no valido");
                break;
        }
    }
}
