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
    // <editor-fold defaultstate="collapsed" desc="M�thodes d'affichage">
    public void afficherDebutCombat() {
        // TODO : Afficher le message du d�but du combat, tel que montr� dans l'�nonc�
    }
    
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour � la ligne, suivi d'une ligne d'ast�risques, tel que montr� dans l'�nonc�
    }

    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour � la ligne, suivi du s�parateur "infos personnages", tel que montr� dans l'�nonc�
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montr� dans l'�nonc�
    }
    // </editor-fold>
}