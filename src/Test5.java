/**
 * Created by Николай on 28.03.2016.
 */
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a<=b){
            System.out.println("ok");
            return;
        }else{
            System.out.println("violation");
        }
    }
}
