import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création de l'étiquette par défaut
        Etiquette etiquette = new Etiquette("NomProduit", "Delicious Patisserie", "www.deliciouspatisserie.com", "888 Boul. Lasalle, QC.");

        // Création des différents produits
        PainFrais pain = new PainFrais("Pain", "PA9828", 0.6, 5.99, LocalDate.of(2024, 1, 2), LocalDate.of(2024, 6, 5), 18, etiquette);
        Gateau gateau = new Gateau("Gateau", "GA9829", 0.8, 10.99, LocalDate.of(2024, 1, 2), LocalDate.of(2024, 5, 4), 14, etiquette);
        GateauGlacee gateauGlace = new GateauGlacee("Gateau Glace", "GG9830", 1.5, 20, LocalDate.of(2024, 5, 2), LocalDate.of(2024, 12, 4), -15, etiquette);

        // Ajout des produits à une liste
        List<Produit> produits = new ArrayList<>();
        produits.add(pain);
        produits.add(gateau);
        produits.add(gateauGlace);

        // Création de l'entreprise d'étiquetage
        EntrepriseEtiquetage<Produit> entreprise = new EntrepriseEtiquetage<>("Ma Patisserie");

        // Étiquetage des produits
        entreprise.etiqueterProduits(produits);

        // Affichage des informations sur les produits
        for (Produit produit : produits) {
            System.out.println(produit.toString());
            System.out.println();
        }

        // Calcul des jours de conservation pour des produits locaux
        LocalDate today = LocalDate.now();

        ProduitsTerroirLocale produitTerroirConfitDeCanard = new ProduitsTerroirLocale("Confit de Canard", 365, today.minusDays(30), today.plusDays(335));
        ProduitsTerroirLocale produitTerroirConfiture = new ProduitsTerroirLocale(" Gelée De Saison (Fraises)", 180, today.minusDays(20), today.plusDays(160));

        System.out.println(produitTerroirConfitDeCanard.toString());
        System.out.println();
        System.out.println(produitTerroirConfiture.toString());
    }
}
