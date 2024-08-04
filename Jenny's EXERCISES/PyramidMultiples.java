public class PyramidMultiples {
    public static void main(String[] args) {
        int noOfRows = 8;

        for (int i = 0; i < noOfRows; i++) {
            int spaces = (noOfRows - i - 1) * 2;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d ", (int) Math.pow(3, j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%3d ", (int) Math.pow(3, j));
            }

            System.out.println();        }
    }
}