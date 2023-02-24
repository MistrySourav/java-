//bike
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll3 extends JFrame implements ActionListener,MouseListener
{	
	JFrame f4;
	JButton b1,b2,b3;
    JLabel l1,l2;
    ImageIcon img;
		public toll3()
		{
			

            img=new ImageIcon("bike11.gif");
            l2 = new JLabel(img);
            l2.setBounds(0,0,800,600);

            f4=new JFrame();
            f4.setVisible(true);
            f4.setSize(800,600);
            f4.setLayout(null);
            f4.setDefaultCloseOperation(EXIT_ON_CLOSE);  

            l1=new JLabel(" PLEASE SELECT YOUR VAHICLE TYPE");
            l1.setBounds(270,90,300,50); 


            b1=new JButton("Toll For Bike");
            b1.setBounds(300,150,150,20);
            b1.setBackground(new Color(102, 255,255));
            b1.setOpaque(true);
            b1.setForeground(Color.BLACK);

            b2=new JButton("BACK");
            b2.setBounds(300,200,150,20);
            b2.setBackground(new Color(102, 255,255));
            b2.setOpaque(true);
            b2.setForeground(Color.BLACK);

            b3=new JButton("EXIT");
            b3.setBounds(300,250,150,20);
            b3.setBackground(new Color(102, 255,255));
            b3.setOpaque(true);
            b3.setForeground(Color.BLACK);

            f4.add(b1);
            f4.add(b2);
            f4.add(b3);
            f4.add(l1);
            f4.add(l2);

            b1.addMouseListener(this);
            b2.addMouseListener(this);
            b3.addMouseListener(this);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);


        }



        public void mouseClicked(MouseEvent me){}
        public void mousePressed(MouseEvent me){}
        public void mouseReleased(MouseEvent me){}
     public void mouseEntered(MouseEvent me)
            {
            if(me.getSource() == b1)
            {
            b1.setBackground(Color.BLUE);
            b1.setForeground(Color.WHITE);
            }
            else if(me.getSource() == b2)
            {
            b2.setBackground(Color.BLUE);
            b2.setForeground(Color.WHITE);
             }
           else if(me.getSource() == b3)
            {
            b3.setBackground(Color.BLUE);
            b3.setForeground(Color.WHITE);
            }
        
            else
            {
            
            }
        }
     public void mouseExited(MouseEvent me)
        {
            if(me.getSource() == b1)
            {
            b1.setBackground(Color.BLUE);
            b1.setForeground(new Color(198, 65, 83));
            }
            else if(me.getSource() == b2)
            {
            b2.setBackground(Color.BLUE);
            b2.setForeground(new Color(198, 65, 83));
            }
            else if(me.getSource() == b3)
            {
             b3.setBackground(Color.BLUE);
             b3.setForeground(new Color(198, 65, 83));
            }
        

            else
            {
            
            }
        }



            public void actionPerformed(ActionEvent h)
            {

                String msg="";  
                float amount1=100;
                if(h.getSource()==b1)
                {
                    toll4 qw11=new toll4();
                    msg+="Motor Bike toll 1000\n";
                    JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount1); 
                    
                }
                if(h.getSource()==b2)
                {
                vehicale kw111=new vehicale();
                 
                }
                if(h.getSource()==b3)
                {
                    System. exit(0); 
                }
                
                //JOptionPane.showMessageDialog(this,msg);//main  
                //float amount=amount3+amount1+amount2;
                
            }
        }
