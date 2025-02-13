/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinav Saini
 */
public class DiamondStarPattern {
    public static void main(String[] args) {
        int size = 5; // Size of the diamond (number of stars in the middle row)

        // Upper half of the diamond
        for (int i = 1; i <= size; i++) {
            // Print leading spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = size - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

