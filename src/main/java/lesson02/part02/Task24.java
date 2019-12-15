package lesson02.part02;

/**
 * Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 * Пример для чисел 4 6 6:
 * 1
 * Пример для чисел 6 6 3:
 * 3
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна использовать команды System.out.println() или System.out.print().
 * 3.	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
 * 4.	Если все числа разные, ничего не выводить.
 */

import java.io.*;
import java.util.*;

public class Task24 {
    public static void main(String[] args) throws Exception {
        int []a=new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        a[0]=scan.nextInt();
        System.out.print("b: ");
        a[1]=scan.nextInt();
        System.out.print("c: ");
        a[2]=scan.nextInt();
        if(a[0]!=a[1]&&a[0]!=a[2])
        {
            System.out.print(a[0]);
        }
        if(a[1]!=a[0]&&a[1]!=a[2])
        {
            System.out.print(a[1]);
        }
        if(a[2]!=a[1]&&a[0]!=a[2])
        {
            System.out.print(a[2]);
        }
    }
}
