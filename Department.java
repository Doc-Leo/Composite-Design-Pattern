
public class Department extends AbstractEducationalUnit {
    private String focus;
    
    public Department(String name, String focus) {
        super(name);
        this.focus = focus;
    }
    
    public String getFocus() {
        return focus;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("  Focus: " + focus);
        System.out.println("  Student Count: " + getStudentCount());
        System.out.println("  Budget: $" + calculateBudget());
        System.out.println("  Components:");
        displayComponentDetails(2);
    }
}