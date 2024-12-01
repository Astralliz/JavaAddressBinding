package run_time;

public class Main {
    public static void main (String[] args) {
        int x = 5;
        int y = 6;
        
        // Objects of classes for calling the methods and passing the variables
        Calculate cal = new Calculate();
        Add add = new Add(x,y);
        Subtract sub = new Subtract(x,y);
        Multiply mul = new Multiply(x,y);
        Divide div = new Divide(x,y);
        
        // Assigns value for the variables in Calculate
        // Passing the variable via constructor isn't allowed for this class so we assign the value manually
        cal.num1 = x;
        cal.num2 = y;
        // Calls the "calculate" method on each classes
        cal.calculate();
        add.calculate();
        sub.calculate();
        mul.calculate();
        div.calculate();
    }
}
