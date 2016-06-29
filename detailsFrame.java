package Database;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class detailsFrame implements ActionListener
	{
	
		private static JFormattedTextField firstNameText = new JFormattedTextField();
	    private static JFormattedTextField secondNameText = new JFormattedTextField();
	    private static JFormattedTextField addressLine1Text= new JFormattedTextField();
	    private static JFormattedTextField addressLine2Text = new JFormattedTextField();
	    private static JFormattedTextField ppsNumberText = new JFormattedTextField();
	    private static JFormattedTextField studentIdText = new JFormattedTextField();
	    private static JFormattedTextField contactText= new JFormattedTextField();
	    private static JFormattedTextField emailText= new JFormattedTextField();
	    private static JFrame frameAdd;
	    
	    public static void setVariables()
	    {
	    	GlobalValues.setFullName(firstNameText.getText() + " " + secondNameText.getText() );
	    	GlobalValues.setFirstlName(firstNameText.getText());
	    	GlobalValues.setLastName(secondNameText.getText());
	    	GlobalValues.setAddress1(addressLine1Text.getText());
	    	GlobalValues.setAddress2(addressLine2Text.getText());
	    	GlobalValues.setPPSNumber(ppsNumberText.getText());
	    	GlobalValues.setStudentId(studentIdText.getText());
	    	GlobalValues.setContactNumber(contactText.getText());
	    	GlobalValues.setEmail(emailText.getText());
	    }
      public static void  detailsFrame()
		{
    	  	GlobalValues.emptyAllVariable();
			if(DatabaseFinalV3.getsecondWindowIsOpne(1) == false)
			{
				DatabaseFinalV3.setsecondWindowIsOpne(1, false);//secondWindowIsOpne1  = true;
				frameAdd = new JFrame("Add details ");
				String [] countys = new String[]{" ","Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", 
				"Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois",
				"Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon",
				"Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow"};
				
				System.out.println("New Frame Details frame");
				
				JPanel clickButtonleft = new JPanel();//row 1
				JButton button = new JButton("Add");
				button.addActionListener(new ActionAdd()); 
				JPanel clickButtonRight = new JPanel();
				JLabel bottonSide = new JLabel("DETAILS : ");
				
				JPanel panelTop = new JPanel(new FlowLayout(FlowLayout.LEFT)); //row 2
				JLabel first = new JLabel("             First name :   ");
				JPanel panelTopRight = new JPanel();
				firstNameText = new JFormattedTextField();
				firstNameText.setPreferredSize(new Dimension(180,20));
			
		
				JPanel panelMiddle = new JPanel(new FlowLayout(FlowLayout.LEFT));  //row 3
				JLabel second = new JLabel("             Last name :  ");
				JPanel panelMiddleRight = new JPanel();
				secondNameText = new JFormattedTextField();
				secondNameText.setPreferredSize(new Dimension(180,20));
				
				JPanel panelBottom = new JPanel(new FlowLayout(FlowLayout.LEFT));  //row4
				JLabel address1 = new JLabel("             Street  :    ");
				JPanel panelBottomRight = new JPanel();
				addressLine1Text = new JFormattedTextField();
				addressLine1Text.setPreferredSize(new Dimension(180,20));
				
				JPanel panelUnder1Left = new JPanel(new FlowLayout(FlowLayout.LEFT));//row 5
				JLabel address2 = new JLabel("             Town :    ");
				JPanel panelUnder1Right = new JPanel();
				addressLine2Text = new JFormattedTextField();
				addressLine2Text.setPreferredSize(new Dimension(180,20));
			
				JPanel panelUnder105Left = new JPanel();//row 6
				JLabel countyL = new JLabel("             County :    ");
				JPanel panelUnder105Right = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JComboBox county = new JComboBox(countys);
				county.setPreferredSize(new Dimension(180,20));
				ActionListener actionListener = new ActionListener()
				{
				@Override
					public void actionPerformed(ActionEvent actionEvent)
					{      
						GlobalValues.setAddress3(county.getSelectedItem().toString());
						System.out.println("Action listner to county " + county.getSelectedItem().toString());
						String myItem = county.getSelectedItem().toString();
						//System.out.println(myItem);
					}
				};
				county.addActionListener(actionListener);
				//change PPS ans Email to next panel
				JPanel panelUnder2Left = new JPanel(new FlowLayout(FlowLayout.LEFT));//row 7
				JLabel pps = new JLabel("             PPS number :   ");
				JPanel panelUnder2Right = new JPanel();
				ppsNumberText = new JFormattedTextField();
				ppsNumberText.setPreferredSize(new Dimension(180,20));
				
				JPanel panelUnder3Left = new JPanel(new FlowLayout(FlowLayout.LEFT));//row 8
				JLabel studentID = new JLabel("             Student ID :   ");
				JPanel panelUnder3Right = new JPanel();
				studentIdText = new JFormattedTextField();
				studentIdText.setPreferredSize(new Dimension(180,20));
			
				JPanel panelUnder4Left = new JPanel(new FlowLayout(FlowLayout.LEFT));//row 9
				JLabel contact = new JLabel("             Contact :      ");
				JPanel panelUnder4Right = new JPanel();
				contactText = new JFormattedTextField();
				contactText.setPreferredSize(new Dimension(180,20));
				
				JPanel panelUnder5Left = new JPanel(new FlowLayout(FlowLayout.LEFT));//row 9
				JLabel email = new JLabel("             E-mail :      ");
				JPanel panelUnder5Right = new JPanel();
				emailText = new JFormattedTextField();
				emailText.setPreferredSize(new Dimension(180,20));
	 
				clickButtonleft.add(button);
				clickButtonRight.add(bottonSide);

				panelTop.add(first);
				panelTopRight.add(firstNameText);
				panelMiddle.add(second);
				panelMiddleRight.add(secondNameText);  
				panelBottom.add(address1);
				panelBottomRight.add(addressLine1Text); 
				panelUnder1Left.add(address2);  
				panelUnder1Right.add(addressLine2Text);      
				panelUnder105Right.add(countyL);
				panelUnder105Left.add(county);     
				panelUnder2Left.add(pps);     
				panelUnder2Right.add(ppsNumberText);
				panelUnder3Left.add(studentID); 
				panelUnder3Right.add(studentIdText);   
				panelUnder4Left.add(contact);  
				panelUnder4Right.add(contactText);     
				panelUnder5Left.add(email);  
				panelUnder5Right.add(emailText);
					   
				//frame properties
				frameAdd.setMinimumSize(new Dimension(400, 400));
				frameAdd.setResizable(false);
				frameAdd.setLayout(new GridLayout(10, 2));           
				frameAdd.add(clickButtonleft);
				frameAdd.add(clickButtonRight);
				frameAdd.add(panelTop);
				frameAdd.add(panelTopRight);
				frameAdd.add(panelMiddle);
				frameAdd.add(panelMiddleRight);
				frameAdd.add(panelBottom);
				frameAdd.add(panelBottomRight);
				frameAdd.add(panelUnder1Left);
				frameAdd.add(panelUnder1Right);
				frameAdd.add(panelUnder105Right);
				frameAdd.add(panelUnder105Left);
				frameAdd.add(panelUnder2Left); 
				frameAdd.add(panelUnder2Right);
				frameAdd.add(panelUnder3Left);
				frameAdd.add(panelUnder3Right);
				frameAdd.add(panelUnder4Left);
				frameAdd.add(panelUnder4Right);
				frameAdd.add(panelUnder5Left);
				frameAdd.add(panelUnder5Right);
				frameAdd.setVisible(true);
				frameAdd.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						DatabaseFinalV3.setsecondWindowIsOpne(1,false);//secondWindowIsOpne1 = false;
					}
				}); 
			}  
      }
       public static void  getFrameAdd()
		 {
           frameAdd.dispose();          
       }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String command = e.getActionCommand();
      /*   if (command.equals("Add")) 
			{ 
             
             System.out.println("Add method called");
             String firstName = GlobalValues.getFirstName();//firstNameText.getText();
             String lastName = GlobalValues.getLastName();//secondNameText .getText();
             String address1 = GlobalValues.getAddress1();//addressLine1Text.getText();
             String address2 = GlobalValues.getAddress2();//addressLine2Text.getText();
             String address3 = GlobalValues.getAddress3();//myItem;
             String PPSNumber= GlobalValues.getPPSNumber();//ppsNumberText.getText();
             String studentID = GlobalValues.getStudentId();//studentIdText.getText();
             String contact = GlobalValues.getContactNumber();//contactText.getText();
             String emailAddress = GlobalValues.getEmail();//emailText.getText();
             String name = firstName + " " + lastName;
             GlobalValues.setFullName(firstName + " " + lastName); 
             if(firstName!=" "&&lastName!=" "&&address1!=" "&&address2!=" "&&address3!=" "&&PPSNumber!=" "&&contact!=" "&&emailAddress!=" "&&name!=" ")
             {
	             Data.Data(name, firstName, lastName, address1, address2, address3, PPSNumber, studentID, contact, emailAddress);
					try 
					{
	                 Mentes.Mentes(GlobalValues.getFullName());  
	             } catch (IOException ex){
	                 Logger.getLogger(DatabaseFinalV3.class.getName()).log(Level.SEVERE, null, ex);
	             } 
						detailsFrame.getFrameAdd();
						DatabaseFinalV3.setsecondWindowIsOpne(1, false);//secondWindowIsOpne1=false;
             }
             else
             {
            	 JOptionPane.showMessageDialog(null, "Empty fields");
             }
         }	*/
	}
   }