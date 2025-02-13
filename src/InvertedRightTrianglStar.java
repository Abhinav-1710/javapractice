public class InvertedRightTrianglStar {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {  // Start from 5, decrease down to 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

