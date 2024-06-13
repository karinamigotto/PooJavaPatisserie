import java.time.LocalDate;
import java.time.Period;

public class ConfitureGeleeDeSaison implements DureeDeConservation {
    private String nom;
    private int dureeConservation;
    private LocalDate dateMiseEnConserve;
    private LocalDate dateFinValidite;

    public ConfitureGeleeDeSaison() {
        this.nom = nom;
        this.dureeConservation = dureeConservation;
        this.dateMiseEnConserve = dateMiseEnConserve;
        this.dateFinValidite = dateFinValidite;
    }

    //implementer de methods pour les produits locaux
    @Override
    public Period calculateConservationDuration(LocalDate conservationDate, LocalDate expirationDate) {
        return Period.between(conservationDate, expirationDate);
    }
    @Override
    public String toString() {
        return "ConfitureGeléeDeSaison: " +
                "Nom: " + nom +
                ", Durée de conservation: " + dureeConservation + " jours" +
                ", Date mise en conserve: " + dateMiseEnConserve +
                ", Date fin validité: " + dateFinValidite;
    }

}
