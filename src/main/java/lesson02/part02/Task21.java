package lesson02.part02;

/**
 * Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
 * Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
 * Если имена и длины имен разные - ничего не выводить.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать две строки c клавиатуры.
 * 2.	Программа должна содержать System.out.println() или System.out.print()
 * 3.	Если имена одинаковые вывести сообщение "Имена идентичны"
 * 4.	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
 * 5.	Если имена и длины имен разные - ничего не выводить.
 */

import java.io.*;
import java.util.*;

public class Task21 {
    public static void main(String[] args) throws Exception {
       String name1;
       String name2;
        Scanner scan = new Scanner(System.in);
        System.out.println("name1: ");
        name1=scan.nextLine();
        System.out.println("name2: ");
        name2=scan.nextLine();
       if(name1.equals(name2))
       {
           System.out.print("Имена идентичны");
       }
       else if (name1.length()==name2.length())
       {
           System.out.print("Длины имен равны");
       }

    }
}
