package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el valor del Prestamo");
        double prestamo = teclado.nextDouble();
        if(prestamo>=1000 && prestamo<=5000){
            System.out.println("El valor del prestamo "+prestamo+" es valido");
        }else{
            System.out.println("El valor del prestamo "+prestamo+" no esta dentro del intervalo permitido para el prestamo");
        }
        teclado.close();
    }
}
