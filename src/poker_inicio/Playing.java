/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker_inicio;


import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author aristides
 */
public class Playing extends javax.swing.JFrame {

    /**
     * Creates new form Playing
     */
    public Playing() {
        initComponents();
    }
    
    
    @SuppressWarnings("empty-statement")
            
            
void validarJuego (int [] vector) { 
    int n=0;
    int contador = 0;
     for (int i = 0; i<vector.length;i++){
         contador ++;
         switch (vector[i]){
         
                 case 4: 
                     if(i==0){
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                      BaFullJ1(n);
                     }
                      else{    
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                      BaFullJ2(n);                     
                      }     
                     break;
                 case 3:
                     if(i==0){
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                      BaPokerJ1(n);
                     }
                      else{    
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                      BaPokerJ2(n);                     
                      }
                     break;
                 case 1:
                     if(i==0){
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                      BaEscRealJ1(n);
                     }
                      else{    
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                       System.out.println("valor jugador # 2  es "+n);
                      BaEscRealJ2(n);                     
                      }
                     break;
                 case 5: 
                     if(i==0){
                      Random carAle1 = new Random();
                      n = 1 + carAle1.nextInt(4);
                      BaColorJ1(n);  
                      }
                      else{    
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                      BaColorJ2(n); 
                      
                      }
                     break;
                 case 2: 
                     if(i==0){
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);                        
                      BaEsColorJ1(n);
                     }
                      else{    
                      Random carAle = new Random();
                      n = 1 + carAle.nextInt(4);
                      BaEsColorJ2(n);                     
                      }
                     break;                     
                     }
     }
     
     if (contador == 2){
         int num1, num2, band1=0,band2=0, band3=0;
         num1 = vector[0];
         num2 = vector[1];
         setVisible(true);
         if(num1==1){textJ1.setText("Mano de Escalera Real");}
         if(num1==2){textJ1.setText("Mano de Escalera de Color");}
         if(num1==3){textJ1.setText("Mano de Poker");}
         if(num1==4){textJ1.setText("Mano de Full House");}
         if(num1==5){textJ1.setText("Mano de Color");} 
         if(num2==1){textJ2.setText("Mano de Escalera Real");}
         if(num2==2){textJ2.setText("Mano de Escalera de Color");}
         if(num2==3){textJ2.setText("Mano de Poker");}
         if(num2==4){textJ2.setText("Mano de Full House");}
         if(num2==5){textJ2.setText("Mano de Color");}
                 
               
               
         // definir ganador con escalera real
         if((num1==1) && (num2 != num1) ){
             text.setText("1 con la mano Escalera Real "); band1=1;
           }           
          if((num2==1) && (num1 != num2) ){
             text.setText("2 con la mano Escalera Real ");band1=1;
            }
         
          
           // definir ganador con escalera de color
          if((num1==2) && (num2 != num1) && (band1==0) ){
             text.setText("1 con la mano Escalera de Color");band2=1;
            }
               if((num2==2) && (num1 != num2) && (band1==0) ){
                text.setText("2 con la mano Escalera de Color ");band2=1;
               }                     
           // definir ganador con poker
           if((num1==3) && (num2 != num1) && (band1==0)&&(band2==0) ){
             text.setText("1 con la mano Poker");band3=1;
             System.out.println("valor de band1 : "+band1);
             System.out.println("valor de band2 : "+band2);
             }
            if((num2==3) && (num1 != num2) && (band1==0)&&(band2==0) ){
             text.setText("2 con la mano Poker ");band3=1;
                System.out.println("valor de band1 : "+band1);
                System.out.println("valor de band2 : "+band2);
            }            
               // definir ganador con fullhose
           if((num1==4) && (num2 != num1) && (band1==0)&&(band2==0) ){
             text.setText("1 con la mano Fullhouse");band3=1;
             System.out.println("valor de band1 : "+band1);
             System.out.println("valor de band2 : "+band2);
             System.out.println("valor de band3 : "+band3);
             }
            if((num2==4) && (num1 != num2) && (band1==0)&&(band2==0)&&(band3==0)){
             text.setText("2 con la mano Fullhouse ");
                System.out.println("valor de band1 : "+band1);
                System.out.println("valor de band2 : "+band2);
                System.out.println("valor de band3 : "+band3);
            }        
           // empate tecnico
           if (num1 == num2)
            {
             text.setText(" empate tecnico ");
            }         
     }
}

            
    
    void BaEscRealJ1(int n){
        if(n==1){ // escalera real trebol
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/10c.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/Jc.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/Qc.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/Kc.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/Ac.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/10.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/J.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/Q.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/K.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/A.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/Jb.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/Qb.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/Kb.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/Ab.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/10a.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/Ja.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/Qa.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/Ka.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/Aa.jpg"))); 
        }
    }
        void BaEscRealJ2(int n){
        if(n==1){ // escalera real trebol
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/10c.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/Jc.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/Qc.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/Kc.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Ac.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/10.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/J.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/Q.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/K.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/A.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/Jb.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/Qb.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/Kb.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Ab.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/10a.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/Ja.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/Qa.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/Ka.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Aa.jpg"))); 
        }
    }
   
    void BaPokerJ1(int n){
        if(n==1){ // escalera real trebol
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/10.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/10a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/10c.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/Ac.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/6.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/6a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/6b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/6c.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/8c.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/4.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/4a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/4b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/4c.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/J.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/Ja.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/Jb.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/Jc.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/4a.jpg")));
        }
    }
        void BaPokerJ2(int n){
        if(n==1){ // escalera real trebol
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/2.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/2a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/2b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/2c.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Ac.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/3.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/3a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/3b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/3c.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/8c.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/9.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/9a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/9b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/9c.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/5.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/5a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/5b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/5c.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Aa.jpg")));
        }
    }
            void BaColorJ1(int n){
        if(n==1){ // escalera real trebol
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/10c.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/8c.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/2c.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/5c.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/6c.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/10.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/8.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/5.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/4.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/9.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/Jb.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/Kb.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/8b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/9b.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/2b.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/2a.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/4a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/6a.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/8a.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/Ka.jpg"))); 
        }
    }
         void BaColorJ2(int n){
        if(n==1){ // escalera real trebol
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/3c.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/6c.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/Qc.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/Kc.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/5c.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/10.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/6.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/8.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/K.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/4.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/6b.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/8b.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/9b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/2b.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/5b.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/10a.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/Ja.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/6a.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/3a.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/2a.jpg"))); 
        }
    }
            void BaEsColorJ1(int n){
        if(n==1){ // escalera real trebol
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/7c.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/8c.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/9c.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/10c.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/Jc.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/2.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/3.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/4.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/5.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/6.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/3b.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/4b.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/5b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/6b.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/7b.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/2a.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/3a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/4a.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/5a.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/6a.jpg"))); 
        }
    }
         void BaEsColorJ2(int n){
        if(n==1){ // escalera real trebol
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/2c.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/3c.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/4c.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/5c.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/6c.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/9.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/10.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/J.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/Q.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/K.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/7b.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/8b.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/9b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Jb.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/7a.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/8a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/9a.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/10a.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Ja.jpg"))); 
        }
    }     
             void BaFullJ1(int n){
        if(n==1){ // escalera real trebol
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/2.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/2a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/2b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/6.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/6c.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/3.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/3a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/3b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/8.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/8c.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/9.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/9a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/9b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/7a.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/7b.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/picture/5.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/picture/5a.jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/picture/5b.jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/picture/Ac.jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/picture/Aa.jpg")));
        }
    }
        void BaFullJ2(int n){
        if(n==1){ // escalera real trebol
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/4.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/4a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/4b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/Qc.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Qb.jpg")));
        }
        if(n==2){ // escalera real corazones
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/10.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/10a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/Kc.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/Ka.jpg")));
        }
        if(n==3){  // escalera real espadas
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/9.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/9a.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/9b.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/10c.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/10b.jpg")));
        }
        if(n==4){ // escalera real diamantes
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/picture/Q.jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/picture/Qa.jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/picture/Qb.jpg")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/picture/4c.jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/picture/4a.jpg")));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        textJ1 = new javax.swing.JLabel();
        textJ2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel11.setText("El Jugador ganador es el #");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel12.setText("Mano Jugador # 2");

        jLabel13.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel13.setText("Mano Jugador # 1");

        text.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        text.setText("XXXXX");

        textJ1.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        textJ1.setText("XXXXXXX");

        textJ2.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        textJ2.setText("XXXXXXX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(55, 55, 55)
                                .addComponent(textJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel12)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                                    .addComponent(textJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textJ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textJ2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Playing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Playing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Playing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Playing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Playing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel text;
    private javax.swing.JLabel textJ1;
    private javax.swing.JLabel textJ2;
    // End of variables declaration//GEN-END:variables
}
