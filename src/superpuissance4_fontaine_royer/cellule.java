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
   jeton CurrentToken;
   boolean BlackHole;
   boolean desintegrateur;
   
public cellule(){
  CurrentToken=null;
  BlackHole=false;
  desintegrateur=false;
  }
public boolean affecterJeton(jeton Un_jeton){
if (CurrentToken == null){
    CurrentToken=Un_jeton;
    System.out.println("Jeton placÃ©");
    return true;
} else {
    System.out.println("Pas de place ici, rÃ©essaie ailleurs");
    return false;
}
}
public jeton recupererJeton(){
    jeton a=CurrentToken;
    CurrentToken=null;
    return a;
}
public boolean supprimerJeton(){
    if (CurrentToken == null){
    System.out.println("Il n'y a pas de jeton de base");
    return false;
} else {
    CurrentToken=null;
    System.out.println("Le jeton Ã  rejoint son crÃ©ateur");
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

public boolean placerDesintegrateur(){
    if (desintegrateur==true){
        return false;
} else { 
        desintegrateur=true;
        return true;
}
}
public boolean 	presenceTrouNoir(){
       return BlackHole==true;
}
public boolean presenceDesintegrateur(){
    return desintegrateur==true;
}
public String lireCouleurDuJeton(){
    return CurrentToken.PlayerColor;
}
public boolean recupererDesintegrateur(){ // on augmente pas le compteur de desintegrateur du jouruer ?
    if(desintegrateur==true){
        desintegrateur=false;
        System.out.println("DÃ©sintegrateur en poche");
        return true;
} else {
        System.out.println("Il n'y a rien ici");
        return false;
    }
}
public boolean activerTrouNoir(){
    if (BlackHole==true){
        CurrentToken=null;
        BlackHole=false;
        System.out.print("Le trou noir mange ton jeton et s'envole vers d'autres cieux");
        return true;
    } else {
        return false;
    }
}
}