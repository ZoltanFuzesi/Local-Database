<<<<<<< HEAD
package Database;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Temp
	{
      static int index = 0;
      static private String tempName;
      static private String tempFName;
      static private String templName;
      static private String tempAddr1;
      static private String tempAddr2;
      static private String tempAddr3;
      static private String tempPPS;
      static private String tempStudID;
      static private String tempContact;
      static private String tempEmad;

      private static ArrayList <Temp> temP = new ArrayList<Temp>();

      public static void Temp(int s)
		{
          tempName = Data.getSelectedItem(s, "name");
          tempFName = Data.getSelectedItem(s, "fName");
          templName = Data.getSelectedItem(s, "lName");
          tempAddr1 = Data.getSelectedItem(s, "addr1");
          tempAddr2 = Data.getSelectedItem(s, "addr2");
          tempAddr3 = Data.getSelectedItem(s, "addr3");
          tempPPS = Data.getSelectedItem(s, "PPSN");
          tempStudID = Data.getSelectedItem(s, "StuID");
          tempContact = Data.getSelectedItem(s, "contact");
          tempEmad = Data.getSelectedItem(s, "emad");
      }

      static String getName()
		{
          return tempName;//Data.Contacts.get(s).name;
      }
       static String getFName()
		 {
           return tempFName;
       }
       
        static String getLName()
		  {
            return templName;
        }
         static String getAddr1()
		   {
             return tempAddr1;
         }
          static String getAddr2()
			{
              return tempAddr2;
          }
          static String getAddr3()
			{
              return tempAddr3;
          }
      static String getPPS()
		{
          return tempPPS;//Data.Contacts.get(s).address;
      }
      static String getStudID()
		{
          return tempStudID;
      }
       static String getContact()
		 {
           return tempContact;
       }
       static String getEmad()
		 {
           return tempEmad;
       }

      
  

  //*****************************************************************************************************

  //**************************************************************************************************

    
      //*************************************************************************************************

      //******************************************************************************************************
      public static void emptyM()
		{
         
          
          
          JFrame frameOK = new JFrame("Database message");
          frameOK.setSize(300,150);
          frameOK.setLocation(100,100);
          frameOK.setResizable(false);
          JLabel er = new JLabel("The Name field is empty");//+ Contacts.get(Contacts.size()).name);
          JLabel er2 = new JLabel("Please fill up name fileds");
          JPanel panel1 = new JPanel(new GridLayout(2,1));
          JPanel first = new JPanel(new FlowLayout(FlowLayout.CENTER));
          JPanel second = new JPanel(new FlowLayout(FlowLayout.CENTER));
          frameOK.add(panel1);
          frameOK.setTitle("Database message");       
          panel1.add(first);
          panel1.add(second);
          first.add(er);
          second.add(er2);
          
          frameOK.setVisible(true);
      }
=======
package Database;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Temp
	{
      static int index = 0;
      static private String tempName;
      static private String tempFName;
      static private String templName;
      static private String tempAddr1;
      static private String tempAddr2;
      static private String tempAddr3;
      static private String tempPPS;
      static private String tempStudID;
      static private String tempContact;
      static private String tempEmad;

      private static ArrayList <Temp> temP = new ArrayList<Temp>();

      public static void Temp(int s)
		{
          tempName = Data.getSelectedItem(s, "name");
          tempFName = Data.getSelectedItem(s, "fName");
          templName = Data.getSelectedItem(s, "lName");
          tempAddr1 = Data.getSelectedItem(s, "addr1");
          tempAddr2 = Data.getSelectedItem(s, "addr2");
          tempAddr3 = Data.getSelectedItem(s, "addr3");
          tempPPS = Data.getSelectedItem(s, "PPSN");
          tempStudID = Data.getSelectedItem(s, "StuID");
          tempContact = Data.getSelectedItem(s, "contact");
          tempEmad = Data.getSelectedItem(s, "emad");
      }

      static String getName()
		{
          return tempName;//Data.Contacts.get(s).name;
      }
       static String getFName()
		 {
           return tempFName;
       }
       
        static String getLName()
		  {
            return templName;
        }
         static String getAddr1()
		   {
             return tempAddr1;
         }
          static String getAddr2()
			{
              return tempAddr2;
          }
          static String getAddr3()
			{
              return tempAddr3;
          }
      static String getPPS()
		{
          return tempPPS;//Data.Contacts.get(s).address;
      }
      static String getStudID()
		{
          return tempStudID;
      }
       static String getContact()
		 {
           return tempContact;
       }
       static String getEmad()
		 {
           return tempEmad;
       }

      
  

  //*****************************************************************************************************

  //**************************************************************************************************

    
      //*************************************************************************************************

      //******************************************************************************************************
      public static void emptyM()
		{
         
          
          
          JFrame frameOK = new JFrame("Database message");
          frameOK.setSize(300,150);
          frameOK.setLocation(100,100);
          frameOK.setResizable(false);
          JLabel er = new JLabel("The Name field is empty");//+ Contacts.get(Contacts.size()).name);
          JLabel er2 = new JLabel("Please fill up name fileds");
          JPanel panel1 = new JPanel(new GridLayout(2,1));
          JPanel first = new JPanel(new FlowLayout(FlowLayout.CENTER));
          JPanel second = new JPanel(new FlowLayout(FlowLayout.CENTER));
          frameOK.add(panel1);
          frameOK.setTitle("Database message");       
          panel1.add(first);
          panel1.add(second);
          first.add(er);
          second.add(er2);
          
          frameOK.setVisible(true);
      }
>>>>>>> origin/master
  }