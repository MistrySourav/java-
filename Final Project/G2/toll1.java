//car
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll1 extends JFrame implements ActionListener,MouseListener
{
JFrame f2;
JButton b1,b2,b3,b4,b5;
ImageIcon img;
JLabel l,l1;
	public toll1()
		{
			l=new JLabel(" PLEASE SELECT YOUR VAHICLE TYPE");
            l.setBounds(270,90,300,50); 


			img=new ImageIcon("sss.gif");
        	l1 = new JLabel(img);
        	l1.setBounds(0,0,800,600);

            f2=new JFrame();
            f2.setVisible(true);
            f2.setSize(800,600);
            f2.setLayout(null);
            f2.setDefaultCloseOperation(EXIT_ON_CLOSE);  


            b1=new JButton("Toll For Private Car");
            b1.setBounds(300,150,150,20); 
            b1.setBackground(new Color(102, 255,255));
        	b1.setOpaque(true);
        	b1.setForeground(Color.BLACK);

            b2=new JButton("Toll For Jeep");
            b2.setBounds(300,200,150,20);
            b2.setBackground(new Color(102, 255,255));
        	b2.setOpaque(true);
        	b2.setForeground(Color.BLACK);

            b3=new JButton("Toll For Micro Bus");
            b3.setBounds(300,250,150,20);
            b3.setBackground(new Color(102, 255,255));
        	b3.setOpaque(true);
        	b3.setForeground(Color.BLACK);

            b4=new JButton("BACK");
            b4.setBounds(240,300,100,20);
			b4.setBackground(new Color(102, 255,255));
	        b4.setOpaque(true);
	        b4.setForeground(Color.BLACK);

            b5=new JButton("EXIT");
            b5.setBounds(390,300,100,20);
            b5.setBackground(new Color(102, 255,255));
        	b5.setOpaque(true);
        	b5.setForeground(Color.BLACK);

            f2.add(b1);
            f2.add(b2);
            f2.add(b3);
            f2.add(b4);
            f2.add(b5);
            f2.add(l1);
            f2.add(l);

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
			b1.setForeground(new Color(102, 255,255));
		}
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.BLUE);
			b2.setForeground(new Color(102, 255,255));
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.BLUE);
			b3.setForeground(new Color(102, 255,255));
		}
		else if(me.getSource() == b4)
		{
			b4.setBackground(Color.BLUE);
			b4.setForeground(new Color(102, 255,255));
		}
		else if(me.getSource() == b5)
		{
			b5.setBackground(Color.BLUE);
			b5.setForeground(new Color(102, 255,255));
		}

		else
		{
			
		}
	}





            public void actionPerformed(ActionEvent f)
			{
				String msg="";  
      		    float amount1=1000;
      		    float amount2=1500;  
      		    float amount3=2000;
				if(f.getSource()==b1)
				{
					//vehicale v=new vehicale();
					toll4 p11=new toll4();
                    msg+="Private Car toll 1000\n";
                    JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount1); 
				}
				if(f.getSource()==b2)
				{
					toll4 pep12=new toll4();
                    msg+="Jeep toll 1500\n";
                    JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount2); 
				}
				if(f.getSource()==b3)
				{
					toll4 p1ep3=new toll4();
                    msg+="Micro Bus toll 2000\n";
                    JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount3); 
				}

				
				if(f.getSource()==b4)
				{
				vehicale pdse14=new vehicale();
				}

				if(f.getSource()==b5)
                {
                    System. exit(0); 
                }

				/*if(f.getSource()==b1)
				{
					msg+="total amount\n"+amount1;
				}
				if(f.getSource()==b2)
				{
					msg+="total amount\n"+amount2;
				}
				if(f.getSource()==b3)
				{
					msg+="total amount\n"+amount2;
				}*/
				

        			//JOptionPane.showMessageDialog(this,msg+"Total: "+amount1);  
        			//JOptionPane.showMessageDialog(this,msg);  
        			//float amount=amount3+amount1+amount2;
        			//JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount);  
			}
		}


