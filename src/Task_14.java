// Необходимо написать программу для сортировки данных массива по возрастанию.
// Использовать пузырьковый метод сортировки.

import java.util.Arrays;
import java.util.Scanner;

public class Task_14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int length;
            System.out.println("Введите размер массива");
            length = scanner.nextInt();

            int[] array = new int[length];

            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите " + i + " элемент массива ");
                array[i] = scanner.nextInt();
            }
            for (int i = array.length-1; i >= 1; i--){
                for (int j = 0; j < i; j++){
                    if(array[j] > array[j+1]){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
}



