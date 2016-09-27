/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class MTool implements SortStrategy {
    @Override
    public int[] mathSort(int[] input) {
        return mergeSort(input);
    }

    private int[] mergeSort(int[] input){
        return new int[0];
    }
}
