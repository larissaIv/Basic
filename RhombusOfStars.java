import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n-rows; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 1; col <= rows-1; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int rows = n-1; rows > 0; rows--) {
            for (int col = 1; col <= n-rows; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 1; col < rows; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }

            }
        }

