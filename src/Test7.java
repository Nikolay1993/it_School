/**
 * Created by Николай on 28.03.2016.
 */
import java.util.Scanner;
public class Test7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        if (a%2==0){
            System.out.println("alpha");
        }
        if (a%3==0){
            System.out.println("bravo");
        }
        if (a%5==0){
            System.out.println("charli");
        }else {
            System.out.println("zulu");
        }

    }
}
