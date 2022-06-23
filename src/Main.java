import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number for array size: ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.print("Enter a positive number for array size: ");
            n = scan.nextInt();
        }

        int[] array = new int[n];

        int indexCounter = 0;
        for (int i = 0; i <= array.length - 1; i++) {

            indexCounter++;
            if (indexCounter < array.length){
                System.out.print("Enter integer " + indexCounter + ": ");
            }else
                System.out.print("Enter integer " + indexCounter + "(" + "FINAL NUMBER" + ")" + ":" );
            array[i] = scan.nextInt();

        }

        System.out.println("You entered " + Arrays.toString(array));
        System.out.println();

        int min = array[0];
        int max = array[0];
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {

            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }

        }
        double avg = (double) sum / n;

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
        System.out.println("Average: " + avg);
        System.out.println();
        System.out.println("Elements greater than average: ");

        for(int i = 0; i <= array.length-1; i++){
            if (array[i] > avg){
               System.out.println(array[i]+ " ");
            }

        }
        System.out.println("Elements greater than 2: ");
        for(int i = 0; i <= array.length-1; i++){
            if (array[i] > array.length-1){
                System.out.println(array[i]+ " ");
            }

        }
        System.out.println("Elements in reverse order: ");
        for(int i = array.length-1 ; i >= 0; i--){
            System.out.println(array[i] + " ");

        }

    }
}