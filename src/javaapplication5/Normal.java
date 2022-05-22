
package javaapplication5;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javaapplication5.Main;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication5.Easy.c;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Normal<T> extends javax.swing.JFrame {
    InputStream d;
       AudioInputStream ais; 
     Clip clip;
    Settings m=new Settings();
 int secondspassed=4;
Timer Timer=new Timer();
Timer Timer1=new Timer();
 int count1=0;
int count2=0;
 int NumberofRounds=0;
Integer Totaltime=0;
String variable="";
T g;
String Player1="";
String Player2="";
String com="";
String p1="";
 boolean sound1;
 boolean sound2;
    static int c=0;
    URL r =getClass().getResource("/javaapplication5/Photos/rock1.png"); 
     URL p = getClass().getResource("/javaapplication5/Photos/paper.png"); 
      URL s = getClass().getResource("/javaapplication5/Photos/Scissor.png"); 
       URL f = getClass().getResource("/javaapplication5/Photos/fire.png"); 
        URL a = getClass().getResource("/javaapplication5/Photos/air.png"); 
         URL on = getClass().getResource("/javaapplication5/Photos/Sound-on-icon.png"); 
     URL off = getClass().getResource("/javaapplication5/Photos/Sound-off-icon.png"); 
    public Normal() {
        initComponents();
      
         setLocationRelativeTo(null); 
  jButton1.setVisible(false); 
    jButton2.setVisible(false); 
fire.setContentAreaFilled(false);
fire.setFocusPainted(false);
fire.setBorderPainted(false);
paper.setContentAreaFilled(false);
paper.setFocusPainted(false);
paper.setBorderPainted(false);
Secissor.setContentAreaFilled(false);
Secissor.setFocusPainted(false);
Secissor.setBorderPainted(false);
air.setContentAreaFilled(false);
air.setFocusPainted(false);
air.setBorderPainted(false);
Rock.setContentAreaFilled(false);
Rock.setFocusPainted(false);
Rock.setBorderPainted(false);
   jButton4.setVisible(false); 
    jLabel17.setIcon(new ImageIcon(on));
    this.setResizable(false);
   if(jRadioButton1.isSelected()==false){
try{ 
           
         d = getClass().getResourceAsStream("/Music/cathy.wav");
  ais=AudioSystem.getAudioInputStream(d);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
}
else
    clip.stop();       
    }
 public void getValue(String n1,T rounds,boolean m1,boolean m2) {
     sound1=m1;
     sound2=m2;
  if(n1=="a"&&rounds instanceof String){
      variable=n1;
      g=rounds;
       jLabel11.setVisible(false);
   JOptionPane.showMessageDialog(null,"Its your turn,\n Select one of the circular buttons"); 
  NumberofRounds=Integer.parseInt(  (String)  rounds    );
   start(); 
  }

   if(n1=="a"&&rounds instanceof Integer){
       variable=n1;
       g=rounds;
   JOptionPane.showMessageDialog(null,"Its your turn,\n Select one of the circular buttons"); 
Totaltime=(Integer) rounds   ;
  start1();
 start();  
  }
        
if(n1=="b"&&rounds instanceof String){
      variable=n1;
      g=rounds;
       jLabel11.setVisible(false);
        jLabel9.setVisible(false);
       jButton2.setVisible(true);
    JOptionPane.showMessageDialog(null,"In the 2player selection ,each player must press the button finish when they are finished \n chosing and then press button Result after player2 chosing\n considiring that if player2 didnt select \n the programe will make his select like player1 selection ");   
    JOptionPane.showMessageDialog(null,"Its player1 turn Dont peek please!!!\n select one of the circular buttons"); 
  NumberofRounds=Integer.parseInt(  (String)  rounds    );

  }
  if(n1=="b"&&rounds instanceof Integer){
       variable=n1;
       g=rounds;
       jButton2.setVisible(true);
        jLabel9.setVisible(false);
      JOptionPane.showMessageDialog(null,"In the 2player selection ,each player must press the button finish when they are finished \n chosing and then press button Result after player2 chosing\n considiring that if player2 didnt select \n the programe will make his select like player1 selection ");   
    JOptionPane.showMessageDialog(null,"Its player1 turn Dont peek please!!!\n select one of the circular buttons"); 
Totaltime=(Integer) rounds   ;
  start1();

  }
 
      
  } 
    
    
  public void Resultfinal(){
     
     
   
      switch(p1){
       case("ROCK"):
           if(com=="ROCK")
          jLabel10.setText("you Are both equal");
           else if(jLabel8.getText()=="SCISSOR"){
          jLabel10.setText("ROCK smashs SCISSOR ");
          count1++;
           }
             else if(com=="PAPER"){
          jLabel10.setText("PAPER COVERS ROCK ");
          count2++; 
      }
            else if(com=="FIRE"){
          jLabel10.setText("ROCK POUNDS OUT FIRE ");
       count1++;
      }
            else if(com=="AIR"){
          jLabel10.setText("AIR ERODS ROCK ");
       count2++;
      }
            else if(com=="SCISSOR"){
          jLabel10.setText("ROCK SMASHS SCISSOR ");
       count1++;
      }
           
      break;
      case("SCISSOR"):
           if(com=="ROCK"){
          jLabel10.setText("ROCK SMASHS SCISSOR");
           count2++;  
           }
           else if(com=="SCISSOR"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
        
           }
             else if(com=="PAPER"){
          jLabel10.setText("SCISSOR CUTS PAPER ");
          count1++; 
      }
          else if(com=="FIRE"){
          jLabel10.setText("FIRE MELTS SCISSOR ");
       count2++;
      }  
      else if(com=="AIR"){
          jLabel10.setText("SCISSOR SWISH THROUG AIR ");
       count1++;
      }      
           
      break; 
      case("PAPER"):
           if(com=="ROCK"){
          jLabel10.setText("PAPER COVERS ROCK");
           count1++;  
           }
           else if(com=="SCISSOR"){
          jLabel10.setText("SCISSOR CUTS PAPER ");
        count2++;
           }
             else if(com=="PAPER"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
       
      }
        else if(com=="FIRE"){
          jLabel10.setText("FIRE BURNS PAPER ");
       count2++;
      }
         else if(com=="AIR"){
          jLabel10.setText("PAPER FANS AIR ");
       count1++;
      }   
      break; 
      case("FIRE"):
           if(com=="ROCK"){
          jLabel10.setText("ROCK POUNDS OUT FIRE ");
           count2++;  
           }
           else if(com=="SCISSOR"){
          jLabel10.setText(" FIER MELTS SCISSOR  ");
        count1++;
           }
             else if(com=="PAPER"){
          jLabel10.setText("FIRE BURNS PAPER ");
         count1++;
      }
           
         else if(com=="AIR"){
          jLabel10.setText("AIR BLOWS FIRE ");
         count2++;
      }
        
         else if(com=="FIRE"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
        
      }  
           
           
      break;
     case("AIR"):
           if(com=="ROCK"){
          jLabel10.setText("AIR ERODES ROCK ");
           count1++;  
           }
           else if(com=="SCISSOR"){
          jLabel10.setText(" SCISSOR SWISH THROUGH AIR  ");
        count2++;
           }
             else if(com=="PAPER"){
          jLabel10.setText("PAPER FANS AIR ");
         count2++;
      }
           
         else if(com=="FIRE"){
          jLabel10.setText("AIR BLOWS OUT FIRE ");
         count1++;
      }
        
         else if(com=="AIR"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
        
      }  
           
           
      break;
       
      
      
      }
   
     jButton4.setVisible(true);    
      
  }  
  
  
  
  public void Resultfinal(String player1,String player2){
   c=0;
      switch(player1){
       case("ROCK"):
           if(player2=="ROCK")
          jLabel10.setText("you Are both equal");
           else if(player2=="SCISSOR"){
          jLabel10.setText("ROCK smashs SCISSOR ");
          count1++;
           }
             else if(player2=="PAPER"){
          jLabel10.setText("PAPER COVERS ROCK ");
          count2++; 
      }
         if(player2=="FIRE"){
          jLabel10.setText("ROCK POUNDS OUT FIRE ");
           count1++;  
           }
          if(player2=="AIR"){
          jLabel10.setText("AIR ERODS ROCK ");
           count2++;  
           }
      break;
      case("SCISSOR"):
           if(player2=="ROCK"){
          jLabel10.setText("ROCK SMASHS SCISSOR");
           count2++;  
           }
           else if(player2=="SCISSOR"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
        
           }
             else if(jLabel8.getText()=="PAPER"){
          jLabel10.setText("SCISSOR CUTS PAPER ");
          count1++; 
      }
          if(player2=="FIRE"){
          jLabel10.setText("FIRE MELTS SCISSOR ");
           count2++;  
           } 
           if(player2=="AIR"){
          jLabel10.setText("SCISSOR SWISH AIR ");
           count1++;  
           }
             if(player2=="PAPER"){
          jLabel10.setText("SCISSOR CUTS PAPER ");
           count1++;  
           }
      break; 
      case("PAPER"):
           if(player2=="ROCK"){
          jLabel10.setText("PAPER COVERS ROCK");
           count1++;  
           }
           else if(player2=="SCISSOR"){
          jLabel10.setText("SCISSOR CUTS PAPER ");
        count2++;
           }
             else if(player2=="PAPER"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
       
      }
         if(player2=="FIRE"){
          jLabel10.setText("FIRE BURNS PAPER ");
           count2++;  
           }
         if(player2=="AIR"){
          jLabel10.setText("PAPER FANS AIR ");
           count1++;  
           } 
      break; 
     
      case("FIRE"):
           if(player2=="ROCK"){
          jLabel10.setText("ROCK POUNDS OUT FIRE ");
           count2++;  
           }
           else if(player2=="SCISSOR"){
          jLabel10.setText(" FIER MELTS SCISSOR  ");
        count1++;
           }
             else if(player2=="PAPER"){
          jLabel10.setText("FIRE BURNS PAPER ");
         count1++;
      }
           
         else if(player2=="AIR"){
          jLabel10.setText("AIR BLOWS FIRE ");
         count2++;
      }
        
         else if(player2=="FIRE"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
        
      }  
           
           
      break;
     case("AIR"):
           if(player2=="ROCK"){
          jLabel10.setText("AIR ERODES ROCK ");
           count1++;  
           }
           else if(player2=="SCISSOR"){
          jLabel10.setText(" SCISSOR SWISH THROUGH AIR  ");
        count2++;
           }
             else if(player2=="PAPER"){
          jLabel10.setText("PAPER FANS AIR ");
         count2++;
      }
           
         else if(player2=="FIRE"){
          jLabel10.setText("AIR BLOWS OUT FIRE ");
         count1++;
      }
        
         else if(player2=="AIR"){
          jLabel10.setText("YOU ARE BOTH EQUAL ");
        
      }  
           
           
      break;
       
      
      
      }
   
      
  }  
  
 
    
 public void Resultfinal1() {
     c=0;
        m.contain2="Easy"; 
     clip.stop();
      jLabel3.setText("Score: "+Integer.toString( count2));
           jLabel4.setText("Score: "+Integer.toString( count1));
            if(count1>count2)  {
          if(variable=="a"){ 
            if(sound2==false){                
                                 
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Cheering 3-SoundBible.com-1680253418.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
      catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }   
              
              
       JOptionPane.showMessageDialog(null,"Its Over the winner is the player"+"\n"+"Result:  "+count1); 
          }
           if(variable=="b") {
               if (sound2==false) {                
    try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Cheering 3-SoundBible.com-1680253418.wav");
   ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}}
          JOptionPane.showMessageDialog(null,"Its Over the winner is  player1"+"\n"+"Result:  "+count1);   
          
               if (sound2==false) {                
    try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
  ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}}
          JOptionPane.showMessageDialog(null,"and good luck to you player2"+"\n"+"Result:  "+count2);   
           }
       this.setVisible(false);
    count1=0;
    count2=0;
    Totaltime=0;
      jLabel3.setText("");
           jLabel4.setText("");
        Main fd=new Main();
       fd.setVisible(true);
                
       } 
      else if(count1<count2){
          if(variable=="a"){
              if(sound2==false)
            try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
      catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
        
               
       JOptionPane.showMessageDialog(null,"Its Over the winner is the Computer"+"\n"+"Result:  "+count2);
          }
       if(variable=="b"){
           if(sound2==false){
            try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Cheering 3-SoundBible.com-1680253418.wav");
  ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}}
         JOptionPane.showMessageDialog(null,"Its Over the winner is Player2"+"\n"+"Result:  "+count2);  
          
               if (sound2==false) {                
    try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
  ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}}
          JOptionPane.showMessageDialog(null,"and good luck to you player1"+"\n"+"Result:  "+count1);   
       }
       this.setVisible(false);
       count1=0;
    count2=0;
    Totaltime=0;
      jLabel3.setText("");
           jLabel4.setText("");
       Main fd=new Main();
       fd.setVisible(true);
    
       
       }
else  if(count1==count2){
    if(sound2==false)
            try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
      catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
        
        JOptionPane.showMessageDialog(null,"Its Draw"+"\n"+"Result:  "+count1); 
        this.setVisible(false);
count1=0;
    count2=0;
    Totaltime=0;
      jLabel3.setText("");
           jLabel4.setText("");
   Main fd=new Main();
       fd.setVisible(true);     
     
        m.contain2="Easy"; 
     
   }    
 }  
    
    
 public void robot(){
      int random;

  random = (int)(Math.random() * 5+1) ; 
  switch(random){
    case(1):
       com="ROCK";
        jLabel8.setIcon(new ImageIcon(r));
        break;
       case(2):
        com="PAPER";
         jLabel8.setIcon(new ImageIcon(p));
        break; 
       case(3):
      com="SCISSOR";
          jLabel8.setIcon(new ImageIcon(s));
        break;
         case(4):
       com="FIRE";
           jLabel8.setIcon(new ImageIcon(f));
        break;
        case(5):
       com="AIR";
           jLabel8.setIcon(new ImageIcon(a));
        break;
         
        
  }
 }
  public void setPicture(String Player1,String Player2){
      switch(Player1){
        case(  "ROCK"):
        jLabel6.setIcon(new ImageIcon(r));
        break;
       case( "PAPER"     ):
         jLabel6.setIcon(new ImageIcon(p));
        break; 
       case(  "SCISSOR"      ):
          jLabel6.setIcon(new ImageIcon(s));
        break;
         case(  "FIRE"):
           jLabel6.setIcon(new ImageIcon(f));
        break;
        case(   "AIR"   ):
     
           jLabel6.setIcon(new ImageIcon(a));
        break;
            
          
          
          
      }
      
       switch(Player2){
        case(  "ROCK"):
        jLabel8.setIcon(new ImageIcon(r));
        break;
       case( "PAPER"     ):
         jLabel8.setIcon(new ImageIcon(p));
        break; 
       case(  "SCISSOR"      ):
          jLabel8.setIcon(new ImageIcon(s));
        break;
         case(  "FIRE"):
           jLabel8.setIcon(new ImageIcon(f));
        break;
        case(   "AIR"   ):
     
           jLabel8.setIcon(new ImageIcon(a));
        break;
            
          
          
          
      }
       
      
      
      
  }
    

public void start(){
    TimerTask task=new TimerTask() {
    public void run() {
       secondspassed--;
      if (secondspassed>0){
       jLabel9.setText( "Time"+":"+ Integer.toString( secondspassed));
      }
    if(Totaltime==1&&g instanceof Integer) {
         Timer.cancel();  
    
    }  
    if(secondspassed==0){
        jLabel9.setText("Time:0");
  
if(jLabel6.getIcon()==null){
    jLabel6.setIcon(new ImageIcon(r));
p1="ROCK"; 
}
      robot(); 
     Resultfinal(); 
    } }
};
   
    Timer.scheduleAtFixedRate(task, 1000, 1000);  
}  

public void start1(){
    TimerTask task=new TimerTask() {
    public void run() {
      Totaltime--;
      if ( Totaltime>0){
       jLabel11.setText( "Remaining Time:"+"\n"+ Integer.toString( Totaltime));
        jLabel3.setText("Score: "+Integer.toString(count2));
       jLabel4.setText(" Score:"+Integer.toString(count1));
       
      }
    if(Totaltime==1){
        jLabel11.setText("Remaining Time: 0");


Resultfinal1() ;
     
    }
   
    }};
   
    Timer1.scheduleAtFixedRate(task, 1000, 1000);  
}  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        fire = new javax.swing.JButton();
        air = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Rock = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        Secissor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(255, 153, 255));
        jRadioButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton1.setText("MUSIC OFF/ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(730, 10, 170, 27);

        fire.setBackground(new java.awt.Color(255, 204, 204));
        fire.setForeground(new java.awt.Color(255, 153, 153));
        fire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/fire.png"))); // NOI18N
        fire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireActionPerformed(evt);
            }
        });
        jPanel1.add(fire);
        fire.setBounds(180, 240, 120, 110);

        air.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/air.png"))); // NOI18N
        air.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airActionPerformed(evt);
            }
        });
        jPanel1.add(air);
        air.setBounds(510, 380, 130, 110);

        jButton4.setBackground(new java.awt.Color(255, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Next Throw");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(720, 670, 160, 70);

        Rock.setBackground(new java.awt.Color(51, 255, 255));
        Rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/rock1.png"))); // NOI18N
        Rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RockActionPerformed(evt);
            }
        });
        jPanel1.add(Rock);
        Rock.setBounds(370, 140, 110, 100);

        paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/paper.png"))); // NOI18N
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });
        jPanel1.add(paper);
        paper.setBounds(540, 240, 130, 110);

        Secissor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/Scissor.png"))); // NOI18N
        Secissor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecissorActionPerformed(evt);
            }
        });
        jPanel1.add(Secissor);
        Secissor.setBounds(300, 390, 140, 100);

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("Finish");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 260, 110, 60);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 270, 120, 60);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Rock");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 100, 90, 30);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Air");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(560, 350, 80, 40);

        jLabel9.setFont(new java.awt.Font("Andalus", 1, 48)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/42603-hourglass-done-icon.png"))); // NOI18N
        jLabel9.setText("Time:0");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 130, 260, 70);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Fire");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(220, 200, 70, 40);

        jLabel11.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/42603-hourglass-done-icon.png"))); // NOI18N
        jLabel11.setText("Remaining Time:0");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 110, 390, 110);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Scissor");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(330, 350, 100, 30);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 153));
        jLabel15.setText("Paper");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(560, 180, 100, 50);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(510, 510, 110, 120);

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 48)); // NOI18N
        jLabel7.setText("VS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 550, 150, 60);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 500, 110, 140);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(680, 6, 60, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/lkhg.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(150, 510, 770, 120);

        jLabel10.setBackground(new java.awt.Color(51, 0, 255));
        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(220, 640, 660, 100);

        jLabel4.setFont(new java.awt.Font("Urdu Typesetting", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Score:0");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 40, 160, 60);

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Score:0");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(730, 40, 180, 70);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("SRP5");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 10, 190, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/LLLL.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SecissorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecissorActionPerformed

        
         if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
        
        if(variable=="a"){
      p1="SCISSOR";  
   
      jLabel6.setIcon(new ImageIcon(s));
           
       }
       
   if(variable=="b"){
       if(c<1){
       Player1="SCISSOR";
       }
      
       Player2="SCISSOR";
    
  
  }  
            
    }//GEN-LAST:event_SecissorActionPerformed

    private void RockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RockActionPerformed

        if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
        
         if(variable=="a"){
       p1="ROCK"; 
      jLabel6.setIcon(new ImageIcon(r));    
           
       }
       
  if(variable=="b"){
       if(c<1){
       Player1="ROCK";
       }
      
       Player2="ROCK";
   
      
     
  }     
    }//GEN-LAST:event_RockActionPerformed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed

         if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
        if(variable=="a"){
         p1="PAPER"; 
      jLabel6.setIcon(new ImageIcon(p));
        } 
  if(variable=="b"){
       if(c<1){
       Player1="PAPER"; 
       }
     
       Player2="PAPER";
        
        
  }  
    }//GEN-LAST:event_paperActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
         
      if(variable=="a"&&g instanceof String){
        if(NumberofRounds==1){
            m.contain1="1";
            clip.stop();
          jLabel3.setText("Score: "+Integer.toString( count2));
           jLabel4.setText("Score:"+Integer.toString( count1));
            if(count1>count2)  {
                
              if(sound2==false){                                    
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Cheering 3-SoundBible.com-1680253418.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
            
        }   
                
       JOptionPane.showMessageDialog(null,"Its Over the winner is the player"+"\n"+"Result:  "+count1); 
       this.setVisible(false);
        m.contain2="Easy";
        Main fd=new Main();
       fd.setVisible(true);
       
       } 
      else if(count1<count2){
          
            if(sound2==false){                
                                 
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
        catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
          
          
       JOptionPane.showMessageDialog(null,"Its Over the winner is the coumpeter"+"\n"+"Result:  "+count2);
       this.setVisible(false);
       Main fd=new Main();
       fd.setVisible(true);
       m.contain2="Easy";
       
       }
   else  if(count1==count2){
       
         if(sound2==false){                
                                 
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
            
        }
       
        JOptionPane.showMessageDialog(null,"Its Draw"+"\n"+"Result:  "+count2); 
        this.setVisible(false);
    m.contain2="Easy";
   Main fd=new Main();
       fd.setVisible(true);     

   }  
     }
        else {
       NumberofRounds--;  
        jLabel3.setText("Score: "+Integer.toString(count2));
       jLabel4.setText("Score:"+Integer.toString(count1));
        jLabel10.setText("");
         jLabel6.setIcon(null);
          jLabel8.setIcon(null);
            jButton4.setVisible(false); 
          JOptionPane.showMessageDialog(null,"Its your turn");    
       secondspassed=4;
     }}
        else if(variable=="a"&&g instanceof Integer){
 
        jLabel3.setText("Score: "+Integer.toString(count2));
       jLabel4.setText("Score: "+Integer.toString(count1));
        jLabel10.setText("");
         jLabel6.setIcon(null);
          jLabel8.setIcon(null);
          JOptionPane.showMessageDialog(null,"Its your turn");    
       secondspassed=4;  
   }
  else if(variable=="b"&&g instanceof Integer){
 
        jLabel3.setText("Score: "+Integer.toString(count2));
       jLabel4.setText("Score: "+Integer.toString(count1));
        jLabel10.setText("");
         jLabel6.setIcon(null);
          jLabel8.setIcon(null);
            jButton4.setVisible(false); 
               jButton1.setVisible(false);
          Player1="";  
       Player2="";
        c=0;
          JOptionPane.showMessageDialog(null,"Its player1 turn please dont peek!!!");    
      
   }      
           
   else if(variable=="b"&&g instanceof String){
       if(NumberofRounds==1){
              m.contain2="Easy"; 
          c=0;
          clip.stop();
          jLabel3.setText("Score: "+Integer.toString( count2));
           jLabel4.setText("Score: "+Integer.toString( count1));
            if(count1>count2)  {
   if(sound2==false){             
    try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Cheering 3-SoundBible.com-1680253418.wav");
  ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   }
   }
       JOptionPane.showMessageDialog(null,"Its Over the winner is player1"+"\n"+"Result:  "+count1); 
   if (sound2==false) {                
    try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
  ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}}
       JOptionPane.showMessageDialog(null,"And good luck to you player2"+"\n"+"Result:  "+count2); 
       this.setVisible(false);
    count1=0;count2=0;
        Main fd=new Main();
       fd.setVisible(true);
       } 
      else if(count1<count2){
          try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Cheering 3-SoundBible.com-1680253418.wav");
   ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   }
       JOptionPane.showMessageDialog(null,"Its Over the winner is player2"+"\n"+"Result:  "+count2);
       
        if (sound2==false) {                
    try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
   ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}}
       JOptionPane.showMessageDialog(null,"And good luck to you player1"+"\n"+"Result:  "+count1); 
       this.setVisible(false);
        count1=0;count2=0;
       Main fd=new Main();
       fd.setVisible(true);
       
       }
   else  if(count1==count2){
        if (sound2==false) {                
    try{
   
   InputStream g=getClass().getResourceAsStream("/Music/Sad_Trombone-Joe_Lamb-665429450.wav");
  ais=AudioSystem.getAudioInputStream(g);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
        
   }
   catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}}
        JOptionPane.showMessageDialog(null,"Its Draw"+"\n"+"Result:  "+count2); 
        this.setVisible(false);
 count1=0;count2=0;
   Main fd=new Main();
       fd.setVisible(true);     
 m.contain2="Easy";
   }  
     }
     else{
     NumberofRounds--;  
        jLabel3.setText("Score: "+Integer.toString(count2));
       jLabel4.setText("Score: "+Integer.toString(count1));
        jLabel10.setText("");
         jLabel6.setIcon(null);
          jLabel8.setIcon(null);
       Player1="";  
       Player2="";
        jButton4.setVisible(false); 
        c=0;
        jButton1.setVisible(false);
          JOptionPane.showMessageDialog(null,"Its player1 turn please dont peek!!!");    
      
     }    
           
   
    }                             
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
         if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
        
       setPicture(Player1,Player2);
        Resultfinal(Player1,Player2);
 jButton4.setVisible(true); 
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void airActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airActionPerformed
   if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
            if(variable=="a"){
     p1="AIR"; 
      jLabel6.setIcon(new ImageIcon(a));  
           
       }
       
  if(variable=="b"){
       if(c<1){
       Player1="AIR";
       }
     
       Player2="AIR";
        
  }    
    }//GEN-LAST:event_airActionPerformed

    private void fireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireActionPerformed

        if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
            
        }
 
        if(variable=="a"){
     p1="FIRE"; 
      jLabel6.setIcon(new ImageIcon(f));
            System.out.println("hgfd");     
       }
       
  if(variable=="b"){
       if(c<1){
       Player1="FIRE";
       }
     
       Player2="FIRE";
        
        
  }  
    }//GEN-LAST:event_fireActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

         if(jRadioButton1.isSelected()==false){
              jLabel17.setIcon(new ImageIcon(on));
try{ 
           
         d = getClass().getResourceAsStream("/Music/cathy.wav");
  ais=AudioSystem.getAudioInputStream(d);
 clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
}
         else{
    clip.stop(); 
     jLabel17.setIcon(new ImageIcon(off));
        
         }   
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
       if(sound1==false){
                
try{ 
           
            InputStream d = getClass().getResourceAsStream("/Music/Click2-Sebastian-759472264.wav");
      AudioInputStream ais=AudioSystem.getAudioInputStream(d);
      Clip clip=AudioSystem.getClip();
     
      clip.open(ais);
        clip.start();
     
       
     
      }
       catch (LineUnavailableException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedAudioFileException ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
      } 
      
      
            
        }  
        
        
        if (c<1){
        JOptionPane.showMessageDialog(null,"Its player2 turn please dont peek!!!");
  }
    c++;
    if(c==2)
        jButton1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

             

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rock;
    private javax.swing.JButton Secissor;
    private javax.swing.JButton air;
    private javax.swing.JButton fire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton paper;
    // End of variables declaration//GEN-END:variables
}
