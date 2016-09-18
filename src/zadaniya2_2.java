/**
 * Created by Николай on 22.07.2016.
 */

import java.util.Scanner;

public class zadaniya2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выводит в консоль текстовое  представление случайного целого числа в диапазоне от 0 до 99 включительно.");
        int c;
        int figures = sc.nextInt();
        do {
            int a, b;
            a = (int) figures / 10;//кол-во десятков в числе
            b = (figures % 10);//кол-во единиц в числе
            if (figures < 20) {
                System.out.print(figuresSwitch(figures));
            } else {
                System.out.print(figuresSwitch(a * 10));
                if (b != 0) {
                    System.out.print(" " + figuresSwitch(b).toLowerCase());
                }
            }
            System.out.println();
            System.out.println("Если вы хотите закончить введите 100 если нет введите цифру от 0 до 99");
            c = sc.nextInt();
            figures=c;
        }
            while (c != 100) ;
        }

    public static String figuresSwitch(int figures) {
        switch (figures) {
            case 1:
                return "Один";
            case 2:
                return "Два";
            case 3:
                return "Три";
            case 4:
                return "Четыре";
            case 5:
                return "Пять";
            case 6:
                return "Шесть";
            case 7:
                return "Семь";
            case 8:
                return "Восемь";
            case 9:
                return "Девять";
            case 10:
                return "Десять";
            case 11:
                return "Одинандать";
            case 12:
                return "Двенадцать";
            case 13:
                return "Тринадцать";
            case 14:
                return "Четырнодцать";
            case 15:
                return "Пятнадцать";
            case 16:
                return "Шестнадцать";
            case 17:
                return "Семнадцать";
            case 18:
                return "Восемнадцать";
            case 19:
                return "Девятнадцать";
            case 20:
                return "Двацать";
            case 30:
                return "Тридцать";
            case 40:
                return "Сорок";
            case 50:
                return "Пятьдесят";
            case 60:
                return "Шисдесят";
            case 70:
                return "Семдесят";
            case 80:
                return "Восемдесят";
            case 90:
                return "Девяносто";
            default:
                return " ";
        }
    }
}