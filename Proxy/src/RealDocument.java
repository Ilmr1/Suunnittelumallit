public class RealDocument implements Document {
    private final String identifier;
    private final String creationDate;
    private final String content;

    public RealDocument(String identifier, String creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}

//Tämä luokka toteuttaa Document-rajapinnan ja edustaa todellista dokumenttia, jossa on tunniste, luontipäivämäärä ja sisältö.