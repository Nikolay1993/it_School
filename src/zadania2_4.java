import java.util.Random;
import java.util.Scanner;

/**
 * Created by Николай on 03.07.2016.
 */
public class zadania2_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        massivone(arr);
        chetnieNeChetnie(arr);
        cratnie7(arr);
        proizvedenie3(arr);
    }


    static void massivone(int[] arr) {
        System.out.print("Массив - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.print("Массив в обратном порядке - ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    static void chetnieNeChetnie(int[] arr) {
        System.out.println();
        System.out.print("Четные - ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Не четные - ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    static void cratnie7(int[] arr){
        int summ = 0;
        System.out.println();
        System.out.print("Сумма чисел кратных 7 - ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 7 == 0){
                summ = summ + arr[i];
                System.out.print(summ);
            }
        }
    }
    static void proizvedenie3(int[] arr){
        long summ = 1;
        System.out.println();
        System.out.print("Произведение элементов кратных 3 - ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%3==0){
                summ = summ*arr[i];
                System.out.print(summ);
            }
        }
    }
}