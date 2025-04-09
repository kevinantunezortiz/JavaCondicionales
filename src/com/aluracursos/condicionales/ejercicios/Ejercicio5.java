package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el monto");
        double monto = teclado.nextDouble();
        if(monto>=100){
            System.out.println("Se aplico un descuento del 10%");
            System.out.println("Nuevo valor: $"+monto*.90);
        }else{
            System.out.println("No se aplico descuento");
            System.out.println("El monto es: $"+monto);
        }
    }
}
