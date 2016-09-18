/**
 * Created by Николай on 28.03.2016.
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a%b == 0){
            System.out.println("Yes");
        }
        else {
           System.out.println("no");
        }
    }
}
