package run_time;

public class Add extends Calculate {
    private int num1, num2;
    
    // Constructor for fetching values from the Main class
    Add(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Adds both numbers together
    @Override
    void calculate() {
        System.out.println("Add: " + (num1 + num2));
    }
}
