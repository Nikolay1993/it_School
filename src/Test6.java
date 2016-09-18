/**
 * Created by Николай on 28.03.2016.
 */
import java.util.Scanner;
public class Test6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;


        a = sc.nextInt();
        b = sc.nextInt();

        if (a <= b) {
            System.out.println("alpha");
            return;
        }
        if (b < 0) {
            System.out.println("bravo");
            return;
        }

        if(b==0){
            System.out.println("charlie");
        } else {
            System.out.println("zulu");
        }
    }
}
