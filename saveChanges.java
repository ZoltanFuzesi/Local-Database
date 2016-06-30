<<<<<<< HEAD
package Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class saveChanges implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		int positionToDelete = 0;
		See.closeFrameShow();
		File FileNamePictureDelete = null;
			changeDetails.setVariables();
            String delName = GlobalValues.getName();  
			File fileName = new File("C:\\Database\\" + delName + ".txt");
			
			 for(int i=0;i<Data.getContactSize();i++)
	            {
	            	if(Data.getSelectedItem(i, "name").equalsIgnoreCase(GlobalValues.getName()))
	            	{
	            		positionToDelete = i;
	            		i = Data.getContactSize();
	            		System.gc();
	            	}
	            }
			
			String fn = GlobalValues.getFirstName();
			String ln = GlobalValues.getLastName();
			String a1 = GlobalValues.getAddress1(); 
			String a2 = GlobalValues.getAddress2();
			String a3 = GlobalValues.getAddress3();
			String PPS = GlobalValues.getPPSNumber();
			String sID = GlobalValues.getStudentId();
			String c = GlobalValues.getContactNumber();
			String ema = GlobalValues.getEmail();
			String n = fn + " " + ln;
			String newName = fn + " " + ln;
			
			if(deleteCheck.getDeletedName(newName))
			{
			Data.removeContact(positionToDelete);
			Data.addData(n, fn, ln, a1, a2, a3, PPS, sID, c, ema);
			String path = "C:\\Database_Images\\";    
			
				if(new File(path + delName + ".jpg").isFile())
				{
						FileNamePictureDelete = new File(path + delName + ".jpg");	
				}
				else
				{

				}
           if(delName.equalsIgnoreCase(newName))
           {       	
        	   try {
				Mentes.Mentes(newName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   		 
           }
           else
           {
				try 
				{
                   
                   if(FileNamePictureDelete!=null)
                   {
                	   Files.copy(FileNamePictureDelete.toPath(),                           ///copy file to directory to selected name
                   (new File(path + n +".jpg")).toPath(),
                   StandardCopyOption.REPLACE_EXISTING);
   
                		   FileNamePictureDelete.delete(); 
                		   JOptionPane.showMessageDialog(null, "The picture has updated to the new name");
 
                   }
               } catch (IOException ex)
				{
                   Logger.getLogger(DatabaseFinalV3.class.getName()).log(Level.SEVERE, null, ex);
               }                  
				Delete.deleteHelperForChange(delName);                
			try 
			{
				Mentes.Mentes(newName);
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
			 
		}
       
			}
			else
			{
				JOptionPane.showMessageDialog(null, "The user " + newName +" name already has changed!\n Please restart the appplication if you want to change back the name!");
			}
			if(!delName.equalsIgnoreCase(newName))
			    deleteCheck.addchangedUser(delName);
	}
		
	

}
	/*

*/
=======
package Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class saveChanges implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		See.closeFrameShow();
		File FileNamePictureDelete = null;
			changeDetails.setVariables();
            String delName = GlobalValues.getName();  
            System.out.println("Selected to delete " + delName);
			File fileName = new File("C:\\Database\\" + delName + ".txt");
			fileName.delete();
			 for(int i=0;i<Data.getContactSize();i++)
	            {
	            	if(Data.getSelectedItem(i, "name").equalsIgnoreCase(GlobalValues.getName()))
	            	{
	            		System.out.println("Deleteing " + Data.getSelectedItem(i, "name"));
	            		Data.removeContact(i);
	            		i = Data.getContactSize();
	            		//System.gc();
	            	}
	            }
			
			String fn = GlobalValues.getFirstName();
			String ln = GlobalValues.getLastName();
			String a1 = GlobalValues.getAddress1(); 
			String a2 = GlobalValues.getAddress2();
           String a3 = GlobalValues.getAddress3();
			String PPS = GlobalValues.getPPSNumber();
			String sID = GlobalValues.getStudentId();
			String c = GlobalValues.getContactNumber();
           String ema = GlobalValues.getEmail();
           String n = fn + " " + ln;
           String newName = fn + " " + ln;
           Data.Data(n, fn, ln, a1, a2, a3, PPS, sID, c, ema);
			String path = "C:\\Database_Images\\";    
			
				if(new File(path + delName + ".jpg").isFile())
						FileNamePictureDelete = new File(path + delName + ".jpg");	
        /*   if(delName.equalsIgnoreCase(newName))
			{
               
           }
           else
			{*/
              fileName.delete();
             
				try 
				{
                   
                   System.out.println("CopyDirectory Called out");
                   if(FileNamePictureDelete!=null)
                   {
                	   Files.copy(FileNamePictureDelete.toPath(),                           ///copy file to directory to selected name
                   (new File(path + n +".jpg")).toPath(),
                   StandardCopyOption.REPLACE_EXISTING);
                	   System.out.println("Filename to string " + FileNamePictureDelete.toString());
                	   if(FileNamePictureDelete.toString().equalsIgnoreCase(path + n  + ".jpg"))
                	   {
                		   //do nothing
                	   }
                	   else
                	   {
                		   //delete picture
                		   FileNamePictureDelete.delete(); 
                		   JOptionPane.showMessageDialog(null, "The picture has updated to the new name");
                	   }
					
/*                 Files.copy(selectedFile.toPath(),                           ///copy file to directory to selected name
                 (new File(pathPicture + t +".jpg")).toPath(),
                 StandardCopyOption.REPLACE_EXISTING);*/
                   }
               } catch (IOException ex)
				{
                   Logger.getLogger(DatabaseFinalV3.class.getName()).log(Level.SEVERE, null, ex);
               }                  
         
				System.out.println("Save change button pressed");                   
			try 
			{
				Mentes.Mentes(newName);
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
			 
		//}
       
       }
		
	

}
>>>>>>> origin/master
