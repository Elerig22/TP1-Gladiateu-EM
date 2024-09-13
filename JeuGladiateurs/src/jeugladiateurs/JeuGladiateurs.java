package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage personage1 = new Personnage("Bob le malchanceux",15, 15, 70, 15);
    Personnage personage2 = new Personnage("Igor l'empaleur",25, 5, 100, 30);
    
    
    
    // </editor-fold>

    
    affichage.affichageDebutCombat();
    
    
    
        while (personage1.getPointDeVie()> 0 && personage2.getPointDeVie()>0) {
            tour.afficheTour();
            personage1.setNewInitiative();
            personage2.setNewInitiative();
    
        for (int i = 0; i <= 100; i++) {
            if (personage1.getInitiative() == i) {
                personage1.frappePersonnage(personage2);
            }
            if (personage2.getInitiative() == i) {
                personage2.frappePersonnage(personage1);
            }
        }
    affichage.afficherSeparateurInfosPerso();
    personage1.afficherInfoPerso();
    personage2.afficherInfoPerso();
    tour.augmenteTour();
    affichage.afficherSeparateurTour();
            
        }
    
    
        
        
    
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    // TODO : Afficher le message du début du combat
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

    
}
