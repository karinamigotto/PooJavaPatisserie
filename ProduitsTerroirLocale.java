import java.time.LocalDate;
//ProduitsTerroirLocale est destiné à être une classe de base devant être étendue par des sous-classes.
public class ProduitsTerroirLocale implements DureeDeConservation {
    private String nom;
    private int dureeConservation; // en jours
    private LocalDate dateMiseEnConserve;
    private LocalDate dateFinValidite;
    private Etiquette etiquette; // Add the label

    public ProduitsTerroirLocale(String nom, int dureeConservation, LocalDate dateMiseEnConserve, LocalDate dateFinValidite) {
        this.nom = nom;
        this.dureeConservation = dureeConservation;
        this.dateMiseEnConserve = dateMiseEnConserve;
        this.dateFinValidite = dateFinValidite;
        this.etiquette = new Etiquette("", "Delicious Patisserie avec producteurs locaux", "www.deliciouspatisserie.com", ""); // Assign a label with the name "Produits locaux"
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDureeConservation(int dureeConservation) {
        this.dureeConservation = dureeConservation;
    }

    public void setDateMiseEnConserve(LocalDate dateMiseEnConserve) {
        this.dateMiseEnConserve = dateMiseEnConserve;
    }

    public void setDateFinValidite(LocalDate dateFinValidite) {
        this.dateFinValidite = dateFinValidite;
    }

    public Etiquette getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(Etiquette etiquette) {
        this.etiquette = etiquette;
    }
    //Je utiliser toString pour afficher tout les info dans one locale

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Etiquette: Nom du produit: ").append(etiquette.getNomProduit())
                .append(" (").append(nom).append(")")
                .append(", Nom de la pâtisserie: ").append(etiquette.getNomPatisserie())
                .append(", Site web: ").append(etiquette.getSiteWeb())
                .append(", Coordonnées: ").append(etiquette.getCoordonnees())
                .append("\nDurée de conservation: ").append(dureeConservation).append(" days")
                .append("\nDate mise en conserve: ").append(dateMiseEnConserve)
                .append("\nDate fin validité: ").append(dateFinValidite);
        return sb.toString();
    }

}


