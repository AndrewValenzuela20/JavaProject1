public class task3 {
    public static void main(String[] args) {
        int[][] arr = {{6, 21, 34}, {45, 51, 64}, {71, 83, 95}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
