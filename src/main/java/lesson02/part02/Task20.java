package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания. Выведенные числа должны быть разделены пробелом.
 *
 *
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить числа на экран.
 * 3.	Программа должна выводить три числа разделенных пробелами.
 * 4.	Программа должна выводить числа в порядке убывания.
*/

public class Task20 {
    public static void main(String[] args) throws Exception
    {
        int []a=new int[3];
        int []b=new int[3];
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        a[0]=scan.nextInt();
        System.out.print("b: ");
        a[1]=scan.nextInt();
        System.out.print("c: ");
        a[2]=scan.nextInt();
        b=a;
        if(b[0]<b[1])
        {
        temp=b[0];
        b[0]=b[1];
        b[1]=temp;
        }
        if(b[2]>b[1])
        {
            temp=b[1];
            b[1]=b[2];
            b[2]=temp;
        }
        if(b[0]<b[1])
        {
            temp=b[0];
            b[0]=b[1];
            b[1]=temp;
        }


        System.out.print(b[0]+""+b[1]+""+b[2]);

    }
}
