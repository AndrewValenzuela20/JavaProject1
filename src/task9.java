public class task9 {
    public static void main(String[] args) {
            int[] arr = {23, 11, 64, 61, 75, 26, 63, 47, 39};
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Biggest number in the array: " + max);
            System.out.println("Smallest number in the array: " + min);
        }
    }
