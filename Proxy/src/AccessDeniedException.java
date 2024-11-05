public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}

//Tämä luokka edustaa poikkeusta, joka heitetään, kun käyttäjällä ei ole oikeutta päästä dokumenttiin.