
package javaapplication5;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javaapplication5.Main;
public class Settings extends javax.swing.JFrame {
 public static String contain1="1";
 public static Integer time=0;
 public static String contain2="Easy";
 static int h=1;

    InputStream d;
       AudioInputStream ais;
        Clip clip;
    public Settings() {
       
        initComponents();

         setLocationRelativeTo(null);
       jComboBox1.setVisible(true);
         jSpinner1.setVisible(false);
         jRadioButton1.setSelected(true);
    
      this.setResizable(false);
       
    }

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    public JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.jCheckBox1 = jCheckBox1;
    }

    public JCheckBox getjCheckBox3() {
        return jCheckBox3;
    }

    public void setjCheckBox3(JCheckBox jCheckBox3) {
        this.jCheckBox3 = jCheckBox3;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(250, 210, 100, 39);

        jSpinner1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                catchValueFromSpinner(evt);
            }
        });
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(490, 210, 120, 38);

        jRadioButton2.setBackground(new java.awt.Color(102, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jRadioButton2.setText("Timing");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(480, 150, 150, 40);

        jRadioButton1.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jRadioButton1.setText("Number of Rounds");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(200, 150, 240, 35);

        jCheckBox1.setBackground(new java.awt.Color(102, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 0, 102));
        jCheckBox1.setText("mut/unmute");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(140, 380, 200, 60);

        jCheckBox3.setBackground(new java.awt.Color(102, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 0, 153));
        jCheckBox3.setText("mut/unmute");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(540, 380, 200, 60);

        jComboBox2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Normal", "Difficult" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(330, 540, 180, 40);

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 120, 70, 50);

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Difficulty Level");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 480, 210, 30);

        jLabel6.setBackground(new java.awt.Color(255, 51, 102));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("Win /Lose announcment sound");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 330, 390, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setText("Clicking sound");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 330, 180, 40);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Sound effects");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 260, 240, 70);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Winner mechanism");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 90, 290, 40);

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("SITTINGS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 10, 210, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/Photos/wow.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 860, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    
        if(jCheckBox1.isSelected()==false){
            
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
        String f=jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
      switch(f){
        case("1"):
            contain1="1";
            break;
            case("2"):
            contain1="2";
            break;
            case("3"):
            contain1="3";
            break;
            case("4"):
            contain1="4";
            break;
          
      }
   if( jRadioButton2.isSelected())
       contain1="";
          
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        
        if(jCheckBox1.isSelected()==false){
            
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
        
        
        
        
        jComboBox1.setVisible(true);
      jSpinner1.setVisible(false);

      
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        
        if(jCheckBox1.isSelected()==false){
            
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
        
        
        
        
        
          jComboBox1.setVisible(false);
      jSpinner1.setVisible(true);
    
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if(jCheckBox1.isSelected()==false){
            
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
        
        
        
        
        
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void catchValueFromSpinner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_catchValueFromSpinner
     
        if(jCheckBox1.isSelected()==false){
            
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
        
        
        
      time= (Integer)((JSpinner)evt.getSource()).getValue(); 
            
    }//GEN-LAST:event_catchValueFromSpinner

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        
        if(jCheckBox1.isSelected()==false){
            
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
        
        
        
        
        
     String f=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
      switch(f){
        case("Easy"):
            contain2="Easy";
            break;
            case("Normal"):
            contain2="Normal";
            break;
            case("Difficult"):
            contain2="Difficult";
            break;
          
      }
   
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
  if(getjCheckBox1().isSelected()==false){
                
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
    }//GEN-LAST:event_jCheckBox3ActionPerformed



    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
