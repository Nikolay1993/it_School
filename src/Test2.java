/**
 * Created by Николай on 28.03.2016.
 */
import java.util.Scanner;
import java.lang.Thread;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();
        String c = "Invalid param";

        if (a == 366){
            System.out.println("yes");
            return;
        }

        if (a == 365){
            System.out.println("no");
        } else {
            System.out.println(c);
        }


    }
}

