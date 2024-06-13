
 // La classe ConfitDeCanard représente un produit spécifique, le confit de canard, avec ses caractéristiques de conservation.

import java.time.LocalDate;
import java.time.Period;

public class ConfitDeCanard implements DureeDeConservation {
    private String nom; // Le nom du produit
    private int dureeConservation; // La durée de conservation en jours
    private LocalDate dateMiseEnConserve; // La date de mise en conserve
    private LocalDate dateFinValidite; // La date de fin de validité



    public ConfitDeCanard(String nom, int dureeConservation, LocalDate dateMiseEnConserve, LocalDate dateFinValidite) {
        this.nom = nom;
        this.dureeConservation = dureeConservation;
        this.dateMiseEnConserve = dateMiseEnConserve;
        this.dateFinValidite = dateFinValidite;
    }


    @Override
    public Period calculateConservationDuration(LocalDate conservationDate, LocalDate expirationDate) {
        return Period.between(conservationDate, expirationDate);
    }

    @Override
    public String toString() {
        return "ConfitDeCanard: " +
                "Nom: " + nom +
                ", Durée de conservation: " + dureeConservation + " jours" +
                ", Date mise en conserve: " + dateMiseEnConserve +
                ", Date fin validité: " + dateFinValidite;
    }
}
