/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

/**
 *
 * @author alexandre.9930
 */
public class exe1Soma {
    public static void main(String args[]){
    int[] elementos = {15,35,107,20,8};
    
    int soma = 0;
    
    for(int i = 0; i < elementos.length; i++){
        soma = soma + elementos[i];
     }
    
        System.out.println("Soma dos elementos: " + soma);
   }
}
 