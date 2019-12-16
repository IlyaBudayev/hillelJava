package homeWork4;

import com.sun.xml.internal.fastinfoset.util.PrefixArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Пользователь вводит координаты верхнего левого и нижнего правого угла прямоугольника, а также координаты точки (X,Y)
 * в прямоугольной системе координат. Реализовать функцию, которая определяет принадлежит ли точка этому прямоугольнику.
 */

public class HomeWork4_2 {
    public static void main(String[] args) {
        double x0,y0,x1,y1, xTest, yTest;

        print("Пожалуйста введите первую часть координат для оси Х и У");
        x0=enterParamNumber("Х0");
        y0=enterParamNumber("Y0");

        print("Пожалуйста введите вторую часть координат для оси Х и У");

        x1=enterParamNumber("Х1");
        y1=enterParamNumber("Y0");

        double[] x={x0,x1};
        double[] y={y0,y1};
        Arrays.sort(x);
        Arrays.sort(y);

        print("Пожалуйста введите координаты точки для проверки позиции");

        xTest=enterParamNumber("Х");
        yTest=enterParamNumber("Y");

            if (xTest>=x[0]&&xTest<=x[1]){
                if(yTest>=y[0]&&yTest<=y[1]){
                    print("Точка в зоне поражения! Открыть огонь?");
                }else {
                    print("Увы и ах! Точка вне прямоугольника");
                }

            }else{
                print("Точка вне прямоугольника");

            }



    }

    private static double enterParamNumber(String text){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);


        Double number;
        do {
            print(" Please input "+text+" :");

            try {
                final Double aDouble = Double.valueOf(scanner.next());
                number = aDouble;
                break;
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("Вы ввели не число. Попробуйте еще раз, но по трезвому");

            }

        } while (true);
        return number;
    }

    private static void print(Object object) {
        System.out.println(object);
    }

}
