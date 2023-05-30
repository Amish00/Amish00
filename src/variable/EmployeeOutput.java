package variable;

public class EmployeeOutput {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        System.out.println();
        System.out.println("Company Name: " + obj1.companyName);
        System.out.println("Contact Number: " + Employee.contact);
        System.out.println();
        obj1.members();
    }
}
