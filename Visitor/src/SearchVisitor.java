// SearchVisitor-luokka etsii tiedostoja, jotka vastaavat tiettyä hakukriteeriä
import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private final String searchPattern;
    private final List<File> matchingFiles = new ArrayList<>();

    public SearchVisitor(String searchPattern) {
        this.searchPattern = searchPattern;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchPattern)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // Ei toimintoa hakemistoille
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}