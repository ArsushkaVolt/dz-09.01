import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        Sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void Sort(int[] array){


        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minIndex]) {
                    minIndex = j;

                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }

    }
}