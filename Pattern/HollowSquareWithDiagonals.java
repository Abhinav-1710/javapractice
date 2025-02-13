/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinav Saini
 */
public class HollowSquareWithDiagonals {
    public static void main(String[] args) {
        int size = 5; // Size of the square (5x5)

        // Loop for each row of the square
        for (int i = 1; i <= size; i++) {
            // Loop for each column in the row
            for (int j = 1; j <= size; j++) {
                // Print stars on the borders or diagonals
                if (i == 1 || i == size || j == 1 || j == size || i == j || j == (size - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

