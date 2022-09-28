/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursividad;

import java.util.Scanner;

/**
 *
 * @author mikeu
 */
public class Recursividad {

    public static void main(String[] args) {
       
       Scanner numeros = new Scanner(System.in);
        System.out.print("Introduzca un número natural: ");
        int num = numeros.nextInt();
        numeros.close();
        int total = suma(num);
 
        System.out.printf("%nEl sumatorio de 1 a %d es %d", num, total);
 
    }
 
    private static int suma(int num){
        if(num==1){
            return 1;
        }
        else{
            return num + suma(num-1);
        }
    }
}