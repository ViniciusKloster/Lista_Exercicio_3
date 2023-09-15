/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios3;

/**
 *
 * @author kloster.2919
 */
public class Exe3MaiorEMenor {
    public static void main(String args[]){
        
       int[] nums = new int[5];
      
       
       nums[0] = 8;
       nums[1] = 10;
       nums[2] = 15;
       nums[3] = 23;
       nums[4] = 16;
       
       int maior = nums[0];
       
       for(int i = 0; i < nums.length; i++){
          if (nums[i] > maior){
              maior = nums[i];
          }
       }
        System.out.println("O número maior é " + maior);       
        
    }
}
