/**
 * Component interface in the Composite pattern
 * Represents any educational unit in the university
 */
public interface EducationalComponent {
    /**
     * Returns the name of the educational component
     */
    String getName();
    
    /**
     * Returns the number of students in this component and all its children
     */
    int getStudentCount();
    
    /**
     * Calculates the budget for this component
     * Budget = sum of positive values (teacher salaries) - sum of negative values (student tuition)
     */
    double calculateBudget();
    
    /**
     * Displays details of this component
     */
    void displayDetails();
    
    /**
     * Adds a component to this component if it's a composite
     */
    void add(EducationalComponent component);
    
    /**
     * Removes a component from this component if it's a composite
     */
    void remove(EducationalComponent component);
}