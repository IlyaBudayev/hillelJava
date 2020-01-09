package homeWork3;


import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork3 {
    private static double firstNumber;
    private static double secondNumber;


    public static void main(String[] args)  {

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
               " 5. Ввести число, определить четное или нет.\n"+
                "\n"+
                "6. Ввести число, определить простое ли оно.\n"+
                "\n"+
                "7. Ввести число, определить каким числам оно кратно.\n"+



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
            print("Новое требование от заказчика калькулятора.");
//
//            firstNumber = enterCorrectNumber("First");
//            secondNumber = enterCorrectNumber("Second");

         CalcApp calcApp=new CalcApp();

         calcApp.start();

            break;
        case 1: // Average of two
            print("1. Программа, которая находит среднее арифметическое значение двух чисел.");
            firstNumber = enterCorrectNumber("First");
            secondNumber = enterCorrectNumber("Second");
            print("Среднее арифметическое из 2х чисел, равно: " + (firstNumber / secondNumber));
            break;
        case 2: // Average of any
            print("2. Программа, которая находит среднее арифметическое значение множества чисел.");
            meanNumberOfAnArray(fillAnArray());
            break;
        case 3:
            print(" \"3. Программа, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых,\\n\" +\n" +
                    " \" которые выплачивает банк, длительность вклада (лет). Вывести накопленную сумму денег за каждый год и начисленные\\n\" +\n" +
                    " \" проценты.\\n\" +");
            double deposit=enterCorrectNumber("Cумма депозита");
            double percentage = enterCorrectNumber("Процент годовых");
            double yearsOfInvest = enterCorrectNumber("длительность вклада");
            banking(deposit,percentage,yearsOfInvest);
            break;
        case 4:
            print("Вывести на консоль графику (ширину и высоту задает пользователь) вида:");
            graphicMethod();
            break;
        case 5:
            print("5. Ввести число, определить четное или нет.");
           isNumberisOdd();
            break;

        case 6:
            print("6. Ввести число, определить простое ли оно.");
            isNumberisPrime();
            break;
        case 7:
            print("7. Ввести число, определить каким числам оно кратно.");
            checkKratnost();
            break;

    }
}



    private static void graphicMethod() {
        print("Введите Высота");
        int height= (int) enterCorrectNumber("Высота");
        print("Введите ширину");
        int width= (int) enterCorrectNumber("Ширина");

        //Длинна - два раза печать в строчку
        //Ширина - печать в строчку

        print("Прямоугольник");
        drawRectangle(height,width);


        print("в шахматном порядке");
        drawChess(height,width);

        print("Конверт");
        drawEnvelope(height,width);



    }



    static private void drawRectangle(int h, int w){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1) {
                    System.out.print('*');
                } else {
                    if (j == 0 || j == w - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            print("");
        }
    }

    static private void drawEnvelope(int h, int w)
    {

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < w; j++) {
                if (i == 1 || i == h || j == 1 || j == w || i == j  || j == w + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("*");
        }

}

    static private void drawChess(int h, int w){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(i%2==0) {
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }else{
                    if (j % 2 == 0) {
                        System.out.print(' ');
                    } else {
                        System.out.print('*');
                    }

                }
            }
            print("");
        }
    }




    private static void checkKratnost() {
        int number= (int) enterCorrectNumber("");

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                print("Ваше число кратно: "+i);
            }
        }

    }

    private static boolean isNumberisPrime() {
        boolean prime = false;

            int number = (int) enterCorrectNumber("");



            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    print("Ваше число составное!");
                    prime = true;
                    break;
                }
            }
            if (!prime) {
                print("Число простое!");
                prime = false;
            }
            return prime;



        }





    private static void isNumberisOdd() {
        int number= (int) enterCorrectNumber("");

        if (number%2==0){
            print("Ваше число четное!");
        }else {
            print("нечетное!");
        }
    }

    //Printer method
    private static void print(Object object) {
        System.out.println(object);
    }
    private static double meanNumberOfAnArray(double[] array) {
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean += array[i];
        }

        mean=mean/(array.length);

        print("Среднее число: "+mean);
        return mean;
    }

    public static double[] fillAnArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + i + "-й элемент: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }
    private static void banking(double depo, double percent, double years){
        BigDecimal balance= new BigDecimal(depo);
        BigDecimal percentage= new BigDecimal(percent);
        BigDecimal sto = new BigDecimal(100);
        print("Стартовый депозит: "+balance+" грн");
        int let=(int) years;
        for (int i=0;i<let;i++){
            balance= (balance.add (balance.multiply(percentage).divide(sto)));
            print("За "+(i+1)+"-й год: "+ balance+" грн");
        }

    }

}
