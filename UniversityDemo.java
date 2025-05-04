
public class UniversityDemo {
    public static void main(String[] args) {
        
        College newEraUniversity = new College("New Era University");
        
        
        College collegeOfEngineering = new College("College of Engineering");
        College collegeOfBusiness = new College("College of Business");
        
       
        Department computerScience = new Department("Computer Science Department", "Software Development");
        Department informationTech = new Department("Information Technology Department", "Network Infrastructure");
        
        
        Department accounting = new Department("Accounting Department", "Financial Analysis");
        Department management = new Department("Management Department", "Business Administration");
        
       
        Teacher javaTeacher = new Teacher("Dr. James Smith", "Java Programming", 75000);
        Teacher pythonTeacher = new Teacher("Prof. Maria Garcia", "Python Programming", 70000);
        
        
        Teacher networkTeacher = new Teacher("Dr. Robert Johnson", "Network Security", 72000);
        
        
        Teacher accountingTeacher = new Teacher("Prof. Susan Lee", "Financial Accounting", 68000);
        
        
        Teacher managementTeacher = new Teacher("Dr. William Chen", "Strategic Management", 71000);
        
        
        Student cs1 = new Student("John Doe", "CS001", 15000);
        Student cs2 = new Student("Jane Smith", "CS002", 15000);
        Student cs3 = new Student("Alex Johnson", "CS003", 15000);
        
      
        Student it1 = new Student("Emily Davis", "IT001", 14500);
        Student it2 = new Student("Michael Brown", "IT002", 14500);
        
      
        Student acct1 = new Student("Jessica Wilson", "AC001", 13500);
        Student acct2 = new Student("Daniel Taylor", "AC002", 13500);
        
       
        Student mgmt1 = new Student("Sarah Martinez", "MG001", 13000);
        
        
        collegeOfEngineering.add(computerScience);
        collegeOfEngineering.add(informationTech);
        
        collegeOfBusiness.add(accounting);
        collegeOfBusiness.add(management);
       
        computerScience.add(javaTeacher);
        computerScience.add(pythonTeacher);
        informationTech.add(networkTeacher);
        accounting.add(accountingTeacher);
        management.add(managementTeacher);
        
        
        computerScience.add(cs1);
        computerScience.add(cs2);
        computerScience.add(cs3);
        informationTech.add(it1);
        informationTech.add(it2);
        accounting.add(acct1);
        accounting.add(acct2);
        management.add(mgmt1);
        
       
        newEraUniversity.add(collegeOfEngineering);
        newEraUniversity.add(collegeOfBusiness);
        
       
        System.out.println("===== UNIVERSITY STRUCTURE =====");
        newEraUniversity.displayDetails();
        
       
        System.out.println("\n===== COLLEGE OF ENGINEERING DETAILS =====");
        collegeOfEngineering.displayDetails();
        
        
        System.out.println("\n===== COMPUTER SCIENCE DEPARTMENT DETAILS =====");
        computerScience.displayDetails();
        
        System.out.println("\n===== SUMMARY INFORMATION =====");
        System.out.println("Total students in university: " + newEraUniversity.getStudentCount());
        System.out.println("Total budget for university: $" + newEraUniversity.calculateBudget());
        System.out.println("Total students in College of Engineering: " + collegeOfEngineering.getStudentCount());
        System.out.println("Total budget for College of Engineering: $" + collegeOfEngineering.calculateBudget());
        System.out.println("Total students in Computer Science: " + computerScience.getStudentCount());
        System.out.println("Total budget for Computer Science: $" + computerScience.calculateBudget());
    }
}