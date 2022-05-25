import java.util.Scanner;

public class House {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            int stars = 1;
            if (n % 2 == 0){
                stars++;
            }

            for (int i = 0; i < (n+1)/2; i++) {
                int padding = (n-stars)/2;
                System.out.print(repeatStr("-", padding));
                System.out.print(repeatStr("*", stars));
                System.out.print(repeatStr("-", padding));
                System.out.println();
                stars += 2;
            }
            for (int i = 0; i < n / 2; i++) {
                String line = "|";
                System.out.print(line);
                System.out.print(repeatStr("*", n-2));
                System.out.print(line);
                System.out.println();

            }
        }

    private static String repeatStr(String symbol, int number) {
        return String.valueOf(symbol).repeat(Math.max(0, number));
        }

}
