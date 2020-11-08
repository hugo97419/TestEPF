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
public class grille {
    cellule cellules[][]= new cellule[6][7];
  grille() {
        for (int i=0; i<6; i++) {
            for (int j=0; i<7; j++) {
                cellules[i][j] = new cellule();
            }
        }
    }


    public boolean ajouterJetonDansColonne(jeton jEtOn,int cc){
    int a=0;
    for(int i =0;i<7;i++){
        if (cellules[cc][i].CurrentToken==null){
           cellules[cc][i].CurrentToken=jEtOn;
           i=7;
           a=1;
        }
    }return a==1;
}
    
    
   public boolean etreRemplie(){
       int a=0;
for(int i =0; i<6;i++){
           for(int j=0;j<7;j++){
         if (cellules[i][j].CurrentToken != null){
             a++;
         }
           }
}
        return a==42; 
}
   public void 	viderGrille(){
       for(int i =0; i<6;i++){
           for(int j=0;j<7;j++){
         cellules[i][j].CurrentToken = null;
           }
       }
   }
   
   public void afficherGrilleSurConsole(){
       for(int i =0; i<6;i++){
           for(int j=0;j<7;j++){
               if (cellules[i][j].CurrentToken==null){
                   if (cellules[i][j].BlackHole==true){
                       System.out.print("B ");
                   }else{
                   if (cellules[i][j].desintegrateur==true){
                       System.out.print("D ");
                   } else{
                      System.out.print("0 "); 
                   }
               }
           }else{
               System.out.print(""+cellules[i][j].lireCouleurDuJeton()+""); 
               }
       }
           System.out.println("");
   }
   }
   
           
public boolean celluleOccupee(int i,int j){
    return cellules[i][j].CurrentToken != null;
}
public String lireCouleurDuJeton(int i,int j){
    return (cellules[i][j].CurrentToken).PlayerColor;
}
public boolean etreGagnantePourJoueur(joueur Player){
    boolean a=false;
    for (int i = 0 ; i<6 ; i++){
        for (int j = 0 ; j<7 ; j++){
            if (i+3<6){
            if (lireCouleurDuJeton(i,j).equals(Player.PlayerColor) && lireCouleurDuJeton(i+1,j).equals(Player.PlayerColor) && lireCouleurDuJeton(i+2,j).equals(Player.PlayerColor) && lireCouleurDuJeton(i+3,j).equals(Player.PlayerColor));{
                a = true;
            }
            }if (j+3<7){
            if (lireCouleurDuJeton(i,j).equals(Player.PlayerColor) && lireCouleurDuJeton(i,j+1).equals(Player.PlayerColor) && lireCouleurDuJeton(i,j+2).equals(Player.PlayerColor) && lireCouleurDuJeton(i,j+3).equals(Player.PlayerColor)){
                a = true;
            }
            }if (j+3<7&&i+3<6){
            if (lireCouleurDuJeton(i,j).equals(Player.PlayerColor) && lireCouleurDuJeton(i+1,j+1).equals(Player.PlayerColor) && lireCouleurDuJeton(i+2,j+2).equals(Player.PlayerColor) && lireCouleurDuJeton(i+3,j+3).equals(Player.PlayerColor)){
                a = true;
            }
            }          
        }
    }
    return a;
}




public void tasserGrille(int i,int j){
    for (int v=j; v+1<7; v++){
        cellules[i][v]=cellules[i][v+1];
    }
}
public boolean colonneRemplie (int i){
        return cellules[i][6].CurrentToken!=null;
}



public boolean placerTrouNoir(int i,int j){
    if (cellules[i][j].BlackHole==true){
        return false;
    } else {
        cellules[i][j].BlackHole=true;
        return true;
    }
       
}
public boolean supprimerJeton(int i,int j){
    if (cellules[i][j].CurrentToken == null){
    System.out.println("Il n'y a pas de jeton de base");
    return false;
} else {
    cellules[i][j].CurrentToken=null;
    System.out.println("Le jeton Ã  rejoint son crÃ©ateur");
    return true;
}       
}
public jeton recupererJeton(int i,int j){
    jeton a=cellules[i][j].CurrentToken;
    cellules[i][j].CurrentToken=null;
    return a;
}
public boolean placerDesintegrateur(int i,int j){
    if (cellules[i][j].desintegrateur==true){
        return false;
} else { 
        cellules[i][j].desintegrateur=true;
        return true;
}
}
}




