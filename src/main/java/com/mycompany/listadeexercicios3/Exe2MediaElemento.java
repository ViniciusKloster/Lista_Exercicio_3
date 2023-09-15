/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios3;

/**
 *
 * @author kloster.2919
 */
public class Exe2MediaElemento {
    public static void main(String args[]){
    
        
        float[] nums = new float[3];
        
        float soma = 0, resultado;
        
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 8;
        
        for(int i = 0; i < nums.length; i++){
            soma = soma + nums[i];
        }
    
        resultado = soma / nums.length;
        
        System.out.println(resultado);
    
    }
}
