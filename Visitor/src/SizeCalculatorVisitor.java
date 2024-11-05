// SizeCalculatorVisitor-luokka laskee kaikkien tiedostojen kokonaiskoon
public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        // Ei toimintoa hakemistoille
    }

    public int getTotalSize() {
        return totalSize;
    }
}
