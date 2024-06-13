public class Etiquette {
    private String nomProduit;
    private String nomPatisserie;
    private String siteWeb;
    private String coordonnees;

    public Etiquette() {
    }

    public Etiquette(String nomProduit, String nomPatisserie, String siteWeb, String coordonnees) {
        this.nomProduit = nomProduit;
        this.nomPatisserie = nomPatisserie;
        this.siteWeb = siteWeb;
        this.coordonnees = coordonnees;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getNomPatisserie() {
        return nomPatisserie;
    }

    public void setNomPatisserie(String nomPatisserie) {
        this.nomPatisserie = nomPatisserie;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(String coordonnees) {
        this.coordonnees = coordonnees;
    }
}
