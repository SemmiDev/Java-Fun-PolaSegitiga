package com.javainterviewpoint;

import java.util.Scanner;

public class Pattern13{
    public static void main(String[] args){
        int base = 5;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            
            for(int k = 1; k <= base; k++){
                System.out.print(k + " ");
            }

            System.out.println();
            base--;
        }
    }
}
