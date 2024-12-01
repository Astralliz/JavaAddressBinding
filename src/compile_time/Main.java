package compile_time;

public class Main {
    public static void main (String[] args) {
        // Creates an object of the "Compare" class
        Compare comp = new Compare();
        
        // Inserts value on the methods through the object and prints the subsequent boolean values
        System.out.println(comp.compare(5, 5));
        System.out.println(comp.compare("Skrr", "Skrrt"));
        System.out.println(comp.compare(10.5, 10.3));
    }
}
