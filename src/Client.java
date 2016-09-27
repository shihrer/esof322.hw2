import java.util.Random;
import java.util.Scanner;

/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class Client {
    private static Random rand = new Random();

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number for the math software you want to select.");
        System.out.println("\t1. Mathematica");
        System.out.println("\t2. MTool");
        System.out.println("\t3. MyMath");
        int selection = reader.nextInt();

        MathSoftware mathSW;
        switch(selection){
            case 1:
                System.out.println("\nMathematica software selected.");
                mathSW = new Mathematica();
                break;
            case 2:
                System.out.println("\nMTool software selected.");
                mathSW = new MTool();
                break;
            case 3:
                System.out.println("\nMyMath software selected.");
                mathSW = new MyMath();
                break;
            default:
                System.out.println("\nNo software selected.");
                mathSW = new MathSoftware();
                break;
        }

        System.out.print("Enter number of elements for array: ");
        int inputSize = reader.nextInt();
        int[] unsorted = new int[inputSize];
        // Create random array.
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = rand.nextInt(inputSize + 1) + 1;
        }
        System.out.println("\nUnsorted Array");
        System.out.print("\t");
        printArray(unsorted);

        int[] sorted = mathSW.sortArray(unsorted.clone());
        System.out.println("Sorted Array");
        System.out.print("\t");
        printArray(sorted);


        System.out.println("\nEnter a value for the sorting algorithm to switch to.");
        System.out.println("\t1. Insertion Sort");
        System.out.println("\t2. Merge Sort");
        System.out.println("\t3. Bubble Sort");
        int sortSelection = reader.nextInt();

        switch(sortSelection){
            case 1:
                mathSW.setSortStrategy(new InsertionSort());
                break;
            case 2:
                mathSW.setSortStrategy(new MergeSort());
                break;
            case 3:
                mathSW.setSortStrategy(new BubbleSort());
                break;
        }
        // Create random array.
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = rand.nextInt(inputSize + 1) + 1;
        }
        System.out.println("\nUnsorted Array");
        System.out.print("\t");
        printArray(unsorted);

        int[] sorted2 = mathSW.sortArray(unsorted.clone());
        System.out.println("Sorted Array");
        System.out.print("\t");
        printArray(sorted);
    }

    private static void printArray(int[] input){
        System.out.print("Array: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if(i != input.length - 1)
                System.out.print(", ");
        }
        System.out.print("\n");
    }
}
