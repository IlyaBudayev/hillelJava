import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {


        double firstNumber=0.0;
        double secondNumber=0.0;
        String action="";


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);


        /**
         * Example of non DRY
         */

        do {
            print(" Please input first number:");

            try {
                final Double aDouble = Double.valueOf(scanner.next());
                firstNumber = aDouble;
                print("Your input "+firstNumber+" as a first number.");

                break;
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("Вы ввели не число. Попробуйте еще раз, но по трезвому");

            }

        } while (true);

        do {
            print("Please input Math operator (+-/*):");
            try {
                final String aDouble = (scanner.next());
                print(aDouble);

                if (aDouble.equals("+")||aDouble.equals("-")||aDouble.equals("/")||aDouble.equals("*")) {
                    action =aDouble ;
                }else
                    {
                        Exception exc = new Exception();
                      throw exc;
                    }

                print("Your input "+secondNumber+" as a second number.");

                break;
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("Вы ввели не правильны оператор. Попробуйте еще раз, но по трезвому");

            }

        } while (true);


        do {
            print("Please input second number:");
            try {
                final Double aDouble = Double.valueOf(scanner.next());

                secondNumber =  aDouble;

                print("Your input "+secondNumber+" as a second number.");

                break;
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("Вы ввели не число. Попробуйте еще раз, но по трезвому");

            }

        } while (true);

        // не было времени сделать красивый метод и не копипастить ;)



        print("Your");

        if(action=="+") {
            print("Sum is : " + (firstNumber + secondNumber));
        }else  if(action=="-") {
            print("Difference is : " + (firstNumber - secondNumber));
        }else  if(action=="*") {
            print("Multiplication is : " + (firstNumber * secondNumber));
        }else  if(action=="/") {
            if (secondNumber != 0) {
                print("Division is : " + (firstNumber / secondNumber));
            } else {
                print("Division error due that Second number is 0");

            }
        }
    }

    private static void print(Object object) {
        System.out.println(object);
    }
}
