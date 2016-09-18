/**
 * Created by Eugene on 23.06.2016.
 */
import java.net.SocketPermission;
import java.util.Scanner;
public class celindr {
    public static void main(String[] args) {
        double a, b, c, d, e, f, g, h, n,v,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        a = sc.nextDouble(); // Радиус
        double Ccirc = 2*3.1415926*a;
        double Scirc = 3.1415926*Math.pow(a, 2);
        System.out.println("радиус окружности = " +Ccirc);
        System.out.println("площадь окружности = " +Scirc);
        System.out.println("Введите R окружности");
        b = sc.nextDouble(); // R
        System.out.println("Введите r окружности");
        c = sc.nextDouble(); // r
        double So = 3.1415926*((Math.pow(b, 2))-( Math.pow(c, 2)));
        System.out.println("площадь кольца =" +So);
        System.out.println("Введите высоту треугольника");
        d = sc.nextDouble();
        System.out.println("Введите стороны треугольника");
        e = sc.nextDouble();
        double x = d*e/2;
        System.out.println("Площадь =" +x);
        f = sc.nextDouble();
        System.out.println("Введите периметр треугольника");
        System.out.println("Введите сторону (а)");
        g = sc.nextDouble();
        System.out.println("Введите сторону (б)");
        h = sc.nextDouble();
        System.out.println("Введите сторону (с)");
        n = sc.nextDouble();
        double y = 1/2 *(g+h+n);
        System.out.println("Периметр треугольника"+y);
        System.out.println("Введите Площадь прямогульника");
        System.out.println("Введите сторону (а)");
        p = sc.nextDouble();
        System.out.println("Введите сторону (б)");
        v = sc.nextDouble();
        double m = p*v;
        System.out.println("Площадь прямогольника ="+m);
    }
}