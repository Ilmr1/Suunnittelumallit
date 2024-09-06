package components;

public class Organization {
    private OrganizationComponent root;

    public Organization(OrganizationComponent root) {
        this.root = root;
    }

    public double getTotalSalary() {
        return root.getSalary();
    }

    public void printStructure() {
        StringBuilder builder = new StringBuilder();
        root.printStructure(builder, "");
        System.out.println(builder.toString());
    }
}