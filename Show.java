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
               	
						System.out.println("Show button pressed");
						String myText = GlobalValues.getName();//text.getText();
						int s = 0;
						boolean tr = true;
						for(int i=0;i<Data.getContactSize();i++)
						{
							String tempN = Data.getSelectedItem(i, "name");// Data.Contacts.get(i).name;
							if(myText.equals(tempN))
							{
								//Temp.Temp(i);
								System.out.println("i erteke " + i);
								System.out.println(myText.equalsIgnoreCase(Data.getSelectedItem(i, "name")));//Data.Contacts.get(i).name));
								s = i;
							}
						}
						ShowSearch.ShowSearch(s);
						System.out.println("Mytext is " + myText + "  position  " + s);
					//	showMethodClass.closeSearchF();
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
               	
                   System.out.println("Show button pressed");
                   String myText = GlobalValues.getName();//text.getText();
                   int s = 0;
                   boolean tr = true;
                   for(int i=0;i<Data.getContactSize();i++)
					{
                       String tempN = Data.getSelectedItem(i, "name");//Data.Contacts.get(i).name;
                       if(myText.equals(tempN))
						{
							//Temp.Temp(i);
							System.out.println("i erteke " + i);
							System.out.println( myText.equalsIgnoreCase(Data.getSelectedItem(i, "name")));
							s = i;
                       }
                   }
                   changeDetails.changeDetails(s);
                   System.out.println("Mytext is " + myText + "  position  " + s);
               }
           }
           //See.closeChangeFrame();
        //   See.closeFrameShow();
           DatabaseFinalV3.setsecondWindowIsOpne(0, false);//secondWindowIsOpne = false;

       }
   }