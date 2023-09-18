/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

/**
 *
 * @author alexandre.9930
 */
public class exe2MediaElementos {
    public static void main(String args[]){
    
            float[] elementos = {10,10,10,10,10};
            float soma = 0;
                
            for(int i = 0; i < elementos.length; i++){
               soma = soma + elementos[i];
            }
            float media = soma / elementos.length;

            System.out.println(" Média: " + media);
     }
}
