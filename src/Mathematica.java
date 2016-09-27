/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class Mathematica implements SortStrategy {
    @Override
    public int[] mathSort(int[] input) {
        return insertionSort(input);
    }

    private int[] insertionSort(int[] input){
        return new int[0];
    }
}
