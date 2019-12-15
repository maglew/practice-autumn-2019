package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них. Если два числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран минимальное из двух целых чисел.
 * 4.	Если два числа равны между собой, необходимо вывести любое.
 */

public class Task18 {
    public static void main(String[] args) throws Exception
    {
        int a;
        int b;
        int min;
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        a=scan.nextInt();
        System.out.print("b: ");
        b=scan.nextInt();
        if(a<b)
        {
            System.out.print("min a: "+a);
        }
        else if(a>b)
        {
            System.out.print("min b: "+b);
        }
        else if(a==b)
        {
            System.out.print("equal a & b: "+a);
        }

    }
}