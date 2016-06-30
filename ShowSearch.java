<<<<<<< HEAD
package Database;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ShowSearch  
	{
	
	private static JFrame frame;

      public static void ShowSearch(int i)
		{
          
			if(DatabaseFinalV3.getsecondWindowIsOpne(5)==false)
			{
				buildFrame(i);
			}
			else
			{
				frame.dispose();
				 DatabaseFinalV3.setsecondWindowIsOpne(5, false);
				buildFrame(i);
			}
      }
      
      public static void buildFrame(int i)
      {
    	  ImageIcon pc = null;
    	     
			String nameToPicture = Data.getSelectedItem(i, "name");//Data.Contacts.get(i).name;
    	  DatabaseFinalV3.setsecondWindowIsOpne(5, true);//secondWindowIsOpne5=true;
          
			frame = new JFrame("Details");
			frame.setLayout(new GridLayout(3,1));
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
			JLabel firstName = new JLabel("First name     :      " + Data.getSelectedItem(i, "fName"));
			name2.add(firstName);  
			JLabel secondName = new JLabel("Last name      :      " + Data.getSelectedItem(i, "lName"));
			name3.add(secondName);
			JPanel photo = new JPanel();//photo goes in it
			photo.setPreferredSize(new Dimension(300,200));
			photo.add(lab);//add image to panel
			fotoName.add(name);//name panel in to fotoName       
			fotoName.add(photo);//photo panel in to fotoName   
			JPanel detailsPanel = new JPanel();//get two panel in it
		   
			//set up second row ********************************************************************
			JPanel addressLine1 = new JPanel();//main panel
			addressLine1.setPreferredSize(new Dimension(300,150));   //set main panel size   
			addressLine1.setLayout(new GridLayout(3,1));//get 3 panel in it
			JPanel previous = new JPanel();//left side
			previous.setPreferredSize(new Dimension(300,150));//left side dimension
		   // previous.setBackground(Color.red);//split up two************************************
			previous.setLayout(new GridLayout(3,1));
			JPanel previousInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));//first line left under picture
			// JLabel ppsinner = new JLabel("PPS number          :      " + Data.Contacts.get(i).PPSN);
		   // previousInner1.setPreferredSize(new Dimension(300, 50));
		   // previousInner1.add(ppsinner);
		   // previous.add(previousInner1);

			JPanel previousInner2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	//        JLabel emailInner = new JLabel("Email address       :       " + Data.Contacts.get(i).emad);
	//        previousInner2.setPreferredSize(new Dimension(300, 50));
	//        previousInner2.add(emailInner);
	//        previous.add(previousInner2);
			
	//        JPanel previousInner3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	//        JLabel emailInner3 = new JLabel("Email address       :       " + Data.Contacts.get(i).emad);
	//        previousInner3.setPreferredSize(new Dimension(300, 50));
	//        previousInner3.add(emailInner3);
	//        previous.add(previousInner3);
			
			//inner addressline1 first panel
			JPanel addressLineInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			addressLineInner1.setPreferredSize(new Dimension(300,50));
			JLabel addressLine1Text = new JLabel("Street         :      " + Data.getSelectedItem(i, "addr1"));
			addressLine1.add(addressLineInner1);
			addressLineInner1.add(addressLine1Text);
			//second panel
			JPanel addressLine2Inner = new JPanel(new FlowLayout(FlowLayout.LEFT));//line 2
			addressLine2Inner.setPreferredSize(new Dimension(300,50));
			JLabel addressLine2InnerText = new JLabel("City            :        " + Data.getSelectedItem(i, "addr2"));
			addressLine2Inner.add(addressLine2InnerText);
			addressLine1.add(addressLine2Inner);
			//third panel
			JPanel addressLine3Inner = new JPanel(new FlowLayout(FlowLayout.LEFT));
			addressLine3Inner.setPreferredSize(new Dimension(300,50));
			JLabel addressLine3InnerText = new JLabel("Counti         :      " + Data.getSelectedItem(i, "addr3"));
			addressLine3Inner.add(addressLine3InnerText);
			addressLine1.add(addressLine3Inner);
			JPanel thirdMainPanel = new JPanel();
			//set up third row***************************************************************** 
			JPanel thirdMain = new JPanel(new FlowLayout(FlowLayout.LEFT));//main panel
			thirdMain.setLayout(new GridLayout(3,1));// get 3 panel in it
			JPanel thirdLeft = new JPanel();//left side
			thirdLeft.setLayout(new GridLayout(3,1));
			thirdLeft.setPreferredSize(new Dimension(300,150));//set main panel size
			
			JPanel thirdLeftInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));//1 row left
			JLabel ppsinner2 = new JLabel("PPS number          :      " + Data.getSelectedItem(i, "PPSN"));
			thirdLeftInner1.setPreferredSize(new Dimension(300, 50));
			thirdLeftInner1.add(ppsinner2);
			thirdLeft.add(thirdLeftInner1);
	   //     thirdLeft.setBackground(Color.BLACK);
			
			JPanel thirdLeftInner2 = new JPanel(new FlowLayout(FlowLayout.LEFT));//2 row left
			JLabel emailInner2 = new JLabel("Email address       :       " + Data.getSelectedItem(i, "emad"));
			thirdLeftInner2.setPreferredSize(new Dimension(300, 50));
			thirdLeftInner2.add(emailInner2);
			thirdLeft.add(thirdLeftInner2);

			//firstrow in third main
			JPanel thirdPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			thirdPanel.setPreferredSize(new Dimension(300,50));
			JLabel studentIDText = new JLabel("Student ID      :      " + Data.getSelectedItem(i, "StuID"));    
			thirdPanel.add(studentIDText);
			thirdMain.add(thirdPanel);
			//second row
			JPanel detailsThird = new JPanel(new FlowLayout(FlowLayout.LEFT));
			detailsThird.setPreferredSize(new Dimension(300,50));
			JLabel contactText = new JLabel("Contact          :      " + Data.getSelectedItem(i, "contact"));
			detailsThird.add(contactText);
			thirdMain.add(detailsThird);
			//thirdMain.setBackground(Color.BLACK);
			//third row
			JPanel thirdInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			thirdInner1.setPreferredSize(new Dimension(300,50));
		   // JLabel something = new JLabel("something");
		   // thirdInner1.add(something);
			thirdMain.add(thirdInner1);
			frame.add(fotoName);//first row
			fotoName.add(name);//rigth side names        
			fotoName.add(photo);//left side picture
			frame.add(detailsPanel);//second row
			detailsPanel.add(addressLine1);     
			detailsPanel.add(previous);//left side second row
			frame.add(thirdMainPanel);//third row
			thirdMainPanel.add(thirdMain);//get 3 in it
			thirdMainPanel.add(thirdLeft);//third row left
			frame.setMinimumSize(new Dimension(650,600));
			frame.setLocation(500, 0);
			frame.setVisible(true);
			
			frame.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					DatabaseFinalV3.setsecondWindowIsOpne(5, false);//secondWindowIsOpne5=false;
				}
			});
      }
=======
package Database;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ShowSearch  
	{
	
	private static JFrame frame;

      public static void ShowSearch(int i)
		{
          
			if(DatabaseFinalV3.getsecondWindowIsOpne(5)==false)
			{
				buildFrame(i);
			}
			else
			{
				frame.dispose();
				 DatabaseFinalV3.setsecondWindowIsOpne(5, false);
				buildFrame(i);
			}
      }
      
      public static void buildFrame(int i)
      {
    	  ImageIcon pc = null;
    	     
			String nameToPicture = Data.getSelectedItem(i, "name");//Data.Contacts.get(i).name;
    	  DatabaseFinalV3.setsecondWindowIsOpne(5, true);//secondWindowIsOpne5=true;
          
			frame = new JFrame("Details");
			frame.setLayout(new GridLayout(3,1));
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
			JLabel firstName = new JLabel("First name     :      " + Data.getSelectedItem(i, "fName"));
			name2.add(firstName);  
			JLabel secondName = new JLabel("Last name      :      " + Data.getSelectedItem(i, "lName"));
			name3.add(secondName);
			JPanel photo = new JPanel();//photo goes in it
			photo.setPreferredSize(new Dimension(300,200));
			photo.add(lab);//add image to panel
			fotoName.add(name);//name panel in to fotoName       
			fotoName.add(photo);//photo panel in to fotoName   
			JPanel detailsPanel = new JPanel();//get two panel in it
		   
			//set up second row ********************************************************************
			JPanel addressLine1 = new JPanel();//main panel
			addressLine1.setPreferredSize(new Dimension(300,150));   //set main panel size   
			addressLine1.setLayout(new GridLayout(3,1));//get 3 panel in it
			JPanel previous = new JPanel();//left side
			previous.setPreferredSize(new Dimension(300,150));//left side dimension
		   // previous.setBackground(Color.red);//split up two************************************
			previous.setLayout(new GridLayout(3,1));
			JPanel previousInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));//first line left under picture
			// JLabel ppsinner = new JLabel("PPS number          :      " + Data.Contacts.get(i).PPSN);
		   // previousInner1.setPreferredSize(new Dimension(300, 50));
		   // previousInner1.add(ppsinner);
		   // previous.add(previousInner1);

			JPanel previousInner2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	//        JLabel emailInner = new JLabel("Email address       :       " + Data.Contacts.get(i).emad);
	//        previousInner2.setPreferredSize(new Dimension(300, 50));
	//        previousInner2.add(emailInner);
	//        previous.add(previousInner2);
			
	//        JPanel previousInner3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	//        JLabel emailInner3 = new JLabel("Email address       :       " + Data.Contacts.get(i).emad);
	//        previousInner3.setPreferredSize(new Dimension(300, 50));
	//        previousInner3.add(emailInner3);
	//        previous.add(previousInner3);
			
			//inner addressline1 first panel
			JPanel addressLineInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			addressLineInner1.setPreferredSize(new Dimension(300,50));
			JLabel addressLine1Text = new JLabel("Street         :      " + Data.getSelectedItem(i, "addr1"));
			addressLine1.add(addressLineInner1);
			addressLineInner1.add(addressLine1Text);
			//second panel
			JPanel addressLine2Inner = new JPanel(new FlowLayout(FlowLayout.LEFT));//line 2
			addressLine2Inner.setPreferredSize(new Dimension(300,50));
			JLabel addressLine2InnerText = new JLabel("City            :        " + Data.getSelectedItem(i, "addr2"));
			addressLine2Inner.add(addressLine2InnerText);
			addressLine1.add(addressLine2Inner);
			//third panel
			JPanel addressLine3Inner = new JPanel(new FlowLayout(FlowLayout.LEFT));
			addressLine3Inner.setPreferredSize(new Dimension(300,50));
			JLabel addressLine3InnerText = new JLabel("Counti         :      " + Data.getSelectedItem(i, "addr3"));
			addressLine3Inner.add(addressLine3InnerText);
			addressLine1.add(addressLine3Inner);
			JPanel thirdMainPanel = new JPanel();
			//set up third row***************************************************************** 
			JPanel thirdMain = new JPanel(new FlowLayout(FlowLayout.LEFT));//main panel
			thirdMain.setLayout(new GridLayout(3,1));// get 3 panel in it
			JPanel thirdLeft = new JPanel();//left side
			thirdLeft.setLayout(new GridLayout(3,1));
			thirdLeft.setPreferredSize(new Dimension(300,150));//set main panel size
			
			JPanel thirdLeftInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));//1 row left
			JLabel ppsinner2 = new JLabel("PPS number          :      " + Data.getSelectedItem(i, "PPSN"));
			thirdLeftInner1.setPreferredSize(new Dimension(300, 50));
			thirdLeftInner1.add(ppsinner2);
			thirdLeft.add(thirdLeftInner1);
	   //     thirdLeft.setBackground(Color.BLACK);
			
			JPanel thirdLeftInner2 = new JPanel(new FlowLayout(FlowLayout.LEFT));//2 row left
			JLabel emailInner2 = new JLabel("Email address       :       " + Data.getSelectedItem(i, "emad"));
			thirdLeftInner2.setPreferredSize(new Dimension(300, 50));
			thirdLeftInner2.add(emailInner2);
			thirdLeft.add(thirdLeftInner2);

			//firstrow in third main
			JPanel thirdPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			thirdPanel.setPreferredSize(new Dimension(300,50));
			JLabel studentIDText = new JLabel("Student ID      :      " + Data.getSelectedItem(i, "StuID"));    
			thirdPanel.add(studentIDText);
			thirdMain.add(thirdPanel);
			//second row
			JPanel detailsThird = new JPanel(new FlowLayout(FlowLayout.LEFT));
			detailsThird.setPreferredSize(new Dimension(300,50));
			JLabel contactText = new JLabel("Contact          :      " + Data.getSelectedItem(i, "contact"));
			detailsThird.add(contactText);
			thirdMain.add(detailsThird);
			//thirdMain.setBackground(Color.BLACK);
			//third row
			JPanel thirdInner1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			thirdInner1.setPreferredSize(new Dimension(300,50));
		   // JLabel something = new JLabel("something");
		   // thirdInner1.add(something);
			thirdMain.add(thirdInner1);
			frame.add(fotoName);//first row
			fotoName.add(name);//rigth side names        
			fotoName.add(photo);//left side picture
			frame.add(detailsPanel);//second row
			detailsPanel.add(addressLine1);     
			detailsPanel.add(previous);//left side second row
			frame.add(thirdMainPanel);//third row
			thirdMainPanel.add(thirdMain);//get 3 in it
			thirdMainPanel.add(thirdLeft);//third row left
			frame.setMinimumSize(new Dimension(650,600));
			frame.setLocation(500, 0);
			frame.setVisible(true);
			
			frame.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					DatabaseFinalV3.setsecondWindowIsOpne(5, false);//secondWindowIsOpne5=false;
				}
			});
      }
>>>>>>> origin/master
  }