package run_time;

public class Subtract extends Calculate {
    private int num1, num2;
    
    // Constructor for fetching values from the Main class
    Subtract(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Subtracts num2 from num1
    @Override
    void calculate() {
        System.out.println("Subtract: " + (num1 - num2));
    }
}
