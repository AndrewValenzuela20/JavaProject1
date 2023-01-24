public class task6 {
    public static void main(String[] args) {
        int number1= 10;
        int number2= 20;
        System.out.println("Before swap numbers - "+number1+", "+number2);
        number1+=number2;
        number2-=number2;
        number1+=number2;
        System.out.println("After swap numbers - "+number1+", "+number2);

    }
}
