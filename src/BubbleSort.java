/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
class BubbleSort implements SortStrategy {
    public int[] mathSort(int[] input) {
        return this.bubbleSort(input);
    }

    private int[] bubbleSort(int[] input){
        for(int i = 0; i < input.length - 1; i++){
            for(int j=0; j < input.length - (1 + i); j++) {
                if (input[j] > input[j + 1]) {
                    //swap
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
}
