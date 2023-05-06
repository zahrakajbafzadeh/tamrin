import java.util.Scanner;

public class tamrin2_32 {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        for (int x = 1; x <= 5; x++) {
            try {
                System.out.println("pleasr inter your number " + x + ": ");
                int a = input1.nextInt();

                if (a > 0) {
                    System.out.println(a + " is positive");
                } else if (a == 0) {
                    System.out.println(a + " is zero");
                } else System.out.println(a + " is negative");
            } catch (Exception e) {
                throw new RuntimeException("fvnj3");
            }

        }
    }
}

