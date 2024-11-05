// FileSystemVisitor-rajapinta määrittelee vierailumenetelmät tiedostoille ja hakemistoille
public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}