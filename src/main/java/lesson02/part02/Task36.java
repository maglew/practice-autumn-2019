package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 * Пример: m=2, n=4
 * 8888
 * 8888
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать два числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить прямоугольник размером m на n из восьмёрок.
 * 4.	В программе должен использоваться цикл for.
 */

public class Task36 {
    public static void main(String[] args) throws Exception {
        int m;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("m: ");
        m=scan.nextInt();
        System.out.print("n: ");
        n=scan.nextInt();
        for (;m>0;m--)
        {
            for (int i=n;i>0;i--)
            {
                System.out.print("S");
            }
            System.out.print("\n");
        }

    }
}
