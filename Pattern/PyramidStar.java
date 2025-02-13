/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinav Saini
 */
public class PyramidStar {
    public static void main(String[] args) {
        int size = 5; // Number of rows in the rhombus

        // Loop for the upper half of the rhombus
        for (int i = 1; i <= size; i++) {
            // Print leading spaces for alignment
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // Print stars in the rhombus pattern
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
