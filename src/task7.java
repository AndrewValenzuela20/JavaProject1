import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime");
        int num = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }
        System.out.println(isPrime);
    }
}