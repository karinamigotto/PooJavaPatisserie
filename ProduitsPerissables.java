import java.time.LocalDate;

public interface ProduitsPerissables {

    LocalDate getDateFinValidite();

   //Pour calculer l'information de l'expiration
    default boolean estConsommable() {
        LocalDate dateFinValidite = getDateFinValidite();
        LocalDate currentDate = LocalDate.now();
        return !currentDate.isAfter(dateFinValidite);
    }

    // pour founir information si est consomable
    default String etatExpiration() {
        if (estConsommable()) {
            return "Consommable";
        } else {
            return "Produit Expiré, doit être éliminé ";
        }
    }
}
