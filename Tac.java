import java.awt.*;
import java.awt.event.*;
class Tac extends Frame implements ActionListener
{ 
   Button b[] = new Button[9];
   int x=100;
   int y=100;
   int w=100;
   int h=100;
   TextField tx1;
   
      Tac()
	{
		Font f = new Font("FOLD",Font.BOLD,30);
		setFont(f);
		setLayout(null);
		
		int k = 0;
		
		for(int i=0;i<3;i++)             //display 9 button
		{
		for(int j=0;j<3;j++)
		{
			b[k]= new Button("");
            b[k].setSize(w,h);
			b[k].setLocation(x,y);
			add (b[k]);	
			b[k].addActionListener(this);
             k++;
        x=x+100;			 
		}
		x=100;
		y=y+100;
		}
	}
            
           int c=0;	   
			
		public void actionPerformed(ActionEvent e)
	{
	    Button b1 =(Button)e.getSource();     //set button label

        if(c%2==0)
		{
         b1.setLabel("X");
		}	
        else
		{
           b1.setLabel("0");
        }
		b1.removeActionListener(this);
          c++;		
	}
}
class Demo
	{
		public static void main(String ar[])
		{
		Tac n = new Tac();
        n.setVisible(true);
        n.setSize(600,400);	
        n.setLocation(200,100);	
        
		}
	}