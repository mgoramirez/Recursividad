/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;
 

/**
 *
 * @author Asus
 */
public class Ejercicios {
   
    
    public char verificaVocal(char letra){
        if (letra=='a' || letra=='e' || letra=='i' ||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'){
            return 1;
            }
        else{
            return 0;
        }
     }
   
    public String vocales(String oracion, int i){
        if(i<oracion.length()){
            char letra= oracion.charAt(i);
            if (verificaVocal(letra)==1){
                oracion=oracion.replaceAll(String.valueOf(letra),"");
                vocales(oracion, i);
            }
            oracion=vocales(oracion,i+1);
        }   
        return oracion;
    }
    
    public double calcExponencial(int n, int x){
        double result =0 ;
        for(int i=0;i<n;i++){
            result=result+(Math.pow(x,i)/factorial(i));
        }
        return result;
    }
    
    public double factorial(int num){
        double result=1;
        for(int i=1;i<=num;i++){
            result=result*i;
        }
        return result;
    }
    
    public double calcExponencialRecursiva(int n, int x, int i, double result){
       if(i<n){
           result=result+(Math.pow(x,i)/factorial(i));
           result=calcExponencialRecursiva(n,x,i+1,result);
       }
       return result;
    }
    
    public double factorialRecursiva(int num,int i, double result){
        if (i<1 || result<1){
            i=1;
            result=1;
            System.out.println("Iniciando en 1");
            result=factorialRecursiva(num,i,result);
        }
        if(i<=num){
            result=result*i;
            result=factorialRecursiva(num,i+1,result);
        }
        return result;
    }
}
