import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            String stars = generateFrom("*", i);
            String spaces = generateFrom(" ", n-i);
                System.out.print(spaces);
                System.out.print(stars);
                System.out.print(" | ");
                System.out.print(stars);
                System.out.print(spaces);
            System.out.println();
            }
        }

    private static String generateFrom(String symbol, int numberOfStars) {
        StringBuffer builder = new StringBuffer();
        for (int i = 0; i < numberOfStars; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }
}

