public interface ProduitsRefrigerables {

    double getTemperature();

//Calcule pour le temperature
    default String etatTemperature() {

        if (getTemperature()< 0) {
            return "Produit congelé";
        } else if (getTemperature() < 15) {
            return "Réfrigéré";
        } else {
            return "Conserver à l'air frais";
        }
    }
}
