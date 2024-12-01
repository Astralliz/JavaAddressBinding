package run_time;

public class Multiply extends Calculate {
    private int num1, num2;
    
    // Constructor for fetching values from the Main class
    Multiply(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Multiplies the numbers
    @Override
    void calculate() {
        System.out.println("Multiply: " + (num1 * num2));
    }
}
