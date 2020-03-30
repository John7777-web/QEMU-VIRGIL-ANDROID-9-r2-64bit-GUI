/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android964bit;

import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.Frame.ICONIFIED;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author john
 */
public class android964bit extends javax.swing.JFrame {
     private int pointX;
    private int pointY;
    


    
   

    public android964bit() {
     JLabel backgroundLabel = createBackgroundLabel();
      
      try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(android964bit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(android964bit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(android964bit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(android964bit.class.getName()).log(Level.SEVERE, null, ex);
        }
SwingUtilities.updateComponentTreeUI ( this ) ;

           

   
                  
   
                  
           
                  
                  

               
      
        
        
        
        
        
        
        
        
        
  

  JButton jButton1 = new JButton("2ST INSTALL");
                jButton1.setHorizontalAlignment(JButton.CENTER);

             jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
                          String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/android964bit/src/android964bit/1.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }

			}
		});
             
              JButton jButton2 = new JButton("RUN");
                         jButton2.setHorizontalAlignment(JButton.CENTER);

        jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
		     String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/android964bit/src/android964bit/2.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }
                                	}
		});
  
      
        
        
                    JButton jButton5 = new JButton("MINIMIZE");
        jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				   		setState(ICONIFIED);


			}
		});
        
        
        JButton jButton6 = new JButton("CLOSE");
        jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
           System.exit(0);
			}
		});
        
                       
              JButton jButton7 = new JButton("1ST DOWNLOAD TO DOWNLOADS FOLDER");
                         jButton7.setHorizontalAlignment(JButton.CENTER);

        jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
		     String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/android964bit/src/android964bit/downloadhd.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }
                                	}
		});
               
         JButton jButton8 = new JButton("WIFI REFRESH");
                         jButton8.setHorizontalAlignment(JButton.CENTER);

        jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
		     String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/android964bit/src/android964bit/wifirefresh.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }
                                	}
		});
        
         JButton jButton9 = new JButton("UNINSTALL WIFI BRIDGE");
                         jButton9.setHorizontalAlignment(JButton.CENTER);

        jButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
		     String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/android964bit/src/android964bit/u.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }
                                	}
		});
        
        
        
    JPanel panel1 = new JPanel();
    
    panel1.setOpaque( false );
    


  

 

    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(jButton1);
    buttonBox.add(jButton2);





    addItem(panel1, buttonBox, 7, 4, 9, 1, GridBagConstraints.PAGE_END);
 





        
        setContentPane(backgroundLabel);

        
          setLayout(new FlowLayout());     
            


                  
        add(jButton7);
          add(new JLabel(""));
         
        add(jButton1);
                            add(new JLabel(""));

                    add(new JLabel(""));


                            add(new JLabel(""));

        add(jButton2);
                            add(new JLabel(""));

        add(jButton5);
                            add(new JLabel(""));
        add(jButton6);

                            add(new JLabel(""));
        add(jButton8);

                            add(new JLabel(""));
        add(jButton9);

                            add(new JLabel(""));

                            add(new JLabel(""));

                            add(new JLabel(""));

                            add(new JLabel(""));

                   add(new JLabel(""));

       add(new JLabel(""));

add(new JLabel(""));

add(new JLabel(""));

 add(new JLabel(""));

                 add(new JLabel(""));

                             add(new JLabel(""));

                          add(new JLabel(""));

                                    add(new JLabel(""));

                                            add(new JLabel(""));

                                              add(new JLabel(""));

                                           add(new JLabel(""));

                                              add(new JLabel(""));

                                                add(new JLabel(""));

                                                          add(new JLabel(""));

                                                          add(new JLabel(""));

                                                         add(new JLabel(""));

                                                                    add(new JLabel(""));

                                                                         add(new JLabel(""));

                                                                          add(new JLabel(""));

                                                                               add(new JLabel(""));

                                                                                             add(new JLabel(""));

                                                                                 add(new JLabel(""));

                                                                          add(new JLabel(""));

                                                                          add(new JLabel(""));

                                                                              add(new JLabel(""));

                                                                               add(new JLabel(""));

                                                                                    add(new JLabel(""));

                                                                                          add(new JLabel(""));

                                                                                                  add(new JLabel(""));

        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    
         
    }



      private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
    GridBagConstraints gc = new GridBagConstraints();
    gc.gridx = x;
    gc.gridy = y;
    gc.gridwidth = width;
    gc.gridheight = height;
    gc.weightx = 100.0;
    gc.weighty = 100.0;
    gc.insets = new Insets(5, 5, 5, 5);
    gc.anchor = align;
    gc.fill = GridBagConstraints.PAGE_END;
    p.add(c, gc);
  }




    
    private JLabel createBackgroundLabel() {
        JLabel label = new JLabel(new ImageIcon());
        label.setLayout(new GridBagLayout());
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/android964bit/31.png"))); // NOI18N;
        label.setDoubleBuffered(true);
         
        label.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                android964bit.this.setLocation(android964bit.this.getLocation().x + e.getX() - pointX,
                      android964bit.this.getLocation().y + e.getY() - pointY);
            }
        });
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                pointX = e.getX();
                pointY = e.getY();
            }
        });

        return label;
    }
    



    
    public static void main(String[] args) {
        


        
        
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new android964bit();
            }
        });
    }






   

}





