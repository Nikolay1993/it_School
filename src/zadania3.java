import java.util.Scanner;

/**
 * Created by Николай on 28.06.2016.
 */
public class zadania3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = 3.14;
        System.out.println("Расчеь объема целиндра по формуле V = π*r(квадрат)*H");
        System.out.println("Ввудите H");
        int a = sc.nextInt();
        System.out.println("Ввудите r");
        int b = sc.nextInt();
        System.out.println("Объем целиндра = " + p*Math.pow(b, 2)*a);
        System.out.println();
        System.out.println("Расчет Объема полого целиндра по формуле V = π*H*(r2(квадрат) - r1(квадрат)) ");
        System.out.println("Hеобходима чтобы r2 была больше r1");
        System.out.println("Введите Н");
        int c = sc.nextInt();
        System.out.println("Введите r2");
        int d = sc.nextInt();
        System.out.println("Введите r2");
        int f = sc.nextInt();
        System.out.println("Объем полого целиндра = "+ p*c*(Math.pow(d,2)*Math.pow(f,2)));
        System.out.println();
        System.out.println("Расчет площади боковой поверхности целиндра по формуле  Sбок = 2π*r*H;");
        System.out.println("Введите r");
        int w = sc.nextInt();
        System.out.println("Введите Н");
        int e = sc.nextInt();
        System.out.println("Площадь боковой поверхноси целинда = "+ 2*p*w*e);
        System.out.println();
        System.out.println("Расчет объема шара по формуле  S = 4*π*R(квадрат)");
        System.out.println("Введите R");
        int r = sc.nextInt();
        System.out.println("Объем шара = "+ 4*p*Math.pow(r,2));
        System.out.println();
        System.out.println("Расчет площади поверхности шара по формуле V = 4*π*R(кубе) / 3;");
        System.out.println("Введите R");
        int t = sc.nextInt();
        System.out.println("Площадь поверхности шара = "+ 4*p*Math.pow(t,3)/3);
        System.out.println();
        System.out.println("Расчет прямоугольного параллепипеда по формуле S = 2*(ab + bc + ac)");
        System.out.println("Введите стороны а б с");
        System.out.println("сторона а");
        int y = sc.nextInt();
        System.out.println("сторона б");
        int u = sc.nextInt();
        System.out.println("сторона с");
        int i = sc.nextInt();
        System.out.println("Площадь прямоугольного парллепипеда ="+ 2*(y*u + u*i + y*i));
        System.out.println();
        System.out.println("Расчет площади поверхности тетраэдра по формуле S=a(квадрат)√3 ");
        System.out.println("Введите а");
        int o = sc.nextInt();
        System.out.println("Площадь поверхности тетраэдра ="+ Math.pow(o,2)*Math.sqrt(3));

    }
}
