public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        AccessControlService accessControlService = AccessControlService.getInstance();

        // Create users
        User user1 = new User("user1");
        User user2 = new User("user2");

        // Create and add unprotected document
        RealDocument doc1 = new RealDocument("doc1", "2023-10-01", "Unprotected Content");
        library.addDocument(doc1);

        // Create and add protected document
        library.addProtectedDocument("doc2", "2023-10-02", "Protected Content");
        accessControlService.allowAccess("doc2", "user1");

        // Access documents
        try {
            System.out.println("User1 accessing doc1: " + library.getDocument("doc1").getContent(user1));
            System.out.println("User1 accessing doc2: " + library.getDocument("doc2").getContent(user1));
            System.out.println("User2 accessing doc2: " + library.getDocument("doc2").getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Tämä luokka sisältää pääohjelman,
// joka demonstroi järjestelmän toimintaa eri käyttäjien ja dokumenttien kanssa.