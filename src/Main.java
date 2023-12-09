import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите количество строк массива в диапазона от 1 до 100");
                    for (; ; ) {
                        Scanner scanner = new Scanner(System.in);

                        int rows = scanner.nextInt();
                        if (rows > 1 && rows < 100) {
                            Main main = new Main();
                            main.TriangleArr(rows);
                            break;
                        } else {
                            System.out.println("Введите количество строк массива в диапазона от 1 до 100");

                        }
                    }


    }
    public  void  TriangleArr (int rows) {
        int column = rows + (rows - 1);
        int[][] arr = new int[rows][column];
        Random number = new Random();
        arr [0][arr[0].length/2] = number.nextInt(0,100) +1;
        int FirstRowNumber = 0;
        int LastRowNumber = arr [0].length;
            for (int i = arr.length-1; i > 0; i--) {
            for (int j = FirstRowNumber; j < LastRowNumber; j = j+2) {
                 arr[i][j] = number.nextInt(0,100) +1;
            }
                FirstRowNumber++;
                LastRowNumber--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

             }
}




