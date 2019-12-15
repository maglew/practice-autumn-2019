package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить среднее из трех чисел.
 * 4.	Если все числа равны, вывести любое из них.
 * 5.	Если два числа из трех равны, вывести любое из двух.
 */

public class Task41 {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int c;
        int med;
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        a=scan.nextInt();
        System.out.print("b: ");
        b=scan.nextInt();
        System.out.print("c: ");
        c=scan.nextInt();
      if((a>b&&c<b)||(a<b&&c>b))
          System.out.print(b);
          if((a>c&&b<c)||(a<c&&b>c))
              System.out.print(c);
              if((b>a&&c<a)||(b<a&&c>a))
                  System.out.print(a);
              else if(a==b||a==c)
        System.out.print(a);
               else if(b==c||a==c)
        System.out.print(c);
              else if(b==c||a==b)
                  System.out.print(c);
    }
}
