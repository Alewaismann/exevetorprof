/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

/**
 *
 * @author alexandre.9930
 */
public class exe5_E_6_FiltragemPares_Impares {
    public static void main(String args[]){
    
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int contPares = 0;
        int contImpares = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
               contPares++;
            }else{
                contImpares++;
            
            }
        }
         System.out.println("Contagem de pares: " + contPares);
         System.out.println("Contagem de impares: " + contImpares);
    }
}
