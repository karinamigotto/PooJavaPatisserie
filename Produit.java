import java.time.LocalDate;
//"Produit est destiné à être une classe de base devant être étendue par des sous-classes."
abstract public class Produit implements DureeDeConservation, ProduitsEmballables, ProduitsPerissables, ProduitsRefrigerables{
    private String nom;
    private String codeUnique;
    private double poids;
    private double prix;
    private LocalDate dateMiseEnConserve;
    private LocalDate dateFinValidite;
    private double temperature;
    private Etiquette etiquette;

    //Constructor avec parameters

    public Produit(String nom, String codeUnique, double poids, double prix, LocalDate dateMiseEnConserve, LocalDate dateFinValidite, double temperature, Etiquette etiquette) {
        this.nom = nom;
        this.codeUnique = codeUnique;
        this.poids = poids;
        this.prix = prix;
        this.dateMiseEnConserve = dateMiseEnConserve;
        this.dateFinValidite = dateFinValidite;
        this.temperature = temperature;
        this.etiquette = etiquette; // Assigning the parameter to the member variable
    }

//Cette pour utilisation de ToString
    public abstract String description();

    public Etiquette getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(Etiquette etiquette) {
        this.etiquette = etiquette;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTemperature(double temperature){
        this.temperature=temperature;
    }
    public double getTemperature(){
        return temperature;
    }

    public String getCodeUnique() {
        return codeUnique;
    }

    public void setCodeUnique(String codeUnique) {
        this.codeUnique = codeUnique;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public LocalDate getDateMiseEnConserve() {
        return dateMiseEnConserve;
    }

    public void setDateMiseEnConserve(LocalDate dateMiseEnConserve) {
        this.dateMiseEnConserve = dateMiseEnConserve;
    }

    public LocalDate getDateFinValidite() {
        return dateFinValidite;
    }

    public void setDateFinValidite(LocalDate dateFinValidite) {
        this.dateFinValidite = dateFinValidite;
    }

    @Override
    public String validerEtatEmballage() {
        return ProduitsEmballables.super.validerEtatEmballage();
    }

    @Override
    public boolean doitEtreEnveloppe() {
        return false;
    }


    @Override
    public boolean emballageRecyclable() {
        return false;
    }

// Je utiliser toString pour afficher tout les info dans one locale
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Information about ").append(description()).append(":").append("\n");
        if (etiquette != null) {
            sb.append("Etiquette: Nom du produit: ").append(description())
                    .append(", Nom de la pâtisserie: ").append(etiquette.getNomPatisserie())
                    .append(", Site web: ").append(etiquette.getSiteWeb())
                    .append(", Coordonnées: ").append(etiquette.getCoordonnees()).append(".")
                    .append(", ");
        }
        sb.append("Code unique: ").append(codeUnique)
                .append(", Poids: ").append(poids).append(" kg")
                .append(", Prix: C$").append(String.format("%.2f", prix))
                .append(", Date mise en conserve: ").append(dateMiseEnConserve)
                .append(", Date fin validité: ").append(dateFinValidite)
                .append(", ").append(validerEtatEmballage())
                .append(", ").append(emballageRecyclableBiodegradableMessage())
                .append(", ").append(etatExpiration())
                .append(", Température: ").append(temperature).append("C , ")
                .append(etatTemperature());

        return sb.toString();
    }





}


