
package mario;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;
import java.awt.Image ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class form1 extends JFrame implements ActionListener , KeyListener  {
    Timer tm = new Timer(5 , (ActionListener) this);
    private JPanel panel1;
    private JButton b0 ; 
    private JButton b1 ; 
    private JButton b2 ;
    private JButton b3 ;
    private Icon i1 ; 
    private Icon i2 ; 
    JLabel pic;
    int x = 0;
    int vx = 0;
    
    String[] list = { 
        "D:/Mahmoud/Design/Mario/Scenes/1.png",
        "D:/Mahmoud/Design/Mario/Scenes/2.png",
        "D:/Mahmoud/Design/Mario/Scenes/3.png",
        
        "D:/Mahmoud/Design/Mario/Scenes/5.png",
        "D:/Mahmoud/Design/Mario/Scenes/6.png",
        "D:/Mahmoud/Design/Mario/Scenes/7.png",
        "D:/Mahmoud/Design/Mario/Scenes/8.png",
        "D:/Mahmoud/Design/Mario/Scenes/9.png",
        "D:/Mahmoud/Design/Mario/Scenes/10.png"
    
    };
    public form1(){
                        tm.start();
                        
                        setFocusable(true); 
                        setFocusTraversalKeysEnabled(false);
                        pic = new JLabel() ;
                        pic.setBounds(40, 30, 500, 500);
                        setup();
                        
                        ImageIcon icon = new ImageIcon(list[0]);
                        Image img = icon.getImage();
                        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newImc = new ImageIcon(newImg);
                        pic.setIcon(newImc);                                                                                                
                        add(pic);
                        setLayout(null);
                        setSize(700,700);
                        getContentPane().setBackground(Color.decode("#5C91F1"));
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setLocationRelativeTo(null);
                        setVisible(true);
                        
                        
                        
                
    }
    
    private void setup()
    {
        handler h = new handler(); 
        panel1 = new JPanel (); 
        panel1.setBackground(Color.decode("#AAAAAA"));
        panel1.setLayout(null);
        panel1.setSize(700,700);
        panel1.setBounds(new Rectangle(0,0 , getWidth(),getHeight() ));
        add(panel1);
        this.setContentPane(panel1);
        this.setTitle("Mario !");
        this.setSize(100,100);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       /* i1 =  new ImageIcon(getClass().getResource("Open.png"));  
        i2 =  new ImageIcon(getClass().getResource("Close.png"));  */
        b0 = new JButton ("Reset") ;
        b1 = new JButton ("Next") ;
        b2 = new JButton ("Prev") ;
        b3 = new JButton ("Finish") ;
        
        b0.setBounds(50, 600, 100,50);
        b1.setBounds(200, 600, 100,50);
        b2.setBounds(350, 600, 100, 50);
        b3.setBounds(500, 600, 100, 50);
        panel1.add(b0);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        b0.addActionListener(h);
        b1.addActionListener(h);
        b2.addActionListener(h);
        b3.addActionListener(h);
        addKeyListener((KeyListener) this); 
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private class handler implements ActionListener , KeyListener {
        
                        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()== b1)
            {
                if(x<=7 )
                {
                x=x+1; 
                
                ImageIcon icon = new ImageIcon(list[x]);
                Image img = icon.getImage();
                Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImc = new ImageIcon(newImg);
                pic.setIcon(newImc); }
            }
            else if (e.getSource() == b2 )
            {
                if(x>0 )
                {
                    x=x-1;
                ImageIcon icon = new ImageIcon(list[x]);
                Image img = icon.getImage();
                Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImc = new ImageIcon(newImg);
                pic.setIcon(newImc); }
                    
                
            }
            else if (e.getSource()== b3 )
            {
                x=8;
                ImageIcon icon = new ImageIcon(list[x]);
                Image img = icon.getImage();
                Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImc = new ImageIcon(newImg);
                pic.setIcon(newImc); 
                
            }
            else if (e.getSource()== b0 )
            {
                x=0;
                ImageIcon icon = new ImageIcon(list[x]);
                Image img = icon.getImage();
                Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImc = new ImageIcon(newImg);
                pic.setIcon(newImc); 
                
            }
            
            
                x=x+vx;
                 
            
            
        }

        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int c =e.getKeyCode();
            if(c== KeyEvent.VK_LEFT)
        {
            if(x<=9)
            {
            vx=1 ;
            }
             
        }
            if(c== KeyEvent.VK_RIGHT)
        {
            if(x>0)
            {
            vx=-1;
            }
             
        }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        
    }

        
        
    
}
//set a timer
                          /* tm = new Timer(500,new ActionListener() {

                               @Override
                               public void actionPerformed(ActionEvent e) {
                                   SetImageSize(x);
                                   x += 1;
                                   if(x > list.length )
                                       x = 0; 
                               }
                               });*/