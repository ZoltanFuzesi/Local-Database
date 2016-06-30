package Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Show implements ActionListener
	{

       public void actionPerformed(ActionEvent e)
		{
           String command = e.getActionCommand();
           if (command.equals("Show Details"))
				{
					if(Data.getContactSize()==0||GlobalValues.getName().equalsIgnoreCase(""))
					{
						//do nothing if the database empty
						JOptionPane.showMessageDialog(null, "Empty database or empty selected");
					}
					else if(Data.getContactSize()>0)
					{
 
						String myText = GlobalValues.getName();//text.getText();
						
						int s = 0;
						boolean tr = true;
						for(int i=0;i<Data.getContactSize();i++)
						{
							String tempN = Data.getSelectedItem(i, "name");// Data.Contacts.get(i).name;
							if(myText.equals(tempN))
							{;
								s = i;
							}
						}
						ShowSearch.ShowSearch(s);
						DatabaseFinalV3.setsecondWindowIsOpne(4, false);//secondWindowIsOpne4 = false;
						
               }
           }
           else if (command.equals("Show"))
			{
               if(Data.getContactSize()==0||GlobalValues.getName().equalsIgnoreCase(""))
				{
            	   JOptionPane.showMessageDialog(null, "Please choose a name");
               }
               else if(Data.getContactSize()>0&&!GlobalValues.getName().equalsIgnoreCase(""))
               {
                   String myText = GlobalValues.getName();//text.getText();
                   int s = 0;
                   boolean tr = true;
                   for(int i=0;i<Data.getContactSize();i++)
					{
                       String tempN = Data.getSelectedItem(i, "name");//Data.Contacts.get(i).name;
                       if(myText.equals(tempN))
						{
							s = i;
                       }
                   }
                   changeDetails.changeDetails(s);
               }
           }
           DatabaseFinalV3.setsecondWindowIsOpne(0, false);//secondWindowIsOpne = false;

       }
   }