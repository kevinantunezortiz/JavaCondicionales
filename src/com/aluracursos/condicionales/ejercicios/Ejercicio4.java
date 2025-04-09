package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numero1:");
        int numero1= teclado.nextInt();
        System.out.println("Escribe el numero2:");
        int numero2= teclado.nextInt();

        if(numero1==numero2){
            System.out.println("Numeros iguales");
        }
        else if(numero1>numero2){
            System.out.println("El numero mayor es: "+numero1);
        }else{
            System.out.println("El numero mayor es: "+ numero2);
        }
    }
}
