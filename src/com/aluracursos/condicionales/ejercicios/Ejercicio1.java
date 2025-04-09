package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int numero = teclado.nextInt();
        if(numero%2==0){
            System.out.println("Número Par");
        }else{
            System.out.println("número Impar");
        }

    }
}
