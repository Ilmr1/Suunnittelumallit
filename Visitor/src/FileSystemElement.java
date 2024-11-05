// FileSystemElement-rajapinta toimii tiedostojen ja hakemistojen perustana
public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}