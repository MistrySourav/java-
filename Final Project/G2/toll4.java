import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll4 extends JFrame implements ActionListener,MouseListener
{
JFrame f5;
JButton b1,b2;
JLabel l1,l3,l4;
Font ft;
ImageIcon img;
	public toll4()
    {   
            ft= new Font("Cambria", Font.PLAIN, 12);

            img=new ImageIcon("pic.jpg");
            l4 = new JLabel(img);
            l4.setBounds(0,0,800,600);        
        
            f5=new JFrame();
            f5.setVisible(true);
            f5.setSize(800,600);
            f5.setLayout(null);
            f5.setDefaultCloseOperation(EXIT_ON_CLOSE);

            l1=new JLabel("Thank You For Visit");
            l1.setBounds(310,150,150,25);
            l1.setBackground(new Color(102, 255,255));
            l1.setOpaque(true);
            l1.setForeground(Color.BLACK);
            l1.setFont(ft);

            l3=new JLabel("Have a Safe Journey");
            l3.setBounds(310,200,150,25);
            l3.setBackground(new Color(102, 255,255));
            l3.setOpaque(true);
            l3.setForeground(Color.BLACK);
            l3.setFont(ft);

            b2=new JButton("Go to Vehicle List");
            b2.setBounds(300,250,150,25);
            b2.setBackground(new Color(102, 255,255));
            b2.setOpaque(true);
            b2.setForeground(Color.BLACK);
            b2.setFont(ft);

            b1=new JButton("EXIT");
            b1.setBounds(300,300,150,25);
            b1.setBackground(new Color(102, 255,255));
            b1.setOpaque(true);
            b1.setForeground(Color.BLACK);
            b1.setFont(ft);
            
            f5.add(l1);
            f5.add(b1);
            f5.add(b2);
            f5.add(l3); 
            f5.add(l4);  
            

            b1.addMouseListener(this);
            b2.addMouseListener(this);

            b1.addActionListener(this);
            b2.addActionListener(this);
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
            
        

            else
            {
            
            }
        }



        public void actionPerformed( ActionEvent j)
        {
            if(j.getSource()==b1)
            {
                System.exit(0);
            }
            if(j.getSource()==b2)
            {
                vehicale pd11=new vehicale();
            }

        }
    
}