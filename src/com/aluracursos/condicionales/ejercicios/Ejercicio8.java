package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el lado 1:");
        int lado1 = teclado.nextInt();
        System.out.println("Escribe el lado 2:");
        int lado2 = teclado.nextInt();
        System.out.println("Escribe el lado 3:");
        int lado3 = teclado.nextInt();


        if(lado1+lado2>lado3 && lado2+lado3>lado1 && lado1+lado3>lado2){
            System.out.println("Los lados pueden formar un triángulo");
        }else{
            System.out.println("El triángulo no se puede formar");
        }
    }
}
