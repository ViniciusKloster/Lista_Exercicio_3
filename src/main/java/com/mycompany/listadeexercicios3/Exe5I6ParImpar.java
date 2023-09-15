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
public class Exe5I6ParImpar {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
     
         int[] nums = new int[2];
         
         int par = 0, impar = 0;
     
         System.out.println("Informe o primeiro número:");
     
         nums[0] = entrada.nextInt();
     
         System.out.println("Informe o segundo número:");
     
         nums[1] = entrada.nextInt();
     
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                par = nums[i];
            }else if(nums[i] % 2 != 0){
                impar = nums[i];
            }
        }
        System.out.println("O número " + par + " é PAR, e o número " + impar + " é IMPAR");
    
    }
}
