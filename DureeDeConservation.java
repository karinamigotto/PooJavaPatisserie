import java.time.LocalDate;
import java.time.Period;
//j'ai utilisé une interface pour calculer de DureedeConservation pour tous les produits
public interface DureeDeConservation {
    default Period calculateConservationDuration(LocalDate conservationDate, LocalDate expirationDate) {
        return Period.between(conservationDate, expirationDate);
    }
}
