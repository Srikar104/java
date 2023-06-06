public class Reversenum {
    public static void main(String[] args) {

        int number=123; int output = 0;



        while(number != 0) {
            int digit = number % 10;
            output = output * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number is: " + output);

    }
}