/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

/**
 *
 * @author alexandre.9930
 */
public class exe7MesclarLista {
     public static void main(String args[]){
     
         int[] lista1 = {1,2,3,4,5,6,7,8,9,10};
         int[] lista2 = {11,12,13,14,15};
         
         int[] listaMesc = new int[lista1.length + lista2.length];
         for(int i = 0; i < lista1.length; i++){
             listaMesc[i] = lista1[i];
         }
         for(int i = 0; i < lista2.length; i++){
             listaMesc[lista1.length + i] = lista2[i];
         }
         for(int i = 0;i < listaMesc.length; i++){
             System.out.println(listaMesc[i]);
         }
      }
 }
