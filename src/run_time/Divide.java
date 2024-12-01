package run_time;

public class Divide extends Calculate {
    private double num1, num2;
    
    // Constructor for fetching values from the Main class
    // Variables are converted to double for division purposes
    Divide(int num1, int num2){
        this.num1 = (double) num1;
        this.num2 = (double) num2;
    }
    
    // Divides num2 from num1
    @Override
    void calculate() {
        System.out.println("Divide: " + (num1 / num2));
    }
}
