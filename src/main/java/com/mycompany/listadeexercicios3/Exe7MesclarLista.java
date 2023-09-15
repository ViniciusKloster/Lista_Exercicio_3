/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios3;

/**
 *
 * @author kloster.2919
 */
public class Exe7MesclarLista {
    public static void main(String args[]){
      
        int[] nums = {1,2,3};
        
        int kleitom = 0, cleberson = 0;
     
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
             kleitom = nums[i];         
        }
        
        int[] nums2 = {4,5,6};
    
        for(int i = 0; i < nums2.length; i++){
            System.out.print(nums2[i]);
            cleberson = nums2[i];
        }  
    }
}
