
public class Student implements EducationalComponent {
    private String name;
    private String studentId;
    private double tuitionFee;
    
    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public double getTuitionFee() {
        return tuitionFee;
    }
    
    @Override
    public int getStudentCount() {
        return 1;
    }
    
    @Override
    public double calculateBudget() {
        return -tuitionFee; 
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Student: " + name);
        System.out.println("  ID: " + studentId);
        System.out.println("  Tuition Fee: $" + tuitionFee);
    }
    
    @Override
    public void add(EducationalComponent component) {
        throw new UnsupportedOperationException("Cannot add components to a Student");
    }
    
    @Override
    public void remove(EducationalComponent component) {
        throw new UnsupportedOperationException("Cannot remove components from a Student");
    }
}