/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4_fontaine_royer;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class partie {
joueur Listejoueurs[] = new joueur[2];
joueur joueurCourant;
grille grilleDeJeu = new grille();

public void attribuerCouleursAuxJoueurs(){
        Random coul = new Random();
        boolean alea = coul.nextBoolean();
       
        if (alea==true){
            Listejoueurs[0].PlayerColor="Rouge";
            Listejoueurs[1].PlayerColor="Jaune";
        } else {
            Listejoueurs[1].PlayerColor="Rouge";
            Listejoueurs[0].PlayerColor="Jaune";
        }
}

public void initialiserPartie(){
    grilleDeJeu.viderGrille();
Scanner sc = new Scanner(System.in);
System.out.println("Pseudo joueur1 : ");
joueur j1 = new joueur(sc.nextLine());
System.out.println("Pseudo joueur2 : ");
joueur j2 = new joueur(sc.nextLine());
Listejoueurs[0]=j1;
Listejoueurs[0]=j2;
attribuerCouleursAuxJoueurs();


grilleDeJeu.afficherGrilleSurConsole();
}


public void debuterPartie() {
    initialiserPartie();
}


}
