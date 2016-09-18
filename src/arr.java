/**
 * Created by JAVA on 27.06.2016.
 */
public class arr {
    public static void main(String[] args) {
        int arr[][] = new int[10][];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = new int[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
    }
}