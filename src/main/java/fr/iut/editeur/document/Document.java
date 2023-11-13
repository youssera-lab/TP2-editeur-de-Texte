package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String toUpper = texte.substring(start, end).toUpperCase();
        remplacer(start, end, toUpper);
    }

    public void effacer(int start,int end){
        remplacer(start,end,"");
    }
    public void clear(){
        texte="";
    }

    /**
     * Description de la méthode
     * @param start correspondant au debut de l'index où insérer la chaine
     * @param chaine correspondant à la chaine à insérer
     */
    public void inserer(int start,String chaine){
        if (start >= 0 && start <= texte.length()) {
            String debutTexte = texte.substring(0, start);
            String finTexte = texte.substring(start);
            texte = debutTexte + chaine + finTexte;
        } else {
            System.out.println("Index invalide : " + start);
        }
    }
}
