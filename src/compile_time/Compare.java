package compile_time;

public class Compare {
    // Comparing if both int numbers are equal
    public boolean compare(int a, int b) {
        return a == b;
    }
    
    // Comparing if both double numbers are equal
    public boolean compare(double a, double b){
        return a == b;
    }
    
    // Comparing if both texts are equal
    public boolean compare(String a, String b) {
        return a.equals(b);
    }
    
}
