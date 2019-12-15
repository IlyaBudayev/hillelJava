import java.util.Locale;
import java.util.Scanner;

public class HomeWork3 {
    private static double firstNumber;
    private static double secondNumber;


    public static void main(String[] args) {

        double firstNumber=0.0;
        double secondNumber=0.0;



        print(          "0. Новое требование от заказчика калькулятора  \n" +
                        "\n" +
                        "1. Программа, которая находит среднее арифметическое значение двух чисел.\n" +
                        "\n" +
                        "2. Программа, которая находит среднее арифметическое значение произвольного количества чисел.\n" +
                        "\n" +
                        "3. Программа, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых,\n" +
                        " которые выплачивает банк, длительность вклада (лет). Вывести накопленную сумму денег за каждый год и начисленные\n" +
                        " проценты.\n" +
                        "\n" +
                        "4. Вывести на консоль графику (ширину и высоту задает пользователь) вида:\n" +
                        "\n"+
                "Пожалуйста введите номер одного из заданий: \n");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Integer number;

        do {
            try {
                final Integer anInt = Integer.valueOf(scanner.next());
                number = anInt;

                taskSelector(number);

            }catch (Exception e){
                print("An incorrect symbol. Try to enter a number of Integer type");
            }
        }while (true);

    }






    //Number initializator
    private static double enterCorrectNumber(String text){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);


        Double number;
        do {
            print(" Please input "+text+" number:");

            try {
                final Double aDouble = Double.valueOf(scanner.next());
                number = aDouble;
                print("Your input "+number+" as a "+text+" number.");
                break;
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("Вы ввели не число. Попробуйте еще раз, но по трезвому");

            }

        } while (true);
        return number;
    }

private static void taskSelector(int taskNumber) {

    switch (taskNumber) {
        case 0: // New Calculator
            firstNumber = enterCorrectNumber("First");
            secondNumber = enterCorrectNumber("Second");

            break;
        case 1: // Average of two
            firstNumber = enterCorrectNumber("First");
            secondNumber = enterCorrectNumber("Second");
            print("Среднее арифметическое из 2х чисел, равно: " + (firstNumber / secondNumber));
            break;
        case 2: // Average of any

    }
}
    //Printer method
    private static void print(Object object) {
        System.out.println(object);
    }
}
