import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n < 1) {
            System.out.print("Enter a positive number for array size: ");
            n = scan.nextInt();
        }

        int[] array = new int[n];

        int indexCounter = 0;
        for (int i = 0; i <= array.length - 1; i++) {

            indexCounter++;
            System.out.print("Enter integer " + indexCounter + ": ");
            int value = scan.nextInt();
            array[i] = value;
        }

        System.out.println("You entered " + Arrays.toString(array));
        System.out.println();

        int min = array[0];
        int max = array[0];
        double total = 0;
        for (int i = 0; i <= array.length - 1; i++) {

            total += array[i];
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }

        }



        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
        System.out.println("Average: " + total / n);
        System.out.println();
        System.out.println("Elements greater than average: ");
        for(int i = 0; i <= array.length-1; i++){
            if (array[i] > total/n){
               System.out.println(array[i]);
            }

        }
        System.out.println("Elements greater than 2: ");
        for(int i = 0; i <= array.length-1; i++){
            if (array[i] > 2){
                System.out.println(array[i]);
            }

        }
        System.out.println("Elements in reverse order: ");
        for(int i = array.length-1 ; i >= 0; i--){
            System.out.println(array[i]);

        }

    }
}