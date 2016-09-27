/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class MTool extends MathSoftware {
    public MTool(){
        this.setSortStrategy(new MergeSort());
    }
}
