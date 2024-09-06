package components;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        this.children.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        this.children.remove(component);
    }

    @Override
    public double getSalary() {
        return children.stream().mapToDouble(OrganizationComponent::getSalary).sum();
    }

    @Override
    public void printStructure(StringBuilder builder, String indent) {
        builder.append(indent).append("<Department name=\"").append(name).append("\">\n");
        for (OrganizationComponent child : children) {
            child.printStructure(builder, indent + "  ");
        }
        builder.append(indent).append("</Department>\n");
    }
}