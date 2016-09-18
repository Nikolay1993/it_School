/**
 * Created by Николай on 28.06.2016.
 */
public class Massiv {
    public static void main(String[] args) {
        int [][] arr =  {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<i+1 ; j++){
            System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; arr.length - i >= 0; j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//    }
    }
}
