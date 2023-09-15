/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios3;

import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class Exe1SomaElementos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] nums = new int[6];
        
        int soma = 0;
        
        nums[0] = 10;
        nums[1] = 8;
        nums[2] = 23;
        nums[3] = 42;
        nums[4] = 33;
        nums[5] = 51;
        
        for( int i = 0; i < nums.length; i++){
            soma = soma + nums[i];
        }
        
        System.out.println("Resultado é: " + soma);
    }
}
