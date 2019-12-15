package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры строку name.
 * Ввести с клавиатуры дату рождения (три числа): y, m, d.
 * Вывести на экран текст:
 * «Меня зовут name.
 * Я родился d.m.y»
 * <p>
 * Пример вывода:
 * Меня зовут Вася.
 * Я родился 15.2.1988
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать строки c клавиатуры.
 * 2.	Программа должна выводить строки на экран.
 * 3.	Программа должна выводить текст, шаблон которого указан в задании.
 * 4.	Каждое предложение вывести с новой строки.
 */

public class Task43 {
    public static void main(String[] args) throws Exception {
        String name;
        int d;
        int m;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name=scan.nextLine();
        System.out.print("day: ");
        d=scan.nextInt();
        System.out.print("month: ");
        m=scan.nextInt();
        System.out.print("year: ");
        y=scan.nextInt();
        System.out.println("Меня зовут "+name);
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
