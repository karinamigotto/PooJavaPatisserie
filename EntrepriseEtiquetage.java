import java.util.List;

public class EntrepriseEtiquetage<T extends Produit> {
    private String nomEntreprise;

    public EntrepriseEtiquetage(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public void etiqueterProduits(List<T> produits) {
        for (T produit : produits) {
            Etiquette etiquette = new Etiquette();
            etiquette.setNomProduit(produit.getNom());
            etiquette.setNomPatisserie("Nom de la patisserie");
            etiquette.setSiteWeb("www.patisserie.com");
            etiquette.setCoordonnees("Adresse de la patisserie");

            produit.setEtiquette(etiquette);
        }
    }
}
