/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

/**
 *
 * @author alexandre.9930
 */
public class exe4InversaoDeLista {
  public static void main(String args[]){
  
     int[] nums = {1,2,3,4,5};
     int[] inv = {1,2,3,4,5};
     
     int contInv = nums.length;
     for(int i = 0; i < nums.length; i++){
        contInv--;
        inv[i] = nums[contInv];
       }
         System.out.println("Valores na ordem normal: ");
         for(int i = 0;i < nums.length; i++){
         System.out.println(nums[i]);
     }
            System.out.println("Valores na ordem inversa: ");
            for(int i = 0;i < nums.length; i++){
            System.out.println(inv[i]);
     }
  }  
}
