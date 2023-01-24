public class task11 {
    public static void main(String[] args) {
        //11)Write a program to print out duplicate elements from an Array of Strings?

        String[] fruit={"Orange","Apple", "Orange","Grape","Pineapple","Pineapple","Peach"};

        for (int i = 0; i < fruit.length; i++) {

            for (int j = i + 1 ; j < fruit.length ; j++) {

                if(fruit[i].equals(fruit[j])){

                    System.out.println("Duplicate= "+fruit[i]);
                }
            }

        }
    }
}
