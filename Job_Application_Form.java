import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class Job_Application_Form implements ActionListener{
	
	JFrame f1,f2;
	JButton submit,ok;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JCheckBox hindi,eng,other,python,android,ml,cs,AJP,others;
	JRadioButton male,female;
	ButtonGroup radio;
	JTextArea ta;
	public Job_Application_Form()
	{
		f1=new JFrame("Job_Application_Form Using Swing Components");
		f1.setVisible(true);
		f1.setLayout(null);
		f1.setBounds(500,10,800,1000);
		
		l1=new JLabel("Job Application");
		l1.setBounds(300,30,300,60);
		Font font=new Font(null, Font.BOLD,36);
		l1.setFont(font);
		f1.add(l1);

		l2=new JLabel("Name :");
		l2.setBounds(100,100,100,40);
		f1.add(l2);
		
		tf1 = new JTextField();
		tf1.setBounds(100, 130, 300, 40);
		f1.add(tf1);
		
		tf2 = new JTextField();
		tf2.setBounds(410, 130, 300, 40);
		f1.add(tf2);
		
		l3= new JLabel("LAST");
		l3.setBounds(100, 160, 300, 40);
		f1.add(l3);
		
		l4= new JLabel("FIRST");
		l4.setBounds(410, 160, 300, 40);
		f1.add(l4);
		
		l5= new JLabel("Email :");
		l5.setBounds(100, 200, 300, 40);
		f1.add(l5);
		
		tf3 = new JTextField();
		tf3.setBounds(100,240, 300, 40);
		f1.add(tf3);
		
		l6= new JLabel("Phone :");
		l6.setBounds(100, 270, 300, 40);
		f1.add(l6);
		
		tf4 = new JTextField();
		tf4.setBounds(100,300, 300, 40);
		f1.add(tf4);
		
		l7= new JLabel("Date Of Birth(DOB):");
		l7.setBounds(100, 340, 300, 40);
		f1.add(l7);
		
		tf5 = new JTextField();
		tf5.setBounds(100,370, 50, 40);
		f1.add(tf5);
		
		tf6 = new JTextField();
		tf6.setBounds(160,370, 50, 40);
		f1.add(tf6);
		
		tf7 = new JTextField();
		tf7.setBounds(220,370, 100, 40);
		f1.add(tf7);
		
		l8= new JLabel("Current Employeement Status:");
		l8.setBounds(100, 420, 300, 40);
		f1.add(l8);
		
		String[] list= {"Student","Emoployee","Unemployee"};
		JComboBox cb1 = new JComboBox(list);
		cb1.setBounds(300,420,200,40);
		f1.add(cb1);
		
		l9= new JLabel("Gender:");
		l9.setBounds(100, 470, 100, 40);
		f1.add(l9);
		
		male=new JRadioButton("Male");
		male.setBounds(100, 500, 80, 40);
		female=new JRadioButton("Female");
		female.setBounds(180, 500, 80, 40);
		radio = new ButtonGroup();
		radio.add(male);
		radio.add(female);
		f1.add(male);
		f1.add(female);
		
		l10= new JLabel("Languages :");
		l10.setBounds(100, 550, 100, 40);
		f1.add(l10);
		
		hindi=new JCheckBox("Hindi");
		hindi.setBounds(200, 550, 80, 40);
		f1.add(hindi);
		
		eng=new JCheckBox("English");
		eng.setBounds(300, 550, 80, 40);
		f1.add(eng);
		
		other=new JCheckBox("Other");
		other.setBounds(400, 550, 80, 40);
		f1.add(other);
		
		l11= new JLabel("Area of Interest :");
		l11.setBounds(100,600, 100, 40);
		f1.add(l11);
		
		python=new JCheckBox("Python Programming Language");
		python.setBounds(200, 600, 400, 30);
		f1.add(python);
		
		android=new JCheckBox("Android");
		android.setBounds(200, 630, 200, 30);
		f1.add(android);
		
		ml=new JCheckBox("Machine Learning");
		ml.setBounds(200, 660, 200, 30);
		f1.add(ml);
		
		cs=new JCheckBox("Cyber Security");
		cs.setBounds(200, 690, 200, 30);
		f1.add(cs);
		
		AJP=new JCheckBox("Advance Java");
		AJP.setBounds(200, 720, 200, 40);
		f1.add(AJP);
		
		others=new JCheckBox("Others");
		others.setBounds(200, 750, 100, 40);
		f1.add(others);
		
		l12= new JLabel("Address:");
		l12.setBounds(100,780, 100, 40);
		f1.add(l12);
		
		ta = new JTextArea(100,20);
		ta.setBounds(100,810, 400, 60);
		f1.add(ta);
		
		submit = new JButton("SUBMIT");
		submit.setBounds(200,880,100,40);
		submit.addActionListener(this);
		f1.add(submit);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Job_Application_Form();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int a = JOptionPane.showConfirmDialog(null, "Do you want to Confirm");
		
		if(a==JOptionPane.YES_OPTION)
		{
			myFrame();
			
		}
	
		else if(a==JOptionPane.CANCEL_OPTION)
		{
			
			JOptionPane.showMessageDialog(f1, "Cancel the Form");
		}
	}
	
	public void myFrame()
	{
	    f2=new JFrame();
		f2.setVisible(true);
		f2.setBounds(400,100,400,400);
		f2.setLayout(new FlowLayout(FlowLayout.CENTER,50,100));
		f2.setBackground(Color.cyan);
		l13 = new JLabel("Thank You for Fegistration");
		Font font=new Font(null, Font.ITALIC,30);
		l13.setFont(font);
		f2.add(l13);
		
		ok = new JButton("OK");
		ok.addActionListener(new ActionListener()
				 {

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						
						f2.setVisible(false);
						f1.setVisible(false);
					}
			
				 });
		f2.add(ok);
	}

}
