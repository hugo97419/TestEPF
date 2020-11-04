/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4_fontaine_royer;

/**
 *
 * @author Hugo
 */
public class joueur {
 String nom;
 String Couleur;
 int ListeJetons [] = new int[21];
 int nombreDesintegrateurs;
 int nombreJetonsRestant;

public joueur(String unNom) {
 nom = unNom;
}

public void affecterCouleur(String saCouleur) {
    Couleur = saCouleur;
}
    
public boolean ajouterJeton(int jeton) {
    if (nombreJetonsRestant < 21) {
        ListeJetons[nombreJetonsRestant] = jeton;
        return true;
    } else {
     
    return false;
    }
}
public void obtenirDesintegrateur (){
   nombreDesintegrateurs++; 
}
public void utiliserDesintegrateur (){
    if (nombreDesintegrateurs>0){
        nombreDesintegrateurs--;
        System.out.println("Désintégrateur utilisé, reste "+nombreDesintegrateurs+"desintégrateur ");
} else { 
    System.out.println("Plus de désintégrateur disponible, tu joues à quoi là ?");
}
}
}