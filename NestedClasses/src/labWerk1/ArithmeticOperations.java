package labWerk1;

public interface ArithmeticOperations {
    int min();
    int max();
    int sum();
    int product();
    double division();

    void displayAllOperations(ArithmeticOperations ops, String title);
}