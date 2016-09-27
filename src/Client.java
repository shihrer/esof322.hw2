/*
 * Michael Manning
 * Michael Shihrer
 * esof322.hw2
 * Strategy pattern design example.
 */
public class Client {
    public static void main(String[] args){
        MathSoftware mathSW = new MTool();
        mathSW.setSortStrategy(new InsertionSort());
    }
}
