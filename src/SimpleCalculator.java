import java.util.Locale;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {


        double firstNumber=0.0;
        double secondNumber=0.0;


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);






    while (scanner.nextDouble()) {
        print(" Please input first number:");
        firstNumber = scanner.nextDouble();



            System.out.println("Вы ввели не число. Попробуйте еще раз, но по трезвому");

    }



        print("Your input "+firstNumber+"as a first number.");
        print("Please input second number:");


            secondNumber = scanner.nextDouble();

        print("Your input "+secondNumber+"as a second number.");
        print("Your");
        print("Sum is : "+(firstNumber+secondNumber));
        print("Difference is : "+(firstNumber-secondNumber));
        print("Multiplication is : "+(firstNumber*secondNumber));

        if(secondNumber!=0) {
            print("Division is : " + (firstNumber / secondNumber));
        }else{
            print("Division error due that Second number is 0");

        }



    }

    private static void print(Object object) {
        System.out.println(object);
    }




}
