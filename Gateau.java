import java.time.LocalDate;
//sous classe por le produit


public class Gateau extends Produit {

    public Gateau(String nom, String codeUnique, double poids, double prix, LocalDate dateMiseEnConserve, LocalDate dateFinValidite, double temperature, Etiquette etiquette) {
        super(nom, codeUnique, poids, prix, dateMiseEnConserve, dateFinValidite, temperature, etiquette);
    }


    @Override
    public String description() {
        return "Gateau";
    }

    @Override
    public boolean doitEtreEnveloppe() {
        return false;
    }

    @Override
    public boolean emballageBiodegradable() {
        return false;
    }

    @Override
    public boolean emballageRecyclable() {
        return true;
    }

    @Override
    public String emballageRecyclableBiodegradableMessage() {
        return super.emballageRecyclableBiodegradableMessage();
    }
}


