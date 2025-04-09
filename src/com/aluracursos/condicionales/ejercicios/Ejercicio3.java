package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasenia = "123456";
        System.out.println("Escribe la contraseña para acceder: ");
        String intento = teclado.nextLine();
        if(contrasenia.equals(intento)){
            System.out.println("Acceso Permitido");
        }else{
            System.out.println("Acceso Denegado");
        }
    }
}
