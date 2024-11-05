public interface Document {
    String getIdentifier();
    String getCreationDate();
    String getContent(User user) throws AccessDeniedException;
}

//Tämä rajapinta määrittelee metodit, joita dokumenttien tulee toteuttaa.
// Metodit ovat getIdentifier, getCreationDate ja getContent.
// Metodi getContent heittää AccessDeniedException-tyyppisen poikkeuksen, jos käyttäjällä ei ole oikeutta dokumenttiin.
// Rajapinta on osa Proxy-suunnittelumallia. Rajapinta on toteutettu luokassa RealDocument