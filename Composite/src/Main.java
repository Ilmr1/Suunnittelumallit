import components.Department;
import components.Employee;
import components.Organization;

public class Main {
    public static void main(String[] args) {
        Department root = new Department("Head Office");
        Department sales = new Department("Sales");
        Department development = new Department("Development");

        Employee emp1 = new Employee("Pekka", 55000);
        Employee emp2 = new Employee("Jari", 62000);
        Employee emp3 = new Employee("Samu", 70000);

        root.add(sales);
        root.add(development);
        sales.add(emp1);
        development.add(emp2);
        development.add(emp3);

        Organization organization = new Organization(root);

        System.out.println("Total Salary: " + organization.getTotalSalary());
        organization.printStructure();
    }
}