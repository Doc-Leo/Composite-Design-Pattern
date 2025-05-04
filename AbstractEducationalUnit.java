import java.util.ArrayList;
import java.util.List;
public abstract class AbstractEducationalUnit implements EducationalComponent {
    protected String name;
    protected List<EducationalComponent> components = new ArrayList<>();
    
    public AbstractEducationalUnit(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalComponent component : components) {
            count += component.getStudentCount();
        }
        return count;
    }
    
    @Override
    public double calculateBudget() {
        double totalBudget = 0;
        for (EducationalComponent component : components) {
            totalBudget += component.calculateBudget();
        }
        return totalBudget;
    }
    
    @Override
    public void add(EducationalComponent component) {
        components.add(component);
    }
    
    @Override
    public void remove(EducationalComponent component) {
        components.remove(component);
    }
    
    protected void displayComponentDetails(int depth) {
        for (EducationalComponent component : components) {
            String indent = "  ".repeat(depth);
            System.out.print(indent);
            component.displayDetails();
        }
    }
}