/**
 * Created by Николай on 07.07.2016.
 */
public class zadaniya2___1 {
    public static void main (String[] args){
        System.out.println("Сумма элементов кратных 2 3 5 7");
        getSummTwo(100,2);
        getSumm(0,100,2);
        getSummTwo(100,3);
        getSumm(0,100,3);
        getSummTwo(100,5);
        getSumm(0,100,5);
        getSummTwo(100,7);
        getSumm(0,100,7);
        getSummThee(100);
        getsummposledovatelnost(100);
    }
    static int getSumm(int start, int end, int fraction){
        int summ = 0;
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                summ+=i;
            }
        }
        System.out.println("  сумма элементов = "+summ);
        return summ;
    }
    static void getSummTwo(int end, int fraction){
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                System.out.print(" "+i);

            }
        }
    }
    static void getSummThee(int end){
        int summ2= 0;
        int summ7= 0;
        for(int i = 0; i<end; i++){
            if(i%2 == 0){
                summ2+=i;
            }
            if(i%7 == 0){
                summ7+=i;
            }
        }
        System.out.print("вычисляет разность сумм последовательности чисел, кратных 7 и 2 = ");
        System.out.println(summ2-summ7);
    }
    static void getsummposledovatelnost(int end){
        System.out.print("вычисляет отношение последовательности чисел, кратных 5 к  последовательности чисел, кратных 3");
                System.out.println((double)(getSumm(0,100,5)/(double)getSumm(0,100,3)));

        }
    }

