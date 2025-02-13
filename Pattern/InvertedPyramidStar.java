/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinav Saini
 */
import java.util.Scanner;

public class InvertedPyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define the number of rows as 5 (for this specific pattern)
        int rows = 5;
        
        // Loop to print the inverted mirrored right triangle pattern
        for (int i = rows; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
        
        sc.close();
    }
}
