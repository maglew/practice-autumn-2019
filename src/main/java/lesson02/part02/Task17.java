package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * получим вывод
 * 2 2
 * <p>
 * б) при вводе чисел
 * 2
 * 2
 * 2
 * получим вывод
 * 2 2 2
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна содержать System.out.println() или System.out.print()
 * 3.	Если два числа равны между собой, необходимо вывести числа на экран.
 * 4.	Если все три числа равны между собой, необходимо вывести все три.
 * 5.	Если нет равных чисел, ничего не выводить.
 */

public class Task17 {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        a=scan.nextInt();
        System.out.print("b: ");
        b=scan.nextInt();
        System.out.print("c: ");
        c=scan.nextInt();

        if(a==b&&a!=c)
        {
            System.out.println(a+" "+a);
        }
        if(a==c&&a!=b)
        {
            System.out.println(a+" "+a);
        }
        if(c==b&&a!=c)
        {
            System.out.println(c+" "+c);
        }
        if(a==b&&b==c)
        {
            System.out.println(a+" "+a+" "+a);
        }

    }
}