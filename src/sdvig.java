/**
 * Created by Николай on 23.07.2016.
 */
public class sdvig {
    public static void main(String[] args) {
//        const int n = 5;
//        int array[] = {1, 2, 3, 4, 5};
//        int t;
//        t = array.length-1;
//        for (int i = 0; i < size -1; i--) {
//            array[i] = array[i-1];
//            System.out.print(array[i]);
//        }
//        array[0]= t;
//        int[] intArr = new int[]{1, 2, 3};
//        for (int i = intArr.length - 1; i >= 0; i--) {
//            if (intArr[i] == 2) {
//                System.out.println("index = " + i);
//            }
//        }
        int[] array = new int[]{1, 2, 3,4,5};
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j-1];
              System.out.print(array[j]);
            }
            array[0] = temp;
           // System.out.print(array[i]);
        }
    }
}