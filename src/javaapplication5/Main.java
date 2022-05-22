
package javaapplication5;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication5.Normal;
import javaapplication5.Easy;
import javaapplication5.Settings;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Control;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class Main extends javax.swing.JFrame  {
    String s="";
  Settings m=new Settings();
    InputStream d;
       AudioInputStream ais;
        int secondspassed=2; 
 Timer Timer=new Timer();
 URL on = getClass().getResource("/javaapplication5/Photos/Sound-on-icon.png"); 
     URL off = getClass().getResource("/javaapplication5/Photos/Sound-off-icon.png"); 
        Clip clip;
    public Main() {
        initComponents();
          setLocationRelativeTo(null);  
          this.setResizable(false);
          j1.setSelected(true);
           jLabel2.setIcon(new ImageIcon(on));
s="a";
if(jRadioButton1.isSelected()==false){
try{ 
           
         d = getClass().getResourceAsStream("/Music/Into the Area.wav");
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

  
public String value1(){
 if(m.getjRadioButton1().isSelected()==true) 
    return m.contain1;
 return "ere";
}
  public int value2(){
if(m.getjRadioButton2().isSelected()==true) {
 
    return m. time; 
}
return -999;
} 

 public boolean clickingsound(){
    if(m.getjCheckBox1().isSelected()==true) 
     return true;
    return false;
     
     
     
 }
   public boolean cheeringsound(){
    if(m.getjCheckBox3().isSelected()==true) 
     return true;
    return false;
     
     
     
 }
 public void start(JFrame d){
    TimerTask task=new TimerTask() {
    public void run() {
       secondspassed--;
       
    if(secondspassed==0){
       d.setVisible(false);
     
       if(m.contain2=="Easy"&&value1()!="ere"){
           Easy n=new Easy();
           n.setVisible(true);     
   ((Easy) n).getValue(s,value1(),clickingsound(), cheeringsound());        
           
       }
       if(m.contain2=="Easy"&&value1()=="ere"){
            Easy n=new Easy();
           n.setVisible(true);      
   ((Easy) n).getValue(s,value2(),clickingsound(), cheeringsound());        
           
       }
  if(m.contain2=="Normal"&&value1()!="ere"){
      Normal n=new Normal();
      n.setVisible(true);
   ((Normal) n).getValue(s,value1(),clickingsound(), cheeringsound());        
           
       }
  if(m.contain2=="Normal"&&value1()=="ere"){
      Normal n=new Normal();
      n.setVisible(true);
   ((Normal) n).getValue(s,value2(),clickingsound(), cheeringsound());        
           
       }
  if(m.contain2=="Difficult"&&value1()!="ere"){
     Difficult n=new Difficult();
      n.setVisible(true);
   ((Difficult) n).getValue(s,value1(),clickingsound(), cheeringsound());        
           
       }
  if(m.contain2=="Difficult"&&value1()=="ere"){
     Difficult n=new Difficult();
      n.setVisible(true);
   ((Difficult) n).getValue(s,value2(),clickingsound(), cheeringsound());        
           
       }
  
  
  Timer.cancel();
  secondspassed=5;
    } 
    
    }
        };
    Timer.scheduleAtFixedRate(task, 1000, 1000);
   
} 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        j1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        j2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(51, 204, 255));
        jRadioButton1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(153, 0, 0));
        jRadioButton1.setText("Music OFF/ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(820, 30, 190, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/coollogo_com-25436078.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 10, 431, 110);

        j1.setBackground(new java.awt.Color(51, 204, 255));
        Group.add(j1);
        j1.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        j1.setForeground(new java.awt.Color(204, 0, 51));
        j1.setSelected(true);
        j1.setText("1 player");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        jPanel1.add(j1);
        j1.setBounds(840, 200, 230, 120);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/coollogo_com-136763845.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 190, 430, 120);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/coollogo_com-9095443.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(0, 500, 420, 120);

        j2.setBackground(new java.awt.Color(51, 204, 255));
        Group.add(j2);
        j2.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        j2.setForeground(new java.awt.Color(204, 0, 0));
        j2.setText("2 Player");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        jPanel1.add(j2);
        j2.setBounds(840, 380, 230, 130);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/coollogo_com-14474595.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 350, 420, 120);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(770, 50, 70, 40);

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/jkl (1).jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1068, 741));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1070, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed

        if(m.getjCheckBox1().isSelected()==false){
                
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
        
        s="a";

  
    }//GEN-LAST:event_j1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
clip.stop();
        if(m.getjCheckBox1().isSelected()==false){
                
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
        if(s=="a"){
      this.setVisible(false);
      this.setResizable(false);
       Loading d=new Loading();
   d.setVisible(true);
  start(d);
    }//GEN-LAST:event_jButton1ActionPerformed
          if(s=="b"){
      this.setVisible(false);
      this.setResizable(false);       
 Loading d=new Loading();
   d.setVisible(true);
  start(d);
          }
  }
    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed

        
         if(m.getjCheckBox1().isSelected()==false){
                
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
        
        
        s="b";
    }//GEN-LAST:event_j2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if(m.getjCheckBox1().isSelected()==false){
                
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
   m.setVisible(true);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
if(jRadioButton1.isSelected()==false){
     jLabel2.setIcon(new ImageIcon(on));
try{ 
           
         d = getClass().getResourceAsStream("/Music/Into the Area.wav");
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
     jLabel2.setIcon(new ImageIcon(off));
    clip.stop();}

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 if(m.getjCheckBox1().isSelected()==false){
                
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
        
        
        
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

   
    public static void main(String args[]) {
             
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.JRadioButton j1;
    private javax.swing.JRadioButton j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
