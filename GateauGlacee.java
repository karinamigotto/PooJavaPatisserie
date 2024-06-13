import java.time.LocalDate;
//sous classe por le produit

public class GateauGlacee extends Produit {

    public GateauGlacee(String nom, String codeUnique, double poids, double prix, LocalDate dateMiseEnConserve, LocalDate dateFinValidite, double temperature, Etiquette etiquette) {
        super(nom, codeUnique, poids, prix, dateMiseEnConserve, dateFinValidite, temperature, etiquette);
    }


    @Override
    public String description() {
        return "Gateau Glacee";
    }

    @Override
    public boolean doitEtreEnveloppe() {
        return true;
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


