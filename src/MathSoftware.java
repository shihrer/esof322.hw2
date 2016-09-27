/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
class MathSoftware {
    private SortStrategy strategy;

    public void setSortStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    public int[] sortArray(int[] input){
        return this.strategy.mathSort(input);
    }
}
