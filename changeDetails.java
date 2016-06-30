package Database;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class changeDetails 
{
	private static JFrame framechange;
	private static JFormattedTextField firstNameChange;
	private static JFormattedTextField secondNameChange;
	private static JFormattedTextField addressLine1Change;
	private static JFormattedTextField addressLine2Change;
	private static JFormattedTextField addressLine3Change;
	private static JFormattedTextField ppsNumberChange;
	private static JFormattedTextField studentIdChange;
	private static JFormattedTextField contactChange;
	private static JFormattedTextField emailChange;
	private static int position = 0;
	
	public static void closeChangeDetailsFrame()
	{
      	framechange.dispose();
   }
	
   public static void changeDetails(int i)
	{
	   setPosition(i);
	   if(DatabaseFinalV3.getsecondWindowIsOpne(7))
	   {
		   DatabaseFinalV3.setsecondWindowIsOpne(7, false);
		   framechange.dispose();
	   }
       if(DatabaseFinalV3.getsecondWindowIsOpne(7)==false)
		{
           DatabaseFinalV3.setsecondWindowIsOpne(7, true);//secondWindowIsOpne7=true;
           ImageIcon pc = null;
           String nameToPicture = Data.getSelectedName(i);//Data.Contacts.get(i).name;
           framechange = new JFrame("Change Details");
           framechange.setLayout(new GridLayout(3,1));
           ImageIcon imageIcon = new ImageIcon("C:\\Database_Images\\" + nameToPicture+".jpg"); // load the image to a imageIcon
           Image image = imageIcon.getImage(); // transform it
           Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_FAST); // scale it the smooth way 
           imageIcon = new ImageIcon(newimg);  // transform it back
           JLabel lab = new JLabel(pc, SwingConstants.CENTER);
           lab.setIcon(imageIcon);        
			//set up first row *******************************************************************
			JPanel fotoName = new JPanel();//get two panel in it
			JPanel name = new JPanel();//name, first,second
			name.setLayout(new GridLayout(4,1));
			name.setPreferredSize(new Dimension(300,200));
			JPanel name1 = new JPanel(new FlowLayout(FlowLayout.LEFT));//leave empty
			name1.setPreferredSize(new Dimension(300,50));
			JPanel name2 = new JPanel(new FlowLayout(FlowLayout.LEFT));//get first name
			name2.setPreferredSize(new Dimension(300,50));
			JPanel name3 = new JPanel(new FlowLayout(FlowLayout.LEFT));//get second name
			name3.setPreferredSize(new Dimension(300,50));     
			name.add(name1);//empty
			name.add(name2);//first name
			name.add(name3);//second name
			JLabel firstName = new JLabel("First name     :   ");
			firstNameChange = new JFormattedTextField(Data.getSelectedItem(i, "fName"));//Data.Contacts.get(i).fName);
			firstNameChange.setPreferredSize(new Dimension(180,20));
			firstNameChange.setEditable(true);
			name2.add(firstName); 
			name2.add(firstNameChange);
			JLabel secondName = new JLabel("Last name      :   ");
			secondNameChange = new JFormattedTextField(Data.getSelectedItem(i, "lName"));//Data.Contacts.get(i).lName);
			secondNameChange.setPreferredSize(new Dimension(180,20));
			secondNameChange.setEditable(true);
			secondNameChange.setSize(150, 15);
			name3.add(secondName);
			name3.add(secondNameChange);
			JPanel photo = new JPanel();//photo goes in it
			photo.setPreferredSize(new Dimension(300,200));
			photo.add(lab);//add image to panel
			fotoName.add(name);//name panel in to fotoName       
			fotoName.add(photo);//photo panel in to fotoName   

			JPanel detailsPanel = new JPanel();//get two panel in it
			//set up second row ********************************************************************
			JPanel addressLine1 = new JPanel();//main panel
			addressLine1.setLayout(new GridLayout(3,1));//get 3 panel in it
			JPanel previous = new JPanel();//left side
			previous.setPreferredSize(new Dimension(300,200));//left side dimension
			addressLine1.setPreferredSize(new Dimension(300,150));   //set main panel size   
			//inner addressline1 first panel
			JPanel addressLineInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			addressLineInner1.setPreferredSize(new Dimension(300,50));
			JLabel addressLine1Text = new JLabel("Street             :   ");
			addressLine1Change = new JFormattedTextField(Data.getSelectedItem(i, "addr1"));//Data.Contacts.get(i).addr1);
			addressLine1Change.setPreferredSize(new Dimension(180,20));
			addressLine1Change.setEditable(true);
			addressLine1.add(addressLineInner1);
			addressLineInner1.add(addressLine1Text);
			addressLineInner1.add(addressLine1Change);
			//second panel
			JPanel addressLine2Inner = new JPanel(new FlowLayout(FlowLayout.LEFT));//line 2
			addressLine2Inner.setPreferredSize(new Dimension(300,50));
			JLabel addressLine2InnerText = new JLabel("Town               :   " );
			addressLine2Change = new JFormattedTextField(Data.getSelectedItem(i, "addr2"));//Data.Contacts.get(i).addr2);
			addressLine2Change.setPreferredSize(new Dimension(180,20));
			addressLine2Inner.add(addressLine2InnerText);
			addressLine1.add(addressLine2Inner);
			addressLine2Inner.add(addressLine2Change);
			//third panel
			JPanel addressLine3Inner = new JPanel(new FlowLayout(FlowLayout.LEFT));
			addressLine3Inner.setPreferredSize(new Dimension(300,50));
			JLabel addressLine4InnerText = new JLabel("Counti             :   " );
			addressLine3Change = new JFormattedTextField(Data.getSelectedItem(i, "addr3"));//Data.Contacts.get(i).addr3);
			addressLine3Change.setPreferredSize(new Dimension(180,20));
			addressLine3Inner.add(addressLine4InnerText);
			addressLine1.add(addressLine3Inner);
			addressLine3Inner.add(addressLine3Change);
			JPanel thirdMainPanel = new JPanel();
  
			//set up third row***************************************************************** 
			JPanel thirdMain = new JPanel(new FlowLayout(FlowLayout.LEFT));//main panel
			thirdMain.setLayout(new GridLayout(3,1));// get 3 panel in it  
			JPanel thirdLeft = new JPanel();//left side
			thirdLeft.setPreferredSize(new Dimension(300,150));//set amin panel size
		   // thirdLeft.setBackground(Color.red);
			
			JPanel previousInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));//first line left under picture
			JLabel addressLine3InnerText = new JLabel("PPS number     :   ");
			previousInner1.setPreferredSize(new Dimension(300,50));
			ppsNumberChange = new JFormattedTextField(Data.getSelectedItem(i, "PPSN"));//Data.Contacts.get(i).PPSN);
			ppsNumberChange.setPreferredSize(new Dimension(180,20));
			ppsNumberChange.setEditable(true);
			previousInner1.add(addressLine3InnerText);
			previousInner1.add(ppsNumberChange);
			previous.add(previousInner1);
			thirdLeft.add(previousInner1);      
			JPanel previousInner2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel emailInner = new JLabel("Email address  :   " );
			previousInner2.setPreferredSize(new Dimension(300, 50));
			emailChange =new JFormattedTextField(Data.getSelectedItem(i, "emad"));// new JFormattedTextField(Data.Contacts.get(i).emad);
			emailChange.setPreferredSize(new Dimension(180, 20));
			emailChange.setEditable(true);
			previousInner2.add(emailInner);
			previousInner2.add(emailChange);
			previous.add(previousInner2);
			thirdLeft.add(previousInner2);       
			JPanel previousInner3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			//JLabel emailInner3 = new JLabel("Email address       :       " + Data.Contacts.get(i).emad);
			previousInner3.setPreferredSize(new Dimension(300, 50));
		   // previousInner3.add(emailInner3);
			previous.add(previousInner3);
			thirdLeft.add(previousInner3);
			
			//firstrow in third main
			JPanel thirdPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			thirdPanel.setPreferredSize(new Dimension(300,50));
			JLabel studentIDText = new JLabel("Student ID      :   ");
			studentIdChange = new JFormattedTextField(Data.getSelectedItem(i, "StuID"));//Data.Contacts.get(i).StuID);
			studentIdChange.setPreferredSize(new Dimension(180,20));
			studentIdChange.setEditable(true);
			thirdPanel.add(studentIDText);
			thirdPanel.add(studentIdChange);
			thirdMain.add(thirdPanel);
			//second row
			JPanel detailsThird = new JPanel(new FlowLayout(FlowLayout.LEFT));
			detailsThird.setPreferredSize(new Dimension(300,50));
			JLabel contactText = new JLabel("Contact          :   ");
			contactChange = new JFormattedTextField(Data.getSelectedItem(i, "contact"));//Data.Contacts.get(i).contact);
			contactChange.setPreferredSize(new Dimension(180,20));
			detailsThird.add(contactText);
			detailsThird.add(contactChange);
			thirdMain.add(detailsThird);
			//third row
			JPanel thirdInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			thirdInner1.setPreferredSize(new Dimension(300,50));
			JButton changeDet = new JButton("Save Changes");
			thirdInner1.add(changeDet);
			changeDet.addActionListener(new saveChanges());// save changes button
			

			thirdMain.add(thirdInner1);   
			framechange.add(fotoName);//first row
			fotoName.add(name);//rigth side names        
			fotoName.add(photo);//left side picture
			framechange.add(detailsPanel);//second row
			detailsPanel.add(addressLine1);     
			detailsPanel.add(previous);//left side second row
			framechange.add(thirdMainPanel);//third row
			thirdMainPanel.add(thirdMain);//get 3 in it
			thirdMainPanel.add(thirdLeft);//third row left
			framechange.setMinimumSize(new Dimension(650,600));
			framechange.setLocation(500, 0);
			framechange.setVisible(true);
			framechange.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					DatabaseFinalV3.setsecondWindowIsOpne(7, false);//secondWindowIsOpne7=false;
				}    
			});
       }
   }
   private static void setPosition(int i)
   {
	   position = i;
   }
   
   public static int getPosition()
   {
	   return position;
   }
   public static void setVariables()
   {
   	GlobalValues.setFullName(firstNameChange.getText() + " " + secondNameChange.getText() );
   	GlobalValues.setFirstlName(firstNameChange.getText());
   	GlobalValues.setLastName(secondNameChange.getText());
   	GlobalValues.setAddress1(addressLine1Change.getText());
   	GlobalValues.setAddress2(addressLine2Change.getText());
   	GlobalValues.setAddress3(addressLine3Change.getText());
   	GlobalValues.setPPSNumber(ppsNumberChange.getText());
   	GlobalValues.setStudentId(studentIdChange.getText());
   	GlobalValues.setContactNumber(contactChange.getText());
   	GlobalValues.setEmail(emailChange.getText());
    DatabaseFinalV3.setsecondWindowIsOpne(7, false);
   	framechange.dispose();
   }
   
   }