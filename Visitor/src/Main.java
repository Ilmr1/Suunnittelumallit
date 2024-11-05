// Main-luokka näyttää esimerkkikäytön
public class Main {
    public static void main(String[] args) {
        // Luodaan tiedostot
        File file1 = new File("document.txt", 5);
        File file2 = new File("photo.jpg", 10);
        File file3 = new File("video.mp4", 100);
        File file4 = new File("music.mp3", 50); // Uusi tiedosto

        // Luodaan hakemistot
        Directory root = new Directory("root");
        Directory subDir = new Directory("subDir");

        // Rakennetaan tiedostojärjestelmän rakenne
        root.addElement(file1);
        root.addElement(subDir);
        subDir.addElement(file2);
        subDir.addElement(file3);
        subDir.addElement(file4); // Lisätään uusi tiedosto hakemistoon

        // Käytetään SizeCalculatorVisitor-luokkaa
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Kokonaiskoko: " + sizeCalculator.getTotalSize() + " MB");

        // Käytetään SearchVisitor-luokkaa
        SearchVisitor searchVisitor = new SearchVisitor(".txt"); // Muutetaan hakukriteeri
        root.accept(searchVisitor);
        System.out.println("Vastaavat tiedostot:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }
    }
}