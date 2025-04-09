package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el promedio del Alumno:");
        double promedio = teclado.nextDouble();
        if(promedio>=7){
            System.out.println("Alumno Aprobado");
        }else if(promedio>=5 && promedio<=6.9){
            System.out.println("Alumno en Recuperación");
        }else{
            System.out.println("Alumno reprobado");
        }
    }
}
