import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter any no.");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        for (i = 1; i <= num; i++) {
            int count = 0;
            for (j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}

