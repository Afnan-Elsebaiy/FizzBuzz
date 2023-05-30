import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number- ");
                int a= sc.nextInt();

                if(a%5==0 && a%3==0)
                    System.out.println("FizzBuzz");
                else if(a%5==0)
                    System.out.println("Fizz");
                else if(a%3 == 0)
                    System.out.println("Buzz");
                else if(a%5!=0 || a%3!=0)
                    System.out.println(a);

    }
}