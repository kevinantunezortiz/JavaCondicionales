package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu edad:");
        int edad = teclado.nextInt();
        System.out.println("Escribe tu peso en kg:");
        double peso = teclado.nextDouble();
        String motivo = "";
        boolean compatible = false;
        if(edad>=18 && edad<=65){
            if(peso>50){
                compatible=true;
                System.out.println("Puedes donar :) <3");
            }else{
                motivo="Debes de pesar más de 50kg ";
            }
        }else{
            motivo="Debes de tener de 18 a 65 años";
        }
        if(!compatible){
            System.out.println("El donante no es compatible");
            System.out.println("Motivo: "+motivo);
        }
    }
}
