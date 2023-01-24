import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 numbers to add together");
        arr[0]=scanner.nextInt();
        arr[1]=scanner.nextInt();
        arr[2]=scanner.nextInt();
        arr[3]=scanner.nextInt();
        arr[4]=scanner.nextInt();
        int sum=0;

        for(int i = 0; i <arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}