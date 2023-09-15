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
public class Exe4InversãoDeLista {
    public static void main(String args[]){
     
        Scanner scanner = new Scanner(System.in);
        
        int[] lista = {1,2,3,4,5};
        int tamanho = lista.length;
        int[] invert = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            invert[i] = lista[tamanho - 1 - i];
        }
        
        System.out.println("Lista de números original:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        
        System.out.println("Lista de números invertida:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(invert[i] + " ");
        }
    }
}
