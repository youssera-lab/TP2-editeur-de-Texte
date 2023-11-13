package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     * Description de la méthode
     * @param name correspondant ua nom de la methode a executer
     * @param document correspondant au document sur lequel on travaille
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        return switch (name) {
            case "ajouter" -> new CommandeAjouter(document, parameters);
            case "remplacer" -> new CommandeRemplacer(document, parameters);
            case "majuscules" -> new CommandeMajuscule(document, parameters);
            case "effacer"-> new CommandeEffacer(document,parameters);
            case "clear"->new CommandeClear(document,parameters);
            case "inserer"-> new CommandeInserer(document,parameters);
            default -> null;
        };
    }

}
