package Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mentes implements ActionListener 
{
    public void actionPerformed (ActionEvent e)
	{
        String command = e.getActionCommand();
        if (command.equals("Save")) 
		{

        }
    } 

    public static void Mentes(String name)throws IOException
	{
    	
    	int i = 0;
 
        	for(int j = 0;j<Data.getContactSize();j++)
        	{
        		if(name.equalsIgnoreCase(Data.getSelectedName(i)))
        		{
        			i = j;
        		}
        	}
        	
            PrintWriter out = new PrintWriter("C:\\Database\\" + name + ".txt");
            out.println(GlobalValues.getFullName());//Data.getSelectedItem(i, "name"));//Data.Contacts.get(i).name);
            out.println(GlobalValues.getFirstName());//Data.getSelectedItem(i, "fName"));//Data.Contacts.get(i).fName);
            out.println(GlobalValues.getLastName());//Data.getSelectedItem(i, "lName"));//Data.Contacts.get(i).lName);
            out.println(GlobalValues.getAddress1());//Data.getSelectedItem(i, "addr1"));//Data.Contacts.get(i).addr1);
            out.println(GlobalValues.getAddress2());//Data.getSelectedItem(i, "addr2"));//Data.Contacts.get(i).addr2);
            out.println(GlobalValues.getAddress3());//Data.getSelectedItem(i, "addr3"));//Data.Contacts.get(i).addr3);
            out.println(GlobalValues.getPPSNumber());//Data.getSelectedItem(i, "PPSN"));//Data.Contacts.get(i).PPSN);
            out.println(GlobalValues.getStudentId());//Data.getSelectedItem(i, "StuID"));//Data.Contacts.get(i).StuID);
            out.println(GlobalValues.getContactNumber());//Data.getSelectedItem(i, "contact"));//Data.Contacts.get(i).contact);
            out.println(GlobalValues.getEmail());//Data.getSelectedItem(i, "emad"));//Data.Contacts.get(i).emad);
            out.close();
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            // Get the date today using Calendar object.
            Date today = Calendar.getInstance().getTime();        
            // Using DateFormat format method we can create a string 
            // representation of a date with the defined format.
            String reportDate = df.format(today);

            PrintWriter out1 = new PrintWriter("C:\\Database_Backup\\" + name  +".txt");
            out1.println(GlobalValues.getFullName());//Data.getSelectedItem(i, "name"));//Data.Contacts.get(i).name);
            out1.println(GlobalValues.getFirstName());//Data.getSelectedItem(i, "fName"));//Data.Contacts.get(i).fName);
            out1.println(GlobalValues.getLastName());//Data.getSelectedItem(i, "lName"));//Data.Contacts.get(i).lName);
            out1.println(GlobalValues.getAddress1());//Data.getSelectedItem(i, "addr1"));//Data.Contacts.get(i).addr1);
            out1.println(GlobalValues.getAddress2());//Data.getSelectedItem(i, "addr2"));//Data.Contacts.get(i).addr2);
            out1.println(GlobalValues.getAddress3());//Data.getSelectedItem(i, "addr3"));//Data.Contacts.get(i).addr3);
            out1.println(GlobalValues.getPPSNumber());//Data.getSelectedItem(i, "PPSN"));//Data.Contacts.get(i).PPSN);
            out1.println(GlobalValues.getStudentId());//Data.getSelectedItem(i, "StuID"));//Data.Contacts.get(i).StuID);
            out1.println(GlobalValues.getContactNumber());//Data.getSelectedItem(i, "contact"));//Data.Contacts.get(i).contact);
            out1.println(GlobalValues.getEmail());//Data.getSelectedItem(i, "emad"));//Data.Contacts.get(i).emad);
            out1.println("Date creadted " + reportDate);
            out1.close();
            System.gc();

    }    
    
 

}
