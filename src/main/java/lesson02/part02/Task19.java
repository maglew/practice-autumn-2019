package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран максимальное из четырёх чисел.
 * 4.	Если максимальных чисел несколько, необходимо вывести любое из них.
 */

public class Task19 {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int c;
        int d;
        int max;
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        a=scan.nextInt();
        System.out.print("b: ");
        b=scan.nextInt();
        System.out.print("c: ");
        c=scan.nextInt();
        System.out.print("d: ");
        d=scan.nextInt();

        if (a>b)
        {max=a;}
        else
        { max=b;}
        if (c>max)
            max=c;
        if(d>max)
            max=d;
        System.out.print("max "+max);

    }
}
