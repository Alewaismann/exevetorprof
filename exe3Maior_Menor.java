/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

/**
 *
 * @author alexandre.9930
 */
public class exe3Maior_Menor {
    public static void main(String args[]){
    
      int[] elementos = {105,67,1057,37,197,};
      int maior = elementos[0];
      
      for(int i = 0; i < elementos.length; i++){
         if(elementos[i] > maior){
         maior = elementos[i];
         }
      }int menor = elementos[0];
      for(int i = 0; i < elementos.length; i++){
          if (elementos[i] < menor){
           menor = elementos[i];
        }
      }System.out.println("O maior valor é: " + maior);
       System.out.println("O menor valor é: " + menor);
   }
}
