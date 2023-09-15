/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios3;

import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class Exe8Ordenação {
    public static void main(String args[]){
        
       
        
        int[] numeros = {5, 3, 1, 2, 4};
        
        int tamanho;
                
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Lista de números ordenada em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
    
