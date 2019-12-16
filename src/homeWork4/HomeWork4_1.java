package homeWork4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Реализовать функцию по нахождению сумм цифр в числе (123->6, 202->4).
 */

public class HomeWork4_1 {
    public static void main(String[] args) {
        int myNumber;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        do {
            print("Введите целое:");

            try {
                final Integer anInt = Integer.valueOf(scanner.next());
                myNumber = anInt;
               print("your sum is: "+ castAndSumm(myNumber));

                break;
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("Вы ввели не число или число не целое. Попробуйте еще раз, но по трезвому");

            }

        } while (true);
    }

    private static void print(Object object) {
        System.out.println(object);
    }

    private static int castAndSumm(int number) {
        String sNumber = String.valueOf(number);
        int mySumm = 0;
        for (int i = 0; i < sNumber.length(); i++) {
            mySumm = mySumm + Character.getNumericValue(sNumber.charAt(i));

        }

        return mySumm;
    }

}



