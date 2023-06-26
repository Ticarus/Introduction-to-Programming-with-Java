package com.mycompany.miniproject1;

import java.util.Scanner;

public class MiniProject1 {

    public static void main(String[] args) {
        int playerInput;
        boolean isPrime = true;        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===Prime Number Finder===");
        System.out.print("Input the number you would like to test:");
        playerInput = sc.nextInt();
        
        if(playerInput <= 1){
            System.out.println("Prime numbers can't be smaller than 1 (including 1)");
        }
        else if(playerInput == 2){
            System.out.println(playerInput + " is a prime number");
        }
        else{
            for(int i = 2 ; i < playerInput ; i++){
                if(playerInput % i == 0){
                    isPrime = false;
                }
            }
            
            if(isPrime){
                System.out.println(playerInput + " is a prime number");
            }
            else{
                System.out.println(playerInput + " is not a prime number");
            }
        }
    }
}
