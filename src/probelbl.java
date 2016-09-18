/**
 * Created by Николай on 12.07.2016.
 */
public class probelbl {
    public static void main(String[] args) {


        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (i < arr.length) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("  ");
                }
            }
        }
    }
}

//for (i�O; i<4; i++) {
//        for(j=O; j<i +l; j++)
//        Systeш.out. pr·int
//        (twolJ [iJ[jJ +" ");
//        Systeш.out . println();