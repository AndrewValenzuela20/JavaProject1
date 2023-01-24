public class task4 {
    public static void main(String[] args) {
        int[][] arr = {{51, 44, 36}, {73, 32, 26}, {18, 45, 39}};
        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
