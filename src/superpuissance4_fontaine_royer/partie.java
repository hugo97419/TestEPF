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
 
grilleDeJeu.viderGrille(); // L'initialisation de la grille
//Interface de début pour les deux joueurs
Scanner sc = new Scanner(System.in); 
Random rand = new Random();
System.out.println("Pseudo joueur1 : ");
joueur j1 = new joueur(sc.nextLine());
System.out.println("Pseudo joueur2 : ");
joueur j2 = new joueur(sc.nextLine());
Listejoueurs[0]=j1;
Listejoueurs[1]=j2;
attribuerCouleursAuxJoueurs();
// On place les Trous noirs
int limitdesint=0;
for (int k=0; k<5;k++) {
    int ligneTn = rand.nextInt(6);
    int colonneTn = rand.nextInt(7);

    if (grilleDeJeu.cellules[ligneTn][colonneTn].presenceTrouNoir() == false) {
    grilleDeJeu.placerTrouNoir(ligneTn, colonneTn);
    limitdesint++;
    } else {
        k--;
}
} // On place les désintégrateurs
    for (int i=0; i<3;i++) {
    int ligneDesin = rand.nextInt(5);
    int colonneDesin =rand.nextInt(6);
    if (grilleDeJeu.cellules[ligneDesin][colonneDesin].presenceDesintegrateur() == false) {
    grilleDeJeu.placerDesintegrateur(ligneDesin, ligneDesin);
    
    } else {
        i--;
    }
}

System.out.println("B sont des trous noirs");
System.out.println("D sont des désintégrateurs");
grilleDeJeu.afficherGrilleSurConsole();

}
// On crée un menu pour les joueurs
public void menu() { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez une des instructions suivantes : ");
        System.out.println(" 1)Jouer un jeton ");
        System.out.println(" 2) Récupérer un jeton ");
        System.out.println(" 3) Désintégrer un jeton ");
        

 


    }

public void debuterPartie() {
    initialiserPartie();
    menu();
}


}
