import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {
    private static final String FILE_NAME = "output.txt";

    public FilePrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public void print(String message) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.print(message);
    }
}