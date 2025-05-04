
public class Teacher implements EducationalComponent {
    private String name;
    private String subject;
    private double salary;
    
    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public int getStudentCount() {
        return 0; // Teachers don't count as students
    }
    
    @Override
    public double calculateBudget() {
        return salary; // Teacher contributes positively to budget through salary
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + name);
        System.out.println("  Subject: " + subject);
        System.out.println("  Salary: $" + salary);
    }
    
    @Override
    public void add(EducationalComponent component) {
        throw new UnsupportedOperationException("Cannot add components to a Teacher");
    }
    
    @Override
    public void remove(EducationalComponent component) {
        throw new UnsupportedOperationException("Cannot remove components from a Teacher");
    }
}