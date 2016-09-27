/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class Mathematica extends MathSoftware {
    public Mathematica(){
        this.setSortStrategy(new InsertionSort());
    }
}
