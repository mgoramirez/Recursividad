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
                vocales(oracion, i+1);
            }
            vocales(oracion,i+1);
        }   
        return oracion;
    }
}
