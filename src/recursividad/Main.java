/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;
import java.lang.*;

/**
 *
 * @author Asus
 */

/**
Utilizando la recursividad en java:
a. Elimine las vocales de una oración e imprima la oración resultante.
b. Crear un método que obtenga la suma de los números naturales desde 1 hasta N.
c. Crea un método que compruebe si un número es binario. Un número binario está
formado únicamente por ceros y unos.
d. Convierta el siguiente código en funciones recursivas, debe de mostrar el resultado final,
comparelo con el resultado final del código realizado con ciclos for
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicios ejercicio1= new Ejercicios();
        Ejercicios ejercicio4=new Ejercicios();
        
        
        System.out.println(ejercicio1.vocales("Croacia y venezuela", 0));
        
        
        System.out.println(ejercicio4.calcExponencial(7, 3));
        System.out.println(ejercicio4.factorial(5));
        System.out.println(ejercicio4.calcExponencialRecursiva(7,3,0, 0));
        System.out.println(ejercicio4.factorialRecursiva(5,1,1));
        
        
        
    }
    
}
