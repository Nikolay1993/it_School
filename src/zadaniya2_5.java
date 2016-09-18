import java.util.Random;

/**
 * Created by Николай on 15.07.2016.
 */
public class zadaniya2_5 {
    public static void main(String[] args) {
        int[][] arr = new int [10][10];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j]= r.nextInt(100);
            }
        }
        System.out.println("Создать двумерный массив m на n элементов, заполнить его случайными  числами.");
        arr1(arr);
        arr2(arr);
        arr3(arr);
        arr4(arr);
        arr5(arr);
        arr6(arr);
    }

    static void arr1(int[][] arr) {
        System.out.print("распечатать массив в прямом и обратном порядке");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void arr2(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void arr3(int[][] arr) {
        System.out.print(" для каждой четной строки вывести все четные элементы массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0 && arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void arr4(int[][] arr) {
        System.out.print("для каждого нечетного столбца вывести все нечетные элементы массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0 && arr[i][j] % 2 != 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void arr5(int[][] arr) {
        System.out.println("сумму всех элементов, кратных 7 в четных строках");
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0 && arr[i][j] % 7 == 0) {
                    summ = summ + arr[i][j];

                }
            }
        }
        System.out.println(summ);
        System.out.println();
    }

    static void arr6(int[][] arr) {
        System.out.print("произведение элементов, кратных 3 в нечетных строках");
        int summ = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i % 2 !=0 && arr[i][j]% 3 == 0){
                    summ *=arr[i][j];


                }
            }

        }
        System.out.print(" = "+ summ);
    }
}