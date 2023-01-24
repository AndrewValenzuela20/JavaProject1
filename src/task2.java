import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] countries = new String[5];

        System.out.println("Enter 5 countries:");
        for (int i = 0; i < countries.length; i++) {
            countries[i] = scan.nextLine();}

        for (int i = 0; i < countries.length; i++) {
            switch (countries[i]) {
                case "India":
                    System.out.println("New Delhi");
                    break;
                case "USA":
                    System.out.println("Washington, D.C.");
                    break;
                case "Japan":
                    System.out.println("Tokyo");
                    break;
                case "China":
                    System.out.println("Beijing");
                    break;
                case "Russia":
                    System.out.println("Moscow");
                    break;
                default:
                    System.out.println("Capital not found");
            }
        }
    }
}