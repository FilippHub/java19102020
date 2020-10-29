package lesson2;

public class Main {
    public static void main(String[] args) {
 /*   //задание 1
        int[] arr ={1,1,0,0,1,0,1,1,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }else {
                arr[i] = 0;
                }
        }
    //задание 2
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
   //задание 3
        int[] arr ={1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
   //задание 4
       printArr(factoryArr(10));
    }
    public static int[] [] factoryArr(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1){
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //задание 5
    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
*/
        //задание 6
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));

    }

    public static boolean checkBalance(int[] arr){
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        if (summ % 2 != 0){
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < summ / 2){
            sumLeft +=arr[i];
            i++;
        }
        return sumLeft == summ / 2;
    }



}