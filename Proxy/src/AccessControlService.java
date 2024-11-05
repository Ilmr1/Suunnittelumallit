import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private final Set<String> allowedAccess;

    private AccessControlService() {
        allowedAccess = new HashSet<>();
    }

    public static synchronized AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void allowAccess(String documentId, String username) {
        allowedAccess.add(documentId + ":" + username);
    }

    public boolean isAllowed(String documentId, String username) {
        return allowedAccess.contains(documentId + ":" + username);
    }
}

//Tämä luokka hallinnoi käyttäjien pääsyoikeuksia dokumentteihin.
// Se on singleton, joten kaikki välityspalvelimet käyttävät samaa instanssia.