/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio2_prof;

import java.util.Scanner;

/**
 *
 * @author alexandre.9930
 */
public class exe9BuscaElem {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] lista = {15,254,24,97,102,67,34,39,8,3};
        int ValorBusca, posicao = 0;
        
        boolean encontrado = false;
        
        System.out.println(" Qual valor deseja encontrar? ");
        ValorBusca = scanner.nextInt();
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == ValorBusca){
            encontrado = true;
            posicao = i;
            break;
          }
        }
        if(encontrado){
            System.out.println(" O valor " + ValorBusca + " existe na lista e está na posição " + posicao);
       }else{
            System.out.println(" O valor " + ValorBusca + " não existe na lista! ");
      }
    }
  }
