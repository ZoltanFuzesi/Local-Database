package Database;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Data 
	{

      private static int i;
      private String fName;
      private String lName;
      private String addr1;
      private String addr2;
      private String addr3;
      private String PPSN;
      private String StuID;
      private String contact;
      private String emad;
      private String name;

      private static ArrayList<Data> Contacts = new ArrayList<Data>();
      
      public Data()
      {
    	  
      }
      
      public Data(String n, String fn, String ln, String a1, String a2, String a3, String PPS, String sID, String c, String em)
    		{
              this.name = n;
              this.fName = fn;
              this.lName = ln;
              this.addr1 = a1;
              this.addr2 = a2;
              this.addr3 = a3;
              this.PPSN = PPS;
              this.StuID = sID;
              this.contact = c;
              this.emad = em;
          }
      
      public static void Data(String n, String fn, String ln, String a1, String a2, String a3, String PPS, String sID, String c, String em)
		{
        
          char chn = n.charAt(0);
			int chInt = (int)chn;
			System.out.println("The character value is ; " + chInt);
      	int error =0;
          String temp = "";
          
          System.out.println("Array size number Of stud: " + Contacts.size());
          System.out.println("Array size() : " + Contacts.size());
          System.out.println("Error " + error);
          if(chn==32)
			{
          		JOptionPane.showMessageDialog(null, "Empty name!");
          }
          else
			{
				if(Contacts.size()>0 && error == 0)
				{
					for(int i=0;i<Contacts.size();i++)
					{
						temp = Contacts.get(i).name;
						if(error>0){
                      break;
                  }
                  for(int j=0;j<Contacts.size();j++)
					{
                      if(temp.equalsIgnoreCase(n))
						{
                    	  JOptionPane.showMessageDialog(null, "The Name is already in database " + getSelectedName(i));
                          error++;
                          break;
                      }
                  }
              }
              if(error==0)
				{
                  Data objt = new Data(n, fn, ln, a1, a2, a3,PPS, sID, c, em); // Creating a new object
                  Contacts.add(objt); // Adding it to the list
                  System.out.println(n);
                  JOptionPane.showMessageDialog(null, "The name added to database : " + n);
                  //addMessage(n);
                  error++;              
              }
          }
          else if(error==0 && !n.equals("")&& Contacts.size()==0)
			{
              Data objt = new Data(n, fn, ln, a1, a2, a3,PPS, sID, c, em);; // Creating a new object
              Contacts.add(objt); // Adding it to the list
              JOptionPane.showMessageDialog(null, "The name added to database : " + n);
              System.out.println(Contacts.get(i).name);
              error = 0;
          }
          else if(n.equals(""))
			{
              error++;             
          }
          }
      }

      public static void Data1(String n, String fn, String ln, String a1, String a2, String a3, String PPS, String sID, String c, String em)
		{
          Data objt = new Data(n, fn, ln, a1, a2, a3,PPS, sID, c, em);// Creating a new object
          Contacts.add(objt); // Adding it to the list
      }

      public static String[] getNames()
      {
    	  String [] arr = new String[Contacts.size()];
    	  for(int i=0; i<Contacts.size();i++)
    	  {
    		  arr[i] = Contacts.get(i).name;
    	  }
    	  return arr;
      }
      
      public void addMessage(String n)
		{
            
          JFrame frameOK = new JFrame("Added to Database");
          frameOK.setSize(300,150);
          frameOK.setLocation(100,100);
          frameOK.setResizable(false);
          JLabel er = new JLabel("The Name added to Databasse ");//+ Contacts.get(Contacts.size()).name);
          JLabel er2 = new JLabel(n);
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
			if(DatabaseFinalV3.getsecondWindowIsOpne(7)==true)
			{
              changeDetails.closeChangeDetailsFrame();
              DatabaseFinalV3.setsecondWindowIsOpne(7,false);
          }   
      }
      
      public static String getSelectedName(int index)
      {
    	  return Contacts.get(index).name;
      }
      
      public static String getSelectedItem(int index, String str)
      {
    	  String ans = "";
    	  switch(str)
    	  {
    	  	case "name":ans = Contacts.get(index).name;break;
    	  	case "lName":ans = Contacts.get(index).lName;break;
    	  	case "fName":ans = Contacts.get(index).fName;break;
    	  	case "contact":ans = Contacts.get(index).contact;break;
    	  	case "StuID":ans = Contacts.get(index).StuID;break;
    	  	case "emad":ans = Contacts.get(index).emad;break;
    	  	case "PPSN":ans = Contacts.get(index).PPSN;break;
    	  	case "addr1":ans = Contacts.get(index).addr1;break;
    	  	case "addr2":ans = Contacts.get(index).addr2;break;
    	  	case "addr3":ans = Contacts.get(index).addr3;break;
    	  	default:ans = "Something wronf";break;
    	  }
    	  
    	  return ans;
      }
      
      public static int getContactSize()
      {
    	  return Contacts.size();
      }
      
      public static void removeContact(int index)
      {
    	  Contacts.remove(index);
      }

	}
     