import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n-1)/2;

        for (int i = 0; i <= (n-1) /2; i++) {
            System.out.print(generateFrom(leftRight));
            System.out.print("*");
            int mid = n-2 * leftRight - 2;
            if (mid>=0){
                System.out.print(generateFrom(mid));
                System.out.print("*");
            }
            System.out.print(generateFrom(leftRight));
            leftRight--;
            System.out.println();
        }
        for (int i = 0; i < (n-1)/2; i++) {
            leftRight++;
            System.out.print(generateFrom(leftRight));
            System.out.print("*");
            int mid = n-2 * leftRight - 2;
            if (mid >=0){
                System.out.print(generateFrom(mid));
                System.out.print("*");
            }
            System.out.print(generateFrom(leftRight));
        }
    }

    private static String generateFrom(int left) {
        return "-".repeat(Math.max(0, left));
    }


}
