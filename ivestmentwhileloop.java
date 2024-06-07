/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Etob media
 */
 import java.util.Scanner;

public class ivestmentwhileloop {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number of members: ");
        int numMembers = scanner.nextInt();
        
        double[] principalAmounts = new double[numMembers];
        double[] interestRates = new double[numMembers];
        int[] durations = new int[numMembers];
        
       
        int i = 0;
        while (i < numMembers) {
            // input  for principal amounts for memebers
            System.out.println("input principal amount for member " + (i + 1) + ":");
            principalAmounts[i] = scanner.nextDouble();
              // input for interest rates for memebers
            System.out.println("input interest rate for member " + (i + 1) + " (in percentage):");
            interestRates[i] = scanner.nextDouble();
            // input for duration for memebers
            System.out.println("input duration (in years) for member " + (i + 1) + ":");
            durations[i] = scanner.nextInt();
            i++;
        }
        
        // Calculate  the value of investment after the time frame elapses
        System.out.println("Value of investments after the time frame elapses:");
        i = 0;
        while (i < numMembers) {
            double value = principalAmounts[i] * (1 + interestRates[i] / 100) * durations[i];
            System.out.println("Member " + (i + 1) + ": " + value);
            i++;
        }
        
        // Reset scanner
        scanner.close();
    }
}


