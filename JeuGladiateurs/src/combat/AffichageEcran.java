package combat;

import personnages.Personnage;

public class AffichageEcran {


    
    
    

    public void affichageDebutCombat(){
        System.out.println("\n\n");
        System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>> Que le combat commence !  <<<<<");
        System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
        System.out.println("\n\n");
    }
    
    public void afficherSeparateurPeso(){
        System.out.println("\n");
        System.out.println("----------------");
        System.out.println("INFOS PERSONNAGE");
        System.out.println("----------------");
        
    }
    
    public void afficherSeparateurTour(){
        System.out.println("*******************************");
    }
    
    
    
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        // TODO : Afficher le message du début du combat, tel que montré dans l'énoncé
    }
    
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
    }

    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour à la ligne, suivi du séparateur "infos personnages", tel que montré dans l'énoncé
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montré dans l'énoncé
    }
    // </editor-fold>
}