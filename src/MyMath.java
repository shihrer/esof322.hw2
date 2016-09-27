/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class MyMath extends MathSoftware {
    public MyMath(){
        this.setSortStrategy(new BubbleSort());
    }
}
