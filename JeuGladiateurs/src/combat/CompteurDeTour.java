package combat;

public class CompteurDeTour {

    int cptrTour;
    // TODO : Mettre vos attributs ici

    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
   
    
    public CompteurDeTour() {
        cptrTour = 1;
        
       
    }
    // </editor-fold>

  
    public int getCptrTour() {
        return cptrTour;
    }

    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }
   
  
    
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Le getter
    // TODO : Le setter
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
         cptrTour ++;
    }

    public void afficheTour() {
       System.out.println("--------------");
       System.out.println("TOUR ACTUEL: "+cptrTour );
       System.out.println("--------------");
    }
    // </editor-fold>
}
