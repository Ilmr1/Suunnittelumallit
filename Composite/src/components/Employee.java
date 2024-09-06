package components;

public class Employee implements OrganizationComponent {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printStructure(StringBuilder builder, String indent) {
        builder.append(indent).append("<Employee name=\"").append(name).append("\" salary=\"").append(salary).append("\"/>\n");
    }
}