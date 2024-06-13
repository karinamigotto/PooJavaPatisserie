//J'ai utilise cette interface pour faire um methode que valide las emballages
public interface ProduitsEmballables {
    default String validerEtatEmballage() {
        if (doitEtreEnveloppe()) {
            return "Produit est bien emballé";
        } else {
            return "Emballage endommagé";
        }
    }

    boolean doitEtreEnveloppe();
    boolean emballageBiodegradable();
    boolean emballageRecyclable();
//Cette methode est pour choisir que produits sont biodegradable et que sont recyclables
    default String emballageRecyclableBiodegradableMessage() {
        if (emballageBiodegradable()) {
            return "Emballage est biodegradable";
        } else if (emballageRecyclable()) {
            return "Emballage est recyclable";
        } else {
            return "";
        }
    }
}

