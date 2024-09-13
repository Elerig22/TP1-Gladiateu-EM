/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author 202330169
 */
public class Mirmillon extends Personnage {

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        
    }

    public Mirmillon() {
        
    }
    @Override
    public void setNewInitiative(){
        Random rand = new Random();
       int newIni = rand.nextInt(30 - 0);
       initiative = newIni;
    }
    @Override
    public void frappePersonnage(Personnage personageCible){
          super.frappePersonnage(personageCible);
          
          if (personageCible.getPointDeVie()>0) {
              System.out.println("");
            System.out.println("Bob le malchanceux attaque a nouveau");
           super.frappePersonnage(personageCible);
        } else {
              System.out.println("");
               System.out.println("Bob le malchanceux décapite sont adversaire");
              
        }
           
          
    }
    
    @Override
    public void afficherInfoPerso(){
        super.afficherInfoPerso();
         System.out.println("    classe : Mirmillon");
        
    }
    
}
