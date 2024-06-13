import java.time.LocalDate;
//sous classe por le produit
public class PainFrais extends Produit  {

    public PainFrais(String nom, String codeUnique, double poids, double prix, LocalDate dateMiseEnConserve, LocalDate dateFinValidite, double temperature, Etiquette etiquette) {
        super(nom, codeUnique, poids, prix, dateMiseEnConserve, dateFinValidite, temperature, etiquette);
    }

    @Override
    public String description() {
        return "Pain frais";
    }

    @Override
    public boolean doitEtreEnveloppe() {
        return true; // Pain frais must be wrapped
    }

    @Override
    public boolean emballageBiodegradable() {
        return true; // Pain frais packaging is biodegradable
    }
}
