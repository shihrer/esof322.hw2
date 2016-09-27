/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
class InsertionSort implements SortStrategy {
    public int[] mathSort(int[] input) {
        System.out.println("Sorting array with insertion sort.");
        return insertionSort(input);
    }

    private int[] insertionSort(int[] input){
        // Loop through array and swap
        for(int i = 1; i < input.length; i++){
            int j = i;
            while(j > 0 && input[j-1] > input[j]){
                //swap
                int temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
                j--;
            }
        }
        return input;
    }
}
