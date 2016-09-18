/**
 * Created by Николай on 23.07.2016.
 */
public class zadaniya2_7 {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};
        System.out.println("Прямоугольный массив");
        System.out.println();
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        print(arrMoveLeft(arr,1));
        print(arrMoveRight(arr,1));
    }
   public static int[][] arrMoveLeft(int[][] arr, int number){
        System.out.println();
        System.out.println("Цикличиский сдвиг в лево");
        System.out.println();
        int arr1 [][] = new int[5][5];
        for(int  i = 0; i<arr.length;i++){
            if(number>=arr[i].length){
                number-=arr[i].length;
            }
            number=arr[i].length-number;
            if (number!=0){
                System.arraycopy(arr[i],arr[i].length-number,arr1[i],0,number);
                System.arraycopy(arr[i],0,arr1[i],number,arr[i].length-number);
            }
            else arr1=arr;
        }
        return arr1;

    }
    public static int[][] arrMoveRight(int[][] arr, int number){
        System.out.println();
        System.out.println("Цикличиский сдвиг в право");
        System.out.println();
        int arr1 [][] = new int[5][5];
        for(int  i = 0; i<arr.length; i++){
            if(number>=arr[i].length){
                number-=arr[i].length;
            }
            if (number!=0){
                System.arraycopy(arr[i],arr[i].length-number,arr1[i],0,number);
                System.arraycopy(arr[i],0,arr1[i],number,arr[i].length-number);
            }
            else arr1=arr;
        }
        return arr1;
    }
    public static void print (int[][]arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//for(int i = 0; i<arr.length;i++){
//        for(int j = arr[i].length-1; j>=0; j--){
//        System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//        }