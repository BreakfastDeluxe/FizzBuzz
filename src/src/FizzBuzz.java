public class FizzBuzz {
    public static void main(String[] args) {
        //3 and 5
        int number=0;

        while(number<101) {
            System.out.print(number);
            if (number % 3 == 0 && number % 5 == 0) {//if fizzbuzz
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
            number++;
        }
    }
}
