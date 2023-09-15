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
public class Exe9BuscaDeElemento {
    public static void main(String args[]){
    
        Scanner entrada = new Scanner(System.in);
            int[] lista = {10,20,30,40,50,60};

            int busca, posicao = -1;

            for(int i = 0; i < lista.length; i++){
                System.out.println(lista[i]);
            }
            
            System.out.println("____________________________________");
                
            System.out.println("Irfome o elemento que deseja buscar:");
            busca = entrada.nextInt();
            
            for(int i = 0; i < lista.length; i++){
                if(lista[i] == busca)
                    posicao = i;
            }
            
            System.out.println("O elemento " + busca + " está na posição: " + posicao);
            
            
        
    }
}
