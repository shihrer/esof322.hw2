import java.util.Arrays;

/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
class MergeSort implements SortStrategy {
    public int[] mathSort(int[] input) {
        System.out.println("Sorting array using merge sort.");
        return this.mergeSort(input);
    }

    private int[] mergeSort(int[] input){
        // Base case
        if(input.length <= 1)
            return input;

        // Divide problem
        int[] leftHalf = Arrays.copyOfRange(input, 0, input.length/2);
        int[] rightHalf = Arrays.copyOfRange(input, input.length/2, input.length);

        // Conquer problem
        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);
        // Return merged results
        return merge(leftHalf, rightHalf);
    }

    private int[] merge(int[] a, int[] b){
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j])
                temp[k++] = a[i++];
            else
                temp[k++] = b[j++];
        }

        while(i < a.length)
            temp[k++] = a[i++];
        while(j < b.length)
            temp[k++] = b[j++];

        return temp;
    }
}
