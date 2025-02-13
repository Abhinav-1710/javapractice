/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinav Saini
 */
public class HollowSquareStarPattern {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {    // Loop for each row
            
            for (int j = 1; j <= size; j++) {   // Loop for each column in the row
                
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
