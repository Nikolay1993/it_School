/**
 * Created by Николай on 12.07.2016.
 */

public class zadanya2_6 {

    public static void main(String[] args) {
        int[][] array = new int[10][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i];

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        printHorizontal(array);
        printHorizontal2(array);
    }

    static void printHorizontal(int[][] arr) {
        System.out.println("Отражение треугольника по горизонтали:\n");
        for (int i = 0; i < arr.length; i++) {
            //нужное кол-во пробелов
            for (int k = arr.length; k > arr[i].length; k--) {
                System.out.print("  "); //при одном пробеле печатает правильный треугольник
            }
            //вывод эл-тов массива
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printHorizontal2(int[][] array) {
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            for (int k = array.length; k>array[i].length;k-- ){
                System.out.print("  ");
            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        }
    }


//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                    System.out.print(array[i][j] + " ");
//                    for (int k = 8; k >= 0; k--) {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//        }

//for (int i = arr.length-1; i >= 0; i--) {
//        for (int j = 0; j < arr[i].length; j++) {
//        System.out.print(arr[i][j]);
//        }
//        System.out.println();
