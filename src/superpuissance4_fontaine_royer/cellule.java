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
public class cellule {
    public class Cellule {
   jeton CurrentToken;
   boolean BlackHole;
   boolean desintegrateur;
   
public Cellule(){
  CurrentToken=null;
  BlackHole=false;
  desintegrateur=false;
  }
public boolean affecterJeton(jeton Un_jeton){
if (CurrentToken == null){
    CurrentToken=Un_jeton;
    System.out.println("Jeton placé");
    return true;
} else {
    System.out.println("Pas de place ici, réessaie ailleurs");
    return false;
}
}
public jeton recupererJeton(){
    return CurrentToken;
}
public boolean supprimerJeton(){
    if (CurrentToken == null){
    System.out.println("Il n'y a pas de jeton de base");
    return false;
} else {
    CurrentToken=null;
    System.out.println("Le jeton à rejoint son créateur");
    return true;
}       
}
public boolean placerTrouNoir(){
    if (BlackHole==true){
        return false;
    } else {
        BlackHole=true;
        return true;
    }
       
}
    }
}