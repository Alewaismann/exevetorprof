/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

/**
 *
 * @author alexandre.9930
 */
public class exe8Ordenacao {
    public static void main(String args[]){
    
    int[] lista = {35,5,167,67,40};
    int indiceMenor;
    
    for(int i = 0; i < lista.length; i++){
       indiceMenor = i;
       for(int j = i; j < lista.length; j++){
           if(lista[j] < lista[indiceMenor]){
               indiceMenor = j;
          }
        }
       int temp = lista[i];
       lista[i] = lista[indiceMenor];
       lista[indiceMenor] = temp;
      }
    for(int i = 0; i < lista.length; i++){
        System.out.println(lista[i]);
     }
   }
}
