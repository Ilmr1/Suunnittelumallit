package components;

public interface OrganizationComponent {
    void add(OrganizationComponent component);
    void remove(OrganizationComponent component);
    double getSalary();
    void printStructure(StringBuilder builder, String indent);
}