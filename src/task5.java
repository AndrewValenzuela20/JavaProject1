public class task5 {
    public static void main(String[] args) {
        int[][] arr = {{57, 62, 21}, {75, 88, 23}, {75, 90, 23}};
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                } else {
                    oddSum += arr[i][j];
                }
            }
        }
        System.out.println("Even numbers sum= " + evenSum);
        System.out.println("Odd numbers sum= " + oddSum);
    }
}
