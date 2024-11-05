// File-luokka edustaa tiedostoa, jolla on nimi ja koko (megatavuina)
public class File implements FileSystemElement {
    private final String name;
    private final int size; // koko megatavuina

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
