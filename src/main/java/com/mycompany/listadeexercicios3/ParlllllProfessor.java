/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios3;

/**
 *
 * @author kloster.2919
 */
public class ParlllllProfessor {
    public static void main(String agrs[]){
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int contPares = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                contPares++;
        }
            } 

        int[] pares = new int[contPares];
        int contParesPos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                pares[contParesPos] = nums[i];
                contParesPos++;
               
             
             
            }
        }
        System.out.print("Os números pares são:");
        for(int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }
    }
}
