//tuck
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll2 extends JFrame implements ActionListener,MouseListener
{
JFrame f3;
JButton b1,b2,b3,b4,b5;
JLabel l1,l2;
ImageIcon img;
//vehicale v2;
	public toll2()
		{
			img=new ImageIcon("for-dribbble.gif");
        	l2 = new JLabel(img);
        	l2.setBounds(0,0,800,600);

            f3=new JFrame();
            f3.setVisible(true);
            f3.setSize(800,600);
            f3.setLayout(null);
            f3.setDefaultCloseOperation(EXIT_ON_CLOSE);  

            l1=new JLabel(" PLEASE SELECT YOUR VAHICLE TYPE");
            l1.setBounds(270,90,300,50); 

            b1=new JButton("Toll For 5 Fon Small Truck");
            b1.setBounds(250,150,250,20); 
            b1.setBackground(new Color(198, 65, 83));
            b1.setOpaque(true);
            b1.setForeground(Color.WHITE);


            b2=new JButton("Toll For  a Large Truck With 3 Axles");
            b2.setBounds(250,200,250,20);			
            b2.setBackground(new Color(198, 65, 83));
            b2.setOpaque(true);
            b2.setForeground(Color.WHITE);

            b3=new JButton("Toll For a Large Truck With Above 4 Axles");
            b3.setBounds(230,250,300,20);
            b3.setBackground(new Color(198, 65, 83));
            b3.setOpaque(true);
            b3.setForeground(Color.WHITE);

            b4=new JButton("BACK");
            b4.setBounds(240,300,100,20);
            b4.setBackground(new Color(198, 65, 83));
            b4.setOpaque(true);
            b4.setForeground(Color.WHITE);

            b5=new JButton("EXIT");
            b5.setBounds(390,300,100,20);
            b5.setBackground(new Color(198, 65, 83));
            b5.setOpaque(true);
            b5.setForeground(Color.WHITE);

            f3.add(b1);
            f3.add(b2);
            f3.add(b3);
            f3.add(b4);
            f3.add(b5);
            f3.add(l1);
            f3.add(l2);
            


            b1.addMouseListener(this);
            b2.addMouseListener(this);
            b3.addMouseListener(this);
            b4.addMouseListener(this);
            b5.addMouseListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
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
        else if(me.getSource() == b4)
        {
            b4.setBackground(Color.BLUE);
            b4.setForeground(Color.WHITE);
        }
        else if(me.getSource() == b5)
        {
            b5.setBackground(Color.BLUE);
            b5.setForeground(Color.WHITE);
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
        else if(me.getSource() == b4)
        {
            b4.setBackground(Color.BLUE);
            b4.setForeground(new Color(198, 65, 83));
        }
        else if(me.getSource() == b5)
        {
            b5.setBackground(Color.BLUE);
            b5.setForeground(new Color(198, 65, 83));
        }

        else
        {
            
        }
    }






            public void actionPerformed(ActionEvent g)
			{
				String msg="";  
      		    float amount1=2000;
      		    float amount2=4000;  
      		    float amount3=6000;
      		
				if(g.getSource()==b1)
				{
					toll4 b14=new toll4();
					msg+="small truck toll 3000\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount1);
				}

				if(g.getSource()==b2)
				{
					toll4 b13=new toll4();				
					msg+="a large truck toll 4000\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount2);
				}

				if(g.getSource()==b3)
				{
					toll4 mi12=new toll4();				
					msg+="a large truck with above 4 axles toll 6000\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount3);
				}

				if(g.getSource()==b4)
				{
				vehicale mi11=new vehicale();
				}

				if(g.getSource()==b5)
                {
                    System. exit(0); 
                }

				
			}
		}


