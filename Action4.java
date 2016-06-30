package Database;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Action4 implements ActionListener
		{
         private Object selectedFile;
         JFrame del;
         JFrame frameOK;
         public void actionPerformed(ActionEvent e)
			{
             String command = e.getActionCommand();
             ImageIcon pc = null;
             if (command.equals("Delete"))
				{
                  
                 if(GlobalValues.getName().equalsIgnoreCase(""))
                 {
                	 JOptionPane.showMessageDialog(null, "Please select a name");
                 }
                 else
                 {
                	 Action.closeFrame3();
                	 if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
                		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                		 String lab = GlobalValues.getName();
                		 String nameToPicture = lab;
                		 
	        				for(int i=0;i<Data.getContactSize();i++)
	        					{
	                             String tempHere = Data.getSelectedItem(i, "name");//Data.Contacts.get(i).name;
	                             if(nameToPicture.equalsIgnoreCase(tempHere))
	        						{
	                                 //delInt = i;
	                            	 GlobalValues.setDelInt(i);
	                            	 if(Delete.delete(GlobalValues.getDelInt()))
	                            		 JOptionPane.showMessageDialog(null, "Delete complete");
	                            	 else
	                            		 JOptionPane.showMessageDialog(null, "Can't delete something went wrong");
	                             }
	        					}
	                		} else {
	                		    // no action
	                		}
					
                 }
             }
         }
     }
 