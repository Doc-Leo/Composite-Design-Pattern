
public class College extends AbstractEducationalUnit {
    public College(String name) {
        super(name);
    }
    
    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        System.out.println("  Student Count: " + getStudentCount());
        System.out.println("  Budget: $" + calculateBudget());
        System.out.println("  Components:");
        displayComponentDetails(2);
    }
}