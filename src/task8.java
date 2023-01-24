public class task8 {
    public static void main(String[] args) {
        int n = 10, n2 = 0, n3 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(n2 + " ");
            int sum = n2 + n3;
            n2 = n3;
            n3 = sum;
        }
    }
}
