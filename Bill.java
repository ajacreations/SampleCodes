//creating a bill menu


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

public class Bill extends Applet implements ItemListener,ActionListener
 {
  String msg="";
  Checkbox c1,c2,c3,c4;
  TextField t1,t2,t3,t4;
  Button b1;
  
  public void init()
   {
    c1 =new Checkbox("BIRIYANI",null, false);
	c2 =new Checkbox("CHOWMEIN");
	c3 = new Checkbox("MOMO");
	c4 = new Checkbox("SPRING ROLL");
	
	t1=new TextField(20);
	t2=new TextField(20);
	t3=new TextField(20);
	t4=new TextField(20);
	
	b1=new Button("TOTAL BILL");
	
	add(c1);
	add(t1);
	add(c2);
	add(t2);
	add(c3);
	add(t3);
	add(c4);
	add(t4);
	
	add(b1);
	
	b1.addActionListener(this);
	
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	c4.addItemListener(this);
	
   }
  public void itemStateChanged(ItemEvent ie)
   {
     //repaint();
   }
   
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
 public void actionPerformed(ActionEvent event)
	{
		double v1=0.0,v2=0.0,v3=0.0,v4=0.0;
		int x1,x2,x3,x4;
	    msg ="NO ITEM IS SELECTED.";
			if(event.getSource()==b1)
			{		
				if(c1.getState()==true)
				{
					if(t1.getText().length()==0)
					{
						msg= "Quantity is not given for" + c1.getLabel();
						repaint();
					}
					else
					{
						x1=Integer.parseInt(t1.getText());
						v1 =x1*350.0;
					}
		 
				}
				if(c2.getState()==true)
				{
					if(t2.getText().length()==0)
					{
						msg= "Quantity is not given for" + c2.getLabel();
						repaint();
					}
					else
					{
						x2=Integer.parseInt(t2.getText());
						v2 =x2*200.0;
					}
		 			 
				}
		 
				if(c3.getState()==true)
				{
					if(t3.getText().length()==0)
					{
						msg= "Quantity is not given for" + c3.getLabel();
						repaint();
					}
					else
					{
						x3=Integer.parseInt(t3.getText());
						v3 =x3*150.0;
					}
				}
				if(c4.getState()==true)
				{
					if(t4.getText().length()==0)
					{
						msg= "Quantity is not given for" + c4.getLabel();
						repaint();
					}
					else
					{
						x4=Integer.parseInt(t4.getText());
						v4 =x4*250.0;
					} 
				}
		     double amt=v1+v2+v3+v4;
		 
	         msg = "YOUR BILL AMOUNT IS :" + Double.toString(amt);
			 repaint();
			}
    }
  }

/*<applet code= "Bill" height=300 width=300> </applet>*/