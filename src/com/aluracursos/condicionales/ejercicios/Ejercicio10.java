package com.aluracursos.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigoSecreto=2023;
        System.out.println("Codigo de acceso:");
        int codigoAcceso = teclado.nextInt();
        System.out.println("Nivel de Permiso:");
        int nivelPermiso = teclado.nextInt();
        boolean codigosIguales= codigoSecreto==codigoAcceso;
        boolean nivelCorrecto = nivelPermiso>=1 && nivelPermiso<=3;
        if(codigosIguales && nivelCorrecto){
            System.out.println("Acceso Permitido");
        }else{
            System.out.println("Acceso Denegado: ");
            if(!codigosIguales){
                System.out.println("Motivo: El codigo no es igual");
            }
            if(!nivelCorrecto){
                System.out.println("Motivo: El nivel no es correcto");
            }
        }

    }
}
