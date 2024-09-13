package jeugladiateurs;

import personnages.Personnage;
import personnages.Mirmillon ;
import personnages.R�tiare ;
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
        Mirmillon personage1 = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15);
        R�tiare personage2 = new R�tiare("Igor l'empaleur", 25, 5, 100, 30);

        // </editor-fold>
        affichage.affichageDebutCombat();
        
        while (personage1.getPointDeVie() > 0 && personage2.getPointDeVie() > 0) {
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
            
            affichage.afficherSeparateurPeso();
            personage1.afficherInfoPerso();
            personage2.afficherInfoPerso();
            tour.augmenteTour();
            affichage.afficherSeparateurTour();
            
        }
        affichage.affichageVictoir(personage1, personage2);

        // <editor-fold defaultstate="collapsed" desc="Affichage pr�-combat">
        // TODO : Afficher les infos de chaque personnage
        // TODO : Afficher le message du d�but du combat
        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="M�canique de combat">
        // TODO : La boucle contenant les �tapes du combat
        // TODO : Apr�s la boucle, afficher le r�sultat du combat
        // </editor-fold>
    }
    
}
