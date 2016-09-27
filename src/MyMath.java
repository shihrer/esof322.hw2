/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class MyMath implements SortStrategy {
    @Override
    public int[] mathSort(int[] input) {
        return bubbleSort(input);
    }

    private int[] bubbleSort(int[] input) {
        return new int[0];
    }
}
