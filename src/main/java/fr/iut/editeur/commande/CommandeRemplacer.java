package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {
    public CommandeRemplacer(Document document, String[] parameters) {super(document, parameters);}

    @Override
    public void executer() {

        if(parameters.length < 3) {
            System.err.println("Format attendu : ajouter;debut;fin;chaine");
            return;
        }

        int debut = Integer.parseInt(parameters[1]);
        int fin=Integer.parseInt(parameters[2]);
        String remplacement=parameters[3];
        this.document.remplacer(debut,fin,remplacement);
        super.executer();
    }
}
